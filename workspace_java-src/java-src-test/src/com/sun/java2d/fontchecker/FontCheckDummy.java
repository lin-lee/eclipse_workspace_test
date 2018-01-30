/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.java2d.fontchecker;

import java.awt.*;
import java.awt.image.*;  
import java.io.*; 

/** 
 * FontCheckDummy (not unlike Crash Test Dummy).
 * 
 * <PRE>
 * FontCheckDummy is the "child" process. Its task is to verify 
 * integrity of system fonts. Since unexpected crashes are known 
 * to occur when certain fonts are manipulated, the process is 
 * "monitored" by the parent process, which might have to restart 
 * the "child" if it crashes.
 * </PRE>
 *
 * @author Ilya Bagrak
 */
public class FontCheckDummy implements FontCheckerConstants {

    /**
     * Input stream from parent process. 
     */ 
    private BufferedReader is; 
    
    /**
     * Output stream to parent process. 
     */ 
    private BufferedOutputStream os;
    
    /**
     * Image on which font characters will be drawn.  
     */ 
    private BufferedImage bi; 
    
    /**
     * graphics object on which characters will be drawn. 
     */ 
    private Graphics graphics; 

    /**
     * This constructor wraps the process's standard output and input streams
     * to enable easier communication with parent process. It also initializes 
     * the graphics object used for drawing font characters. 
     * <BR><BR>
     * @see FontCheckerConstants
     */ 
    public FontCheckDummy() {
	is = new BufferedReader(new InputStreamReader(System.in)); 
	os = new BufferedOutputStream(System.out); 
	/* make suffficient space for 12 point font */ 
	bi = new BufferedImage(40, 40, BufferedImage.TYPE_INT_RGB); 
	graphics = bi.getGraphics();
	try {
	    os.write(CHILD_STARTED_OK);
	    os.flush();
	} catch (IOException e) {
	    System.exit(-1);
	}  
    }
    
    /**
     * Initializes an instance of Font from given font path. 
     * <BR>
     * This methods attempts to create an instance of font from
     * a string that represents path to the font file. 
     * <BR><BR>
     * @param fontPath string representing path to font file
     * @param flag indicating whether or not checking of non-TrueType fonts 
     * is necessary
     */ 
    private void testFont(String fontPath, boolean checkNonTTF) {
	
	FontFileFilter fff = new FontFileFilter(checkNonTTF);
	File fontFile = new File(fontPath);
	if (!fontFile.canRead()) {
	    try {
		os.write(ERR_FONT_NOT_FOUND);
		os.flush();
	    } catch (IOException e) {
		System.exit(-1);
	    }
	}
        Font font = null;
        try {
	    File file = new File(fontPath);
            font = Font.createFont(fff.getFontType(fontPath), file);
        } catch (FontFormatException e1) {
        } catch (IOException e2) {
        }
        if (font == null) {
             return;
        }
	font = font.deriveFont(Font.PLAIN, 12);
	String name = font.getFontName();
	String family = font.getFamily();

	char[] testChars = { '0' }; 
	if (font.canDisplay(testChars[0])) {
	    graphics.setFont(font); 
	    graphics.drawChars(testChars, 0, 1, 20, 20); 
	}
	try {
	    os.write(ERR_FONT_OK);
	    os.flush();
	} catch (IOException e) {
	    System.exit(-1);
	}
    }

    /**
     * Begins synchronous communication betweeen parent and child processes. 
     * <BR>
     * This method begins communication between parent and child processes. 
     * FontCheckDummy reads a line of text from input stream (@see #is). 
     */ 
    public void run() {
	String command = null;
	while (true) {
	    try {
		command = is.readLine(); 	    
	    } catch (IOException e) {
		System.exit(-1);
	    }
	    if (command != null && command.length() >= 1) {
		int cmd = Integer.parseInt(command.substring(0,1));
		if (cmd == EXITCOMMAND) {
		    return;
		}
		boolean checkNonTTF = ((cmd == 1) ? true : false); 
		String fontPath = command.substring(1);
		testFont(fontPath, checkNonTTF); 
	    } else {
		return;
	    }
 	}
    }

    public static void main(String[] args) {
	try {
	    /* Background app. */
	    System.setProperty("java.awt.headless", "true");
	    System.setProperty("sun.java2d.noddraw", "true");
	    new FontCheckDummy().run();
	} catch (Throwable t) {
	}
	System.exit(0);
    }
}
