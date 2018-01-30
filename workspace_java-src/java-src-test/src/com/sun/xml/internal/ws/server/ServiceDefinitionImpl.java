/*
 * Copyright (c) 1997, 2008, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.xml.internal.ws.server;

import com.sun.istack.internal.NotNull;
import com.sun.xml.internal.ws.api.server.SDDocument;
import com.sun.xml.internal.ws.api.server.SDDocumentFilter;
import com.sun.xml.internal.ws.api.server.ServiceDefinition;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * {@link ServiceDefinition} implementation.
 *
 * <p>
 * You construct a {@link ServiceDefinitionImpl} by first constructing
 * a list of {@link SDDocumentImpl}s.
 *
 * @author Kohsuke Kawaguchi
 */
public final class ServiceDefinitionImpl implements ServiceDefinition {
    private final List<SDDocumentImpl> docs;

    private final Map<String,SDDocumentImpl> bySystemId;
    private final @NotNull SDDocumentImpl primaryWsdl;

    /**
     * Set when {@link WSEndpointImpl} is created.
     */
    /*package*/ WSEndpointImpl<?> owner;

    /*package*/ final List<SDDocumentFilter> filters = new ArrayList<SDDocumentFilter>();

    /**
     * @param docs
     *      List of {@link SDDocumentImpl}s to form the description.
     *      There must be at least one entry.
     *      The first document is considered {@link #getPrimary() primary}.
     */
    public ServiceDefinitionImpl(List<SDDocumentImpl> docs, @NotNull SDDocumentImpl primaryWsdl) {
        assert docs.contains(primaryWsdl);
        this.docs = docs;
        this.primaryWsdl = primaryWsdl;

        this.bySystemId = new HashMap<String, SDDocumentImpl>(docs.size());
        for (SDDocumentImpl doc : docs) {
            bySystemId.put(doc.getURL().toExternalForm(),doc);

            assert doc.owner==null;
            doc.owner = this;
        }
    }

    /**
     * The owner is set when {@link WSEndpointImpl} is created.
     */
    /*package*/ void setOwner(WSEndpointImpl<?> owner) {
        assert owner!=null && this.owner==null;
        this.owner = owner;
    }

    public @NotNull SDDocument getPrimary() {
        return primaryWsdl;
    }

    public void addFilter(SDDocumentFilter filter) {
        filters.add(filter);
    }

    public Iterator<SDDocument> iterator() {
        return (Iterator)docs.iterator();
    }

    /**
     * @see #getBySystemId(String)
     */
    public SDDocument getBySystemId(URL systemId) {
        return getBySystemId(systemId.toString());
    }

    /**
     * Gets the {@link SDDocumentImpl} whose {@link SDDocumentImpl#getURL()}
     * returns the specified value.
     *
     * @return
     *      null if none is found.
     */
    public SDDocumentImpl getBySystemId(String systemId) {
        return bySystemId.get(systemId);
    }
}
