/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.tools.jdwpgen;

import java.util.*;

class ThreadObjectTypeNode extends ObjectTypeNode {

    String docType() {
        return "threadID";
    }

    String javaType() {
        return "ThreadReferenceImpl";
    }

    String javaRead() {
        return "ps.readThreadReference()";
    }
}