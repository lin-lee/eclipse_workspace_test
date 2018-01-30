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

package com.sun.codemodel.internal;

import java.lang.annotation.Annotation;

/**
 * Annotatable program elements.
 *
 * @author Kohsuke Kawaguchi
 */
public interface JAnnotatable {
    /**
     * Adds an annotation to this program element.
     * @param clazz
     *          The annotation class to annotate the program element with
     */
    JAnnotationUse annotate(JClass clazz);

    /**
     * Adds an annotation to this program element.
     *
     * @param clazz
     *          The annotation class to annotate the program element with
     */
    JAnnotationUse annotate(Class <? extends Annotation> clazz);

    /**
     * Adds an annotation to this program element
     * and returns a type-safe writer to fill in the values of such annotations.
     */
    <W extends JAnnotationWriter> W annotate2(Class<W> clazz);
}