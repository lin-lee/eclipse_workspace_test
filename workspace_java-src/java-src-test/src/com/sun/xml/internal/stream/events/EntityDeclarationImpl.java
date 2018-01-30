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
 * $Id: EntityDeclarationImpl.java,v 1.3 2005/11/03 17:23:31 jeffsuttor Exp $
 * @(#)EntityDeclarationImpl.java	1.1 05/12/02
 *
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 */

package com.sun.xml.internal.stream.events;

import javax.xml.stream.events.EntityDeclaration;
import javax.xml.stream.events.XMLEvent;
import com.sun.org.apache.xerces.internal.xni.XMLResourceIdentifier;

/**
 *
 * This class store all the information for a particular EntityDeclaration. EntityDeclaration interface
 * has various get* functiosn to retirve information about a particular EntityDeclaration.
 *
 * @author  Neeraj Bajaj, Sun Microsystems.
 */
public class EntityDeclarationImpl extends DummyEvent implements EntityDeclaration {
    
    private XMLResourceIdentifier fXMLResourceIdentifier ;
    private String fEntityName;
    private String fReplacementText;
    private String fNotationName;
    
    /** Creates a new instance of EntityDeclarationImpl */
    public EntityDeclarationImpl() {
        init();
    }
    
    public EntityDeclarationImpl(String entityName , String replacementText){
        this(entityName,replacementText,null);
        
    }
    
    public EntityDeclarationImpl(String entityName, String replacementText, XMLResourceIdentifier resourceIdentifier){
        init();
        fEntityName = entityName;
        fReplacementText = replacementText;
        fXMLResourceIdentifier = resourceIdentifier;
    }
    
    public void setEntityName(String entityName){
        fEntityName = entityName;
    }
    
    public String getEntityName(){
        return fEntityName;
    }
    
    public void setEntityReplacementText(String replacementText){
        fReplacementText = replacementText;
    }
    
    public void setXMLResourceIdentifier(XMLResourceIdentifier resourceIdentifier){
        fXMLResourceIdentifier = resourceIdentifier ;
    }
    
    public XMLResourceIdentifier getXMLResourceIdentifier(){
        return fXMLResourceIdentifier;
    }
    
    public String getSystemId(){
        if(fXMLResourceIdentifier != null)
            return fXMLResourceIdentifier.getLiteralSystemId();
        return null;
    }
    
    public String getPublicId(){
        if(fXMLResourceIdentifier != null)
            return fXMLResourceIdentifier.getPublicId();
        
        return null;
    }
    
    public String getBaseURI() {
        if(fXMLResourceIdentifier != null)
            return fXMLResourceIdentifier.getBaseSystemId();
        return null;
    }
    
    public String getName(){
        return fEntityName;
    }
    
    public String getNotationName() {
        return fNotationName;
    }
    
    public void setNotationName(String notationName){
        fNotationName = notationName;
    }
    
    public String getReplacementText() {
        return fReplacementText;
    }
    
    protected void init(){
        setEventType(XMLEvent.ENTITY_DECLARATION);
    }
    
    protected void writeAsEncodedUnicodeEx(java.io.Writer writer) 
    throws java.io.IOException
    {
        writer.write("<!ENTITY ");
        writer.write(fEntityName);
        if (fReplacementText != null) {
            //internal entity
            //escape quotes, lt and amps
            writer.write(" \"");
            charEncode(writer, fReplacementText);             
        } else {
            //external entity
            String pubId = getPublicId();
            if (pubId != null) {
                writer.write(" PUBLIC \"");
                writer.write(pubId);
            } else {
                writer.write(" SYSTEM \"");
                writer.write(getSystemId());
            }
        }
        writer.write("\"");
        if (fNotationName != null) {
            writer.write(" NDATA ");
            writer.write(fNotationName);
        }
        writer.write(">");
    }        
}
