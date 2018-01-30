/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the "License").  You may not use this file except
 * in compliance with the License.
 *
 * You can obtain a copy of the license at
 * https://jaxp.dev.java.net/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * HEADER in each file and include the License file at
 * https://jaxp.dev.java.net/CDDLv1.0.html
 * If applicable add the following below this CDDL HEADER
 * with the fields enclosed by brackets "[]" replaced with
 * your own identifying information: Portions Copyright
 * [year] [name of copyright owner]
 */

/*
 * $Id: NamedEvent.java,v 1.2 2005/11/03 17:23:30 jeffsuttor Exp $
 * @(#)NamedEvent.java	1.1 05/12/02
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.events ;

import javax.xml.namespace.QName;
/**
 *
 *@author Neeraj Bajaj, Sun Microsystems
 *
 */
public class NamedEvent extends DummyEvent {
    
    private QName name;
    
    public NamedEvent() {
    }
    
    
    public NamedEvent(QName qname) {
        this.name = qname;
    }
    
    
    public NamedEvent(String prefix, String uri, String localpart) {
        this.name = new QName(uri, localpart, prefix);
    }
    
    public String getPrefix() {
        return this.name.getPrefix();
    }
    
    
    public QName getName() {
        return name;
    }
    
    public void setName(QName qname) {
        this.name = qname;
    }
    
    public String nameAsString() {
        if("".equals(name.getNamespaceURI()))
            return name.getLocalPart();
        if(name.getPrefix() != null)
            return "['" + name.getNamespaceURI() + "']:" + getPrefix() + ":" + name.getLocalPart();
        else
            return "['" + name.getNamespaceURI() + "']:" + name.getLocalPart();
    }
    
    public String getNamespace(){
        return name.getNamespaceURI();
    }

    protected void writeAsEncodedUnicodeEx(java.io.Writer writer) 
    throws java.io.IOException
    {
        writer.write(nameAsString());
    }    
    
}
