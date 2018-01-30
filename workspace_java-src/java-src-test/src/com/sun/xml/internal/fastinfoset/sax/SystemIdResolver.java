/*
 * Fast Infoset ver. 0.1 software ("Software")
 * 
 * Copyright, 2004-2005 Sun Microsystems, Inc. All Rights Reserved. 
 * 
 * Software is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at:
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations.
 * 
 *    Sun supports and benefits from the global community of open source
 * developers, and thanks the community for its important contributions and
 * open standards-based technology, which Sun has adopted into many of its
 * products.
 * 
 *    Please note that portions of Software may be provided with notices and
 * open source licenses from such communities and third parties that govern the
 * use of those portions, and any licenses granted hereunder do not alter any
 * rights and obligations you may have under such open source licenses,
 * however, the disclaimer of warranty and limitation of liability provisions
 * in this License will apply to all Software in this distribution.
 * 
 *    You acknowledge that the Software is not designed, licensed or intended
 * for use in the design, construction, operation or maintenance of any nuclear
 * facility.
 *
 * Apache License
 * Version 2.0, January 2004
 * http://www.apache.org/licenses/
 *
 */ 


package com.sun.xml.internal.fastinfoset.sax;

import java.io.*;

public class SystemIdResolver {
    
    public SystemIdResolver() {
    }
    
    public static String getAbsoluteURIFromRelative(String localPath) {
        if (localPath == null || localPath.length() == 0) {
            return "";
        }
        
        String absolutePath = localPath;
        if (!isAbsolutePath(localPath)) {
            try {
                absolutePath = getAbsolutePathFromRelativePath(localPath);
            }
            catch (SecurityException se) {
                return "file:" + localPath;
            }
        }
        
        String urlString;
        if (null != absolutePath) {
            urlString = absolutePath.startsWith(File.separator) ?
                ("file://" + absolutePath) :
                ("file:///" + absolutePath);
        }
        else {
            urlString = "file:" + localPath;
        }
        
        return replaceChars(urlString);
    }
    
    private static String getAbsolutePathFromRelativePath(String relativePath) {
        return new File(relativePath).getAbsolutePath();
    }
    
    public static boolean isAbsoluteURI(String systemId) {
        if (systemId == null) {
            return false;
        }
        
        if (isWindowsAbsolutePath(systemId)) {
            return false;
        }
        
        final int fragmentIndex = systemId.indexOf('#');
        final int queryIndex = systemId.indexOf('?');
        final int slashIndex = systemId.indexOf('/');
        final int colonIndex = systemId.indexOf(':');
        
        int index = systemId.length() -1;
        if (fragmentIndex > 0) {
            index = fragmentIndex;
        }
        if (queryIndex > 0 && queryIndex < index) {
            index = queryIndex;
        }
        if (slashIndex > 0 && slashIndex <index) {
            index = slashIndex;
        }
        return (colonIndex > 0) && (colonIndex < index);        
    }
    
    public static boolean isAbsolutePath(String systemId) {
        if(systemId == null)
            return false;
        final File file = new File(systemId);
        return file.isAbsolute();
        
    }
    
    private static boolean isWindowsAbsolutePath(String systemId) {
        if(!isAbsolutePath(systemId))
            return false;
        if (systemId.length() > 2
        && systemId.charAt(1) == ':'
        && Character.isLetter(systemId.charAt(0))
        && (systemId.charAt(2) == '\\' || systemId.charAt(2) == '/'))
            return true;
        else
            return false;
    }
    
    private static String replaceChars(String str) {
        StringBuffer buf = new StringBuffer(str);
        int length = buf.length();
        for (int i = 0; i < length; i++) {
            char currentChar = buf.charAt(i);
            // Replace space with "%20"
            if (currentChar == ' ') {
                buf.setCharAt(i, '%');
                buf.insert(i+1, "20");
                length = length + 2;
                i = i + 2;
            }
            // Replace backslash with forward slash
            else if (currentChar == '\\') {
                buf.setCharAt(i, '/');
            }
        }
        
        return buf.toString();
    }
    
    public static String getAbsoluteURI(String systemId) {
        String absoluteURI = systemId;
        if (isAbsoluteURI(systemId)) {
            if (systemId.startsWith("file:")) {
                String str = systemId.substring(5);
                
                if (str != null && str.startsWith("/")) {
                    if (str.startsWith("///") || !str.startsWith("//")) {
                        int secondColonIndex = systemId.indexOf(':', 5);
                        if (secondColonIndex > 0) {
                            String localPath = systemId.substring(secondColonIndex-1);
                            try {
                                if (!isAbsolutePath(localPath))
                                    absoluteURI = systemId.substring(0, secondColonIndex-1) +
                                    getAbsolutePathFromRelativePath(localPath);
                            }
                            catch (SecurityException se) {
                                return systemId;
                            }
                        }
                    }
                }
                else {
                    return getAbsoluteURIFromRelative(systemId.substring(5));
                }
                
                return replaceChars(absoluteURI);
            }
            else  {
                return systemId;
            }
        }
        else {
            return getAbsoluteURIFromRelative(systemId);
        }
    }
}
