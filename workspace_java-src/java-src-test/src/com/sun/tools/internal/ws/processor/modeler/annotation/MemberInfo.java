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
package com.sun.tools.internal.ws.processor.modeler.annotation;

import com.sun.istack.internal.NotNull;
import com.sun.mirror.declaration.Declaration;
import com.sun.mirror.type.TypeMirror;

import javax.xml.namespace.QName;
import java.lang.annotation.Annotation;

/**
 *
 * @author  WS Development Team
 */
public final class MemberInfo implements Comparable<MemberInfo> {
    private final TypeMirror paramType;
    private final String paramName;
    private final QName elementName;
    private final Annotation[] jaxbAnnotations;
    /**
     * Use this to look up annotations on this parameter/return type.
     */
    private final Declaration decl;

    public MemberInfo(TypeMirror paramType, String paramName, QName elementName, @NotNull Declaration decl, Annotation... jaxbAnnotations) {
        this.paramType = paramType;
        this.paramName = paramName;
        this.elementName = elementName;
        this.decl = decl;
        this.jaxbAnnotations = jaxbAnnotations;
    }


    public Annotation[] getJaxbAnnotations() {
        return jaxbAnnotations;
    }

    public TypeMirror getParamType() {
        return paramType;
    }

    public String getParamName() {
        return paramName;
    }

    public QName getElementName() {
        return elementName;
    }

    public @NotNull Declaration getDecl() {
        return decl;
    }

    public int compareTo(MemberInfo member) {
        return paramName.compareTo(member.paramName);
    }
}
