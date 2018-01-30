/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.sun.org.omg.SendingContext;


/**
* com/sun/org/omg/SendingContext/_CodeBaseImplBase.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from rt.idl
* Thursday, May 6, 1999 1:52:08 AM PDT
*/

public abstract class _CodeBaseImplBase extends org.omg.CORBA.portable.ObjectImpl
    implements com.sun.org.omg.SendingContext.CodeBase, org.omg.CORBA.portable.InvokeHandler
{

    // Constructors
    public _CodeBaseImplBase ()
    {
    }

    private static java.util.Hashtable _methods = new java.util.Hashtable ();
    static
    {
	_methods.put ("get_ir", new java.lang.Integer (0));
	_methods.put ("implementation", new java.lang.Integer (1));
	_methods.put ("implementations", new java.lang.Integer (2));
	_methods.put ("meta", new java.lang.Integer (3));
	_methods.put ("metas", new java.lang.Integer (4));
	_methods.put ("bases", new java.lang.Integer (5));
    }

    public org.omg.CORBA.portable.OutputStream _invoke (String method,
							org.omg.CORBA.portable.InputStream in,
							org.omg.CORBA.portable.ResponseHandler rh)
    {
	org.omg.CORBA.portable.OutputStream out = rh.createReply();
	java.lang.Integer __method = (java.lang.Integer)_methods.get (method);
	if (__method == null)
	    throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

	switch (__method.intValue ())
	    {

		// Operation to obtain the IR from the sending context
	    case 0:  // SendingContext/CodeBase/get_ir
		{
		    com.sun.org.omg.CORBA.Repository __result = null;
		    __result = this.get_ir ();
		    com.sun.org.omg.CORBA.RepositoryHelper.write (out, __result);
		    break;
		}


		// Operations to obtain a URL to the implementation code
	    case 1:  // SendingContext/CodeBase/implementation
		{
		    String x = com.sun.org.omg.CORBA.RepositoryIdHelper.read (in);
		    String __result = null;
		    __result = this.implementation (x);
		    out.write_string (__result);
		    break;
		}

	    case 2:  // SendingContext/CodeBase/implementations
		{
		    String x[] = com.sun.org.omg.CORBA.RepositoryIdSeqHelper.read (in);
		    String __result[] = null;
		    __result = this.implementations (x);
		    com.sun.org.omg.SendingContext.CodeBasePackage.URLSeqHelper.write (out, __result);
		    break;
		}


		// the same information
	    case 3:  // SendingContext/CodeBase/meta
		{
		    String x = com.sun.org.omg.CORBA.RepositoryIdHelper.read (in);
		    com.sun.org.omg.CORBA.ValueDefPackage.FullValueDescription __result = null;
		    __result = this.meta (x);
		    com.sun.org.omg.CORBA.ValueDefPackage.FullValueDescriptionHelper.write (out, __result);
		    break;
		}

	    case 4:  // SendingContext/CodeBase/metas
		{
		    String x[] = com.sun.org.omg.CORBA.RepositoryIdSeqHelper.read (in);
		    com.sun.org.omg.CORBA.ValueDefPackage.FullValueDescription __result[] = null;
		    __result = this.metas (x);
		    com.sun.org.omg.SendingContext.CodeBasePackage.ValueDescSeqHelper.write (out, __result);
		    break;
		}


		// information
	    case 5:  // SendingContext/CodeBase/bases
		{
		    String x = com.sun.org.omg.CORBA.RepositoryIdHelper.read (in);
		    String __result[] = null;
		    __result = this.bases (x);
		    com.sun.org.omg.CORBA.RepositoryIdSeqHelper.write (out, __result);
		    break;
		}

	    default:
		throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
	    }

	return out;
    } // _invoke

    // Type-specific CORBA::Object operations
    private static String[] __ids = {
	"IDL:omg.org/SendingContext/CodeBase:1.0", 
	"IDL:omg.org/SendingContext/RunTime:1.0"};

    public String[] _ids ()
    {
	return __ids;
    }


} // class _CodeBaseImplBase
