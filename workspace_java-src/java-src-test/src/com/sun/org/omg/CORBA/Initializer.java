/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.sun.org.omg.CORBA;


/**
* com/sun/org/omg/CORBA/Initializer.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ir.idl
* Thursday, May 6, 1999 1:51:44 AM PDT
*/

// This file has been _CHANGED_

public final class Initializer implements org.omg.CORBA.portable.IDLEntity
{
    // _CHANGED_
    //public com.sun.org.omg.CORBA.StructMember members[] = null;
    public org.omg.CORBA.StructMember members[] = null;
    public String name = null;

    public Initializer ()
    {
    } // ctor

    // _CHANGED_
    //public Initializer (com.sun.org.omg.CORBA.StructMember[] _members, String _name)
    public Initializer (org.omg.CORBA.StructMember[] _members, String _name)
    {
	members = _members;
	name = _name;
    } // ctor

} // class Initializer
