/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright (c) 1997, 2009, Oracle and/or its affiliates. All rights reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License. You can obtain
 * a copy of the License at https://glassfish.dev.java.net/public/CDDL+GPL.html
 * or glassfish/bootstrap/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at glassfish/bootstrap/legal/LICENSE.txt.
 * Sun designates this particular file as subject to the "Classpath" exception
 * as provided by Sun in the GPL Version 2 section of the License file that
 * accompanied this code.  If applicable, add the following below the License
 * Header, with the fields enclosed by brackets [] replaced by your own
 * identifying information: "Portions Copyrighted [year]
 * [name of copyright owner]"
 * 
 * Contributor(s):
 * 
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.sun.xml.internal.stream.util;

import java.lang.ref.*;

/**
 * Buffer allocator for buffers of sizes 128 B, 2 KB and 8 KB. Includes
 * methods for allocating and freeing buffers.
 *
 * @author Binu.John@sun.com
 * @author Santiago.PericasGeertsen@sun.com
 */
public class BufferAllocator {
    public static int SMALL_SIZE_LIMIT = 128;
    public static int MEDIUM_SIZE_LIMIT = 2048;
    public static int LARGE_SIZE_LIMIT = 8192;
    
    char[] smallCharBuffer;
    char[] mediumCharBuffer;
    char[] largeCharBuffer;
    
    byte[] smallByteBuffer;
    byte[] mediumByteBuffer;
    byte[] largeByteBuffer;
    
    public BufferAllocator() {
    }
    
    public char[] getCharBuffer(int size) {
        if (size <= SMALL_SIZE_LIMIT) {
            char[] buffer = smallCharBuffer;
            smallCharBuffer = null;
            return buffer;
        } 
        else if (size <= MEDIUM_SIZE_LIMIT) {
            char[] buffer = mediumCharBuffer;
            mediumCharBuffer = null;
            return buffer;
        } 
        else if (size <= LARGE_SIZE_LIMIT) {
            char[] buffer = largeCharBuffer;
            largeCharBuffer = null;
            return buffer;
        }
        return null;
    }
    
    public void returnCharBuffer(char[] c) {
        if (c == null) {
            return;
        }
        if (c.length <= SMALL_SIZE_LIMIT) {
            smallCharBuffer = c;
        }
        else if (c.length <= MEDIUM_SIZE_LIMIT) {
            mediumCharBuffer = c;
        }
        else if (c.length <= LARGE_SIZE_LIMIT) {
            largeCharBuffer = c;
        }
    }
    
    public byte[] getByteBuffer(int size) {
        if (size <= SMALL_SIZE_LIMIT) {
            byte[] buffer = smallByteBuffer;
            smallByteBuffer = null;
            return buffer;
        } 
        else if (size <= MEDIUM_SIZE_LIMIT) {
            byte[] buffer = mediumByteBuffer;
            mediumByteBuffer = null;
            return buffer;
        } 
        else if (size <= LARGE_SIZE_LIMIT) {
            byte[] buffer = largeByteBuffer;
            largeByteBuffer = null;
            return buffer;
        }        
        return null;
    }
    
    public void returnByteBuffer(byte[] b) {
        if (b == null) {
            return;
        }
        if (b.length <= SMALL_SIZE_LIMIT) {
            smallByteBuffer = b;
        }
        else if (b.length <= MEDIUM_SIZE_LIMIT) {
            mediumByteBuffer = b;
        }
        else if (b.length <= LARGE_SIZE_LIMIT) {
            largeByteBuffer = b;
        }
    }
    
}
