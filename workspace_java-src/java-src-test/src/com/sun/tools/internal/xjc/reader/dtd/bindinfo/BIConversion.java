/*
 * Copyright (c) 1997, 2008, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package com.sun.tools.internal.xjc.reader.dtd.bindinfo;

import com.sun.tools.internal.xjc.model.TypeUse;

/**
 * conversion declaration (&lt;conversion> and &lt;enumeration>).
 */
public interface BIConversion
{
    /** Gets the conversion name. */
    String name();
    
    /** Gets a transducer for this conversion. */
    TypeUse getTransducer();
}
