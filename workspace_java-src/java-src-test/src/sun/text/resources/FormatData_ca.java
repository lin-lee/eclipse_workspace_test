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

public class FormatData_ca extends ListResourceBundle {
    /**
     * Overrides ListResourceBundle
     */
    protected final Object[][] getContents() {
        return new Object[][] {
            { "MonthNames",
                new String[] {
                    "gener", // january
                    "febrer", // february
                    "mar\u00e7", // march
                    "abril", // april
                    "maig", // may
                    "juny", // june
                    "juliol", // july
                    "agost", // august
                    "setembre", // september
                    "octubre", // october
                    "novembre", // november
                    "desembre", // december
                    "" // month 13 if applicable
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "gen.", // abb january
                    "feb.", // abb february
                    "mar\u00e7", // abb march
                    "abr.", // abb april
                    "maig", // abb may
                    "juny", // abb june
                    "jul.", // abb july
                    "ag.", // abb august
                    "set.", // abb september
                    "oct.", // abb october
                    "nov.", // abb november
                    "des.", // abb december
                    "" // abb month 13 if applicable
                }
            },
            { "DayNames",
                new String[] {
                    "diumenge", // Sunday
                    "dilluns", // Monday
                    "dimarts", // Tuesday
                    "dimecres", // Wednesday
                    "dijous", // Thursday
                    "divendres", // Friday
                    "dissabte" // Saturday
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "dg.", // abb Sunday
                    "dl.", // abb Monday
                    "dt.", // abb Tuesday
                    "dc.", // abb Wednesday
                    "dj.", // abb Thursday
                    "dv.", // abb Friday
                    "ds." // abb Saturday
                }
            },
            { "NumberElements",
                new String[] {
                    ",", // decimal separator
                    ".", // group (thousands) separator
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
                    "HH:mm:ss z", // full time pattern
                    "HH:mm:ss z", // long time pattern
                    "HH:mm:ss", // medium time pattern
                    "HH:mm", // short time pattern
                    "EEEE, d' / 'MMMM' / 'yyyy", // full date pattern
                    "d' / 'MMMM' / 'yyyy", // long date pattern
                    "dd/MM/yyyy", // medium date pattern
                    "dd/MM/yy", // short date pattern
                    "{1} {0}" // date-time pattern
                }
            },
            { "DateTimePatternChars", "GuMtkHmsSEDFwWahKzZ" },
        };
    }
}
