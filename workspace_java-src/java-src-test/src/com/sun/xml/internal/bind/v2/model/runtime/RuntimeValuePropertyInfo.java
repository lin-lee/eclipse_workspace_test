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

package com.sun.xml.internal.bind.v2.model.runtime;

import java.lang.reflect.Type;

import com.sun.xml.internal.bind.v2.model.core.ValuePropertyInfo;

/**
 * @author Kohsuke Kawaguchi
 */
public interface RuntimeValuePropertyInfo extends ValuePropertyInfo<Type,Class>,RuntimePropertyInfo,RuntimeNonElementRef {
    RuntimeNonElement getTarget();
}
