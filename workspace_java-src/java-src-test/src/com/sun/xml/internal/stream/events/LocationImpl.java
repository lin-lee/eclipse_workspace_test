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
 * $Id: LocationImpl.java,v 1.2 2005/11/03 17:23:29 jeffsuttor Exp $
 * %W% %E%
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.events;

import javax.xml.stream.Location;

/**
 *Implementation of Location interface to be used by
 *event readers.
 *@author Neeraj.bajaj@sun.com,k.venugopal@sun.com
 */
public class LocationImpl implements Location{
    String systemId;
    String publicId;
    int colNo;
    int lineNo;
    int charOffset;
    LocationImpl(Location loc){
        systemId = loc.getSystemId();
        publicId = loc.getPublicId();
        lineNo = loc.getLineNumber();
        colNo = loc.getColumnNumber();
        charOffset = loc.getCharacterOffset();
    }
    
    public int getCharacterOffset(){
        return charOffset;
    }
    
    public int getColumnNumber() {
        return colNo;
    }
    
    public int getLineNumber(){
        return lineNo;
    }
    
    public String getPublicId(){
        return publicId;
    }
    
    public String getSystemId(){
        return systemId;
    }
    
    public String toString(){
        StringBuffer sbuffer = new StringBuffer() ;
        sbuffer.append("Line number = " + getLineNumber());
        sbuffer.append("\n") ;
        sbuffer.append("Column number = " + getColumnNumber());
        sbuffer.append("\n") ;
        sbuffer.append("System Id = " + getSystemId());
        sbuffer.append("\n") ;
        sbuffer.append("Public Id = " + getPublicId());
        sbuffer.append("\n") ;
        sbuffer.append("CharacterOffset = " + getCharacterOffset());
        sbuffer.append("\n") ;
        return sbuffer.toString();
    }
    
}

