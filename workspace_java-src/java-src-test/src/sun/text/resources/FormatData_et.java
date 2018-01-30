/*
 * %W% %E%
 */

/*
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/*
 * (C) Copyright Taligent, Inc. 1996, 1997 - All Rights Reserved
 * (C) Copyright IBM Corp. 1996 - 1998 - All Rights Reserved
 *
 * The original version of this source code and documentation
 * is copyrighted and owned by Taligent, Inc., a wholly-owned
 * subsidiary of IBM. These materials are provided under terms
 * of a License Agreement between Taligent and Sun. This technology
 * is protected by multiple US and International patents.
 *
 * This notice and attribution to Taligent may not be removed.
 * Taligent is a registered trademark of Taligent, Inc.
 *
 */

package sun.text.resources;

import java.util.ListResourceBundle;

public class FormatData_et extends ListResourceBundle {
    /**
     * Overrides ListResourceBundle
     */
    protected final Object[][] getContents() {
        return new Object[][] {
            { "MonthNames",
                new String[] {
                    "Jaanuar", // january
                    "Veebruar", // february
                    "M\u00e4rts", // march
                    "Aprill", // april
                    "Mai", // may
                    "Juuni", // june
                    "Juuli", // july
                    "August", // august
                    "September", // september
                    "Oktoober", // october
                    "November", // november
                    "Detsember", // december
                    "" // month 13 if applicable
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "Jaan", // abb january
                    "Veebr", // abb february
                    "M\u00e4rts", // abb march
                    "Apr", // abb april
                    "Mai", // abb may
                    "Juuni", // abb june
                    "Juuli", // abb july
                    "Aug", // abb august
                    "Sept", // abb september
                    "Okt", // abb october
                    "Nov", // abb november
                    "Dets", // abb december
                    "" // abb month 13 if applicable
                }
            },
            { "DayNames",
                new String[] {
                    "p\u00fchap\u00e4ev", // Sunday
                    "esmasp\u00e4ev", // Monday
                    "teisip\u00e4ev", // Tuesday
                    "kolmap\u00e4ev", // Wednesday
                    "neljap\u00e4ev", // Thursday
                    "reede", // Friday
                    "laup\u00e4ev" // Saturday
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "P", // abb Sunday
                    "E", // abb Monday
                    "T", // abb Tuesday
                    "K", // abb Wednesday
                    "N", // abb Thursday
                    "R", // abb Friday
                    "L" // abb Saturday
                }
            },
            { "Eras",
                new String[] { // era strings
                    "e.m.a.",
                    "m.a.j."
                }
            },
            { "NumberElements",
                new String[] {
                    ",", // decimal separator
                    "\u00a0", // group (thousands) separator
                    ";", // list separator
                    "%", // percent sign
                    "0", // native 0 digit
                    "#", // pattern digit
                    "-", // minus sign
                    "E", // exponential
                    "\u2030", // per mille
                    "\u221e", // infinity
                    "\ufffd" // NaN
                }
            },
            { "DateTimePatterns",
                new String[] {
                    "H:mm:ss z", // full time pattern
                    "H:mm:ss z", // long time pattern
                    "H:mm:ss", // medium time pattern
                    "H:mm", // short time pattern
                    "EEEE, d. MMMM yyyy", // full date pattern
                    "EEEE, d. MMMM yyyy. 'a'", // long date pattern
                    "d.MM.yyyy", // medium date pattern
                    "d.MM.yy", // short date pattern
                    "{1} {0}" // date-time pattern
                }
            },
            { "DateTimePatternChars", "GanjkHmsSEDFwWxhKzZ" },
        };
    }
}