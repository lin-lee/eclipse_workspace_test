/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package sun.reflect.generics.tree;

/**
 * Common superinterface for generic signatures. These are the signatures
 * of complete class and method/constructor delcarations.
 */
public interface Signature extends Tree{
    FormalTypeParameter[] getFormalTypeParameters();
}
