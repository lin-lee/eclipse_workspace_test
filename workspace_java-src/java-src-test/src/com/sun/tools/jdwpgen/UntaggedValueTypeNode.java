/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.tools.jdwpgen;

import java.util.*;
import java.io.*;

class UntaggedValueTypeNode extends ValueTypeNode {

    String docType() {
        return "untagged-value";
    }

    public void genJavaWrite(PrintWriter writer, int depth, 
                             String writeLabel) {
        genJavaDebugWrite(writer, depth, writeLabel);
        indent(writer, depth);
        writer.println("ps.writeUntaggedValue(" + writeLabel + ");");
    }

    String javaRead() {
        return "ps.readUntaggedValue()";
    }
}
