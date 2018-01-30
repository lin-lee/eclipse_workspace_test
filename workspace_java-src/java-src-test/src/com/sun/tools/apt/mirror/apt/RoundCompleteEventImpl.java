/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL.  Use is subject to license terms.
 */

package com.sun.tools.apt.mirror.apt;

import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.RoundCompleteEvent;
import com.sun.mirror.apt.RoundState;

public class RoundCompleteEventImpl extends RoundCompleteEvent {
    public RoundCompleteEventImpl(AnnotationProcessorEnvironment source,
				  RoundState rs) {
	super(source, rs);
    }
}
