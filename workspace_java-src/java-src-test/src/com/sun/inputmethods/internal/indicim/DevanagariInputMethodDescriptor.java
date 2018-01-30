/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/*
 * (C) Copyright IBM Corp. 2000 - All Rights Reserved
 *
 * The original version of this source code and documentation is
 * copyrighted and owned by IBM. These materials are provided
 * under terms of a License Agreement between IBM and Sun.
 * This technology is protected by multiple US and International
 * patents. This notice and attribution to IBM may not be removed.
 *
 */

package com.sun.inputmethods.internal.indicim;

import java.awt.Image;
import java.awt.im.spi.InputMethod;
import java.awt.im.spi.InputMethodDescriptor;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class DevanagariInputMethodDescriptor implements InputMethodDescriptor {

    static final Locale HINDI = new Locale("hi", "IN");

    public DevanagariInputMethodDescriptor() {
    }

    /**
     * @see java.awt.im.spi.InputMethodDescriptor#getAvailableLocales
     */
    public Locale[] getAvailableLocales() {
        return new Locale[] { HINDI };
    }

    /**
     * @see java.awt.im.spi.InputMethodDescriptor#hasDynamicLocaleList
     */
    public boolean hasDynamicLocaleList() {
        return false;
    }

    /**
     * @see java.awt.im.spi.InputMethodDescriptor#getInputMethodDisplayName
     */
    public synchronized String getInputMethodDisplayName(Locale inputLocale, Locale displayLanguage) {
	try {
	    ResourceBundle resources = ResourceBundle.getBundle("com.sun.inputmethods.internal.indicim.resources.DisplayNames", displayLanguage);
            return resources.getString("DisplayName.Devanagari");
	} catch (MissingResourceException mre) {
	    return "Devanagari Input Method";
	}
    }

    /**
     * @see java.awt.im.spi.InputMethodDescriptor#getInputMethodIcon
     */
    public Image getInputMethodIcon(Locale inputLocale) {
        return null;
    }

    /**
     * @see java.awt.im.spi.InputMethodDescriptor#createInputMethod
     */
    public InputMethod createInputMethod() throws Exception {
        IndicInputMethodImpl impl = new IndicInputMethodImpl(
            DevanagariTables.keyboardMap, 
	    DevanagariTables.joinWithNukta, 
	    DevanagariTables.nuktaForm, 
	    DevanagariTables.substitutionTable);
            
        return new IndicInputMethod(HINDI, impl);
    }

    public String toString() {
        return getClass().getName();
    }
}

