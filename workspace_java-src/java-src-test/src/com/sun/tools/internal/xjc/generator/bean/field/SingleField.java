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
package com.sun.tools.internal.xjc.generator.bean.field;

import java.util.List;

import com.sun.codemodel.internal.JBlock;
import com.sun.codemodel.internal.JConditional;
import com.sun.codemodel.internal.JExpr;
import com.sun.codemodel.internal.JExpression;
import com.sun.codemodel.internal.JMethod;
import com.sun.codemodel.internal.JType;
import com.sun.codemodel.internal.JVar;
import com.sun.tools.internal.xjc.generator.bean.ClassOutlineImpl;
import com.sun.tools.internal.xjc.generator.bean.MethodWriter;
import com.sun.tools.internal.xjc.model.CPropertyInfo;
import com.sun.tools.internal.xjc.outline.FieldAccessor;
import com.sun.xml.internal.bind.api.impl.NameConverter;

/**
 * Realizes a property through one getter and one setter.
 * This renders:
 * 
 * <pre>
 * T' field;
 * T getXXX() { ... }
 * void setXXX(T value) { ... }
 * </pre>
 *
 * <p>
 * Normally T'=T, but under some tricky circumstances they could be different
 * (like T'=Integer, T=int.)
 *
 * This realization is only applicable to fields with (1,1)
 * or (0,1) multiplicity.
 * 
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public class SingleField extends AbstractFieldWithVar {

    protected SingleField(ClassOutlineImpl context, CPropertyInfo prop) {
        this(context,prop,false);
    }

    /**
     *
     * @param forcePrimitiveAccess
     *      forces the setter/getter to expose the primitive type.
     *      it's a pointless customization, but it's nevertheless in the spec.
     */
    protected SingleField(ClassOutlineImpl context, CPropertyInfo prop, boolean forcePrimitiveAccess ) {
        super(context, prop);
        assert !exposedType.isPrimitive() && !implType.isPrimitive();
        
        createField();
        
        MethodWriter writer = context.createMethodWriter();
        NameConverter nc = context.parent().getModel().getNameConverter();

        // [RESULT]
        // Type getXXX() {
        // #ifdef default value
        //     if(value==null)
        //         return defaultValue;
        // #endif
        //     return value;
        // }
        JExpression defaultValue = null;
        if(prop.defaultValue!=null)
            defaultValue = prop.defaultValue.compute(outline.parent());

        // if Type is a wrapper and we have a default value,
        // we can use the primitive type.
        JType getterType;
        if(defaultValue!=null || forcePrimitiveAccess)
            getterType = exposedType.unboxify();
        else
            getterType = exposedType;

        JMethod $get = writer.declareMethod( getterType,getGetterMethod() );
        String javadoc = prop.javadoc;
        if(javadoc.length()==0)
            javadoc = Messages.DEFAULT_GETTER_JAVADOC.format(nc.toVariableName(prop.getName(true)));
        writer.javadoc().append(javadoc);


        if(defaultValue==null) {
            $get.body()._return(ref());
        } else {
            JConditional cond = $get.body()._if(ref().eq(JExpr._null()));
            cond._then()._return(defaultValue);
            cond._else()._return(ref());
        }

        List<Object> possibleTypes = listPossibleTypes(prop);
        writer.javadoc().addReturn()
            .append("possible object is\n")
            .append(possibleTypes);
         
        // [RESULT]
        // void setXXX(Type newVal) {
        //     this.value = newVal;
        // }
        JMethod $set = writer.declareMethod( codeModel.VOID, "set"+prop.getName(true) );
        JType setterType = exposedType;
        if(forcePrimitiveAccess)    setterType = setterType.unboxify();
        JVar $value = writer.addParameter( setterType, "value" );
        JBlock body = $set.body();
        body.assign(JExpr._this().ref(ref()),castToImplType($value));

        // setter always get the default javadoc. See issue #381
        writer.javadoc().append(Messages.DEFAULT_SETTER_JAVADOC.format(nc.toVariableName(prop.getName(true))));
        writer.javadoc().addParam($value)
            .append("allowed object is\n")
            .append(possibleTypes);
    }

    public final JType getFieldType() {
        return implType;
    }

    public FieldAccessor create(JExpression targetObject) {
        return new Accessor(targetObject);
    }
    
    protected class Accessor extends AbstractFieldWithVar.Accessor {
        protected Accessor(JExpression $target) {
            super($target);
        }
        
        public void unsetValues( JBlock body ) {
            body.assign( $ref, JExpr._null() );
        }
        public JExpression hasSetValue() {
            return $ref.ne( JExpr._null() );
        }
    }
}
