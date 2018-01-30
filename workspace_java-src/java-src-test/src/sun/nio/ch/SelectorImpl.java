/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package sun.nio.ch;

import java.io.IOException;
import java.nio.channels.*;
import java.nio.channels.spi.*;
import java.net.SocketException;
import java.util.*;
import sun.misc.*;


/**
 * Base Selector implementation class.
 */

abstract class SelectorImpl
    extends AbstractSelector
{

    // The set of keys with data ready for an operation
    protected Set selectedKeys;

    // The set of keys registered with this Selector
    protected HashSet keys;

    // Public views of the key sets
    private Set publicKeys;		// Immutable
    private Set publicSelectedKeys;	// Removal allowed, but not addition 

    protected SelectorImpl(SelectorProvider sp) {
	super(sp);
        keys = new HashSet();
        selectedKeys = new HashSet();
	if (Util.atBugLevel("1.4")) {
	    publicKeys = keys;
	    publicSelectedKeys = selectedKeys;
	} else {
	    publicKeys = Collections.unmodifiableSet(keys);
	    publicSelectedKeys = Util.ungrowableSet(selectedKeys);
	}
    }

    public Set keys() {
	if (!isOpen() && !Util.atBugLevel("1.4"))
	    throw new ClosedSelectorException();
        return publicKeys;
    }

    public Set selectedKeys() {
	if (!isOpen() && !Util.atBugLevel("1.4"))
	    throw new ClosedSelectorException();
        return publicSelectedKeys;
    }

    protected abstract int doSelect(long timeout) throws IOException;

    private int lockAndDoSelect(long timeout) throws IOException {
	synchronized (this) {
	    if (!isOpen())
		throw new ClosedSelectorException();
	    synchronized (publicKeys) {
		synchronized (publicSelectedKeys) {
		    return doSelect(timeout);
		}
	    }
        }
    }

    public int select(long timeout)
        throws IOException
    {
        if (timeout < 0)
            throw new IllegalArgumentException("Negative timeout");
	return lockAndDoSelect((timeout == 0) ? -1 : timeout);
    }

    public int select() throws IOException {
        return select(0);
    }

    public int selectNow() throws IOException {
	return lockAndDoSelect(0);
    }

    public void implCloseSelector() throws IOException {
        wakeup();
        synchronized (this) {
	    synchronized (publicKeys) {
		synchronized (publicSelectedKeys) {
		    implClose();
		}
	    }
	}
    }

    protected abstract void implClose() throws IOException;

    void putEventOps(SelectionKeyImpl sk, int ops) { }

    protected final SelectionKey register(AbstractSelectableChannel ch,
					  int ops,
					  Object attachment)
    {
	if (!(ch instanceof SelChImpl))
	    throw new IllegalSelectorException();
	SelectionKeyImpl k = new SelectionKeyImpl((SelChImpl)ch, this);
	k.attach(attachment);
	synchronized (publicKeys) {
	    implRegister(k);
	}
        k.interestOps(ops);
	return k;
    }

    protected abstract void implRegister(SelectionKeyImpl ski);

    void processDeregisterQueue() throws IOException {
	// Precondition: Synchronized on this, keys, and selectedKeys
	Set cks = cancelledKeys();
        synchronized (cks) {
            Iterator i = cks.iterator();
            while (i.hasNext()) {
		SelectionKeyImpl ski = (SelectionKeyImpl)i.next();
                try {
                    implDereg(ski);
                } catch (SocketException se) {
                    IOException ioe = new IOException(
                        "Error deregistering key");
                    ioe.initCause(se);
                    throw ioe;
                } finally {
                    i.remove();
                }
            }
        }
    }

    protected abstract void implDereg(SelectionKeyImpl ski) throws IOException;

    abstract public Selector wakeup();

}