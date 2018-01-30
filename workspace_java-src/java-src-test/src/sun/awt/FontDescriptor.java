/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package sun.awt;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import sun.nio.cs.HistoricallyNamedCharset;

public class FontDescriptor implements Cloneable {

    static {
        NativeLibLoader.loadLibraries();
        initIDs();
    }

    String nativeName;
    public CharsetEncoder encoder;
    String charsetName;
    private int[] exclusionRanges;
 
    public FontDescriptor(String nativeName, CharsetEncoder encoder,
			  int[] exclusionRanges){

	this.nativeName = nativeName;
	this.encoder = encoder;
	this.exclusionRanges = exclusionRanges;
	this.useUnicode = false;
        Charset cs = encoder.charset();
        if (cs instanceof HistoricallyNamedCharset)
	    this.charsetName = ((HistoricallyNamedCharset)cs).historicalName();
	else
	    this.charsetName = cs.name();

    }
    
    public String getNativeName() {
        return nativeName;
    }

    public CharsetEncoder getFontCharsetEncoder() {
        return encoder;
    }

    public String getFontCharsetName() {
        return charsetName;
    }

    public int[] getExclusionRanges() {
        return exclusionRanges;
    }

    /**
     * Return true if the character is exclusion character.
     */
    public boolean isExcluded(char ch){
	for (int i = 0; i < exclusionRanges.length; ){

	    int lo = (exclusionRanges[i++]);
	    int up = (exclusionRanges[i++]);

	    if (ch >= lo && ch <= up){
		return true;
	    }
	}
	return false;
    }

    public String toString() {
	return super.toString() + " [" + nativeName + "|" + encoder + "]";
    }

    /**
     * Initialize JNI field and method IDs
     */
    private static native void initIDs();


    public CharsetEncoder unicodeEncoder;
    boolean useUnicode; // set to true from native code on Unicode-based systems
   
    public boolean useUnicode() {
        if (useUnicode && unicodeEncoder == null) {
            try {
		this.unicodeEncoder = isLE? 
		    Charset.forName("UTF_16LE").newEncoder():
		    Charset.forName("UTF_16BE").newEncoder();
	    } catch (IllegalArgumentException x) {}
 	}
        return useUnicode;
    }
    static boolean isLE;
    static {
	String enc = (String) java.security.AccessController.doPrivileged(
           new sun.security.action.GetPropertyAction("sun.io.unicode.encoding",
							  "UnicodeBig"));
        isLE = !"UnicodeBig".equals(enc);
    }
}

