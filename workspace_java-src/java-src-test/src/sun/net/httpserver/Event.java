/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package sun.net.httpserver;

import com.sun.net.httpserver.*;
import com.sun.net.httpserver.spi.*;

class Event {

    ExchangeImpl exchange;

    protected Event (ExchangeImpl t) {
	this.exchange = t;
    }
}

class WriteFinishedEvent extends Event {
    WriteFinishedEvent (ExchangeImpl t) {
	super (t);
    }
}
