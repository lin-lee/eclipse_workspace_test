/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */


package sun.tools.javap;

import java.util.*;
import java.io.*;

/**
 * Stores exception table data in code attribute.
 *
 * @author  Sucheta Dambalkar (Adopted code from jdis)
 */
class TrapData {
    short start_pc, end_pc, handler_pc, catch_cpx;
  int num;
    
     
    /**
     * Read and store exception table data in code attribute.
     */
    public TrapData(DataInputStream in, int num) throws IOException {
	this.num=num;
	start_pc = in.readShort();
	end_pc=in.readShort();
	handler_pc=in.readShort();
	catch_cpx=in.readShort();
    }
    
    /**
     * returns recommended identifier
     */
    public String ident() {
	return "t"+num;
    }
    
}
