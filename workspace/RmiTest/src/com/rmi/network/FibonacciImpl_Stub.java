// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.rmi.network;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.rmi.*;
import java.rmi.server.*;

// Referenced classes of package com.rmi.network.remoteObject:
//            Fibonacci

public final class FibonacciImpl_Stub extends RemoteStub
    implements Fibonacci, Remote
{

    public FibonacciImpl_Stub(RemoteRef remoteref)
    {
        super(remoteref);
    }

    static Class _mthclass$(String s)
    {
        try
        {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    public BigInteger getFibonacci(int i)
        throws RemoteException
    {
        try
        {
            Object obj = super.ref.invoke(this, $method_getFibonacci_0, new Object[] {
                new Integer(i)
            }, 0x76c15fdef5669459L);
            return (BigInteger)obj;
        }
        catch(RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        catch(RemoteException remoteexception)
        {
            throw remoteexception;
        }
        catch(Exception exception)
        {
            throw new UnexpectedException("undeclared checked exception", exception);
        }
    }

    public BigInteger getFibonacci(BigInteger biginteger)
        throws RemoteException
    {
        try
        {
            Object obj = super.ref.invoke(this, $method_getFibonacci_1, new Object[] {
                biginteger
            }, 0xeb58ed3e26ca3a34L);
            return (BigInteger)obj;
        }
        catch(RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        catch(RemoteException remoteexception)
        {
            throw remoteexception;
        }
        catch(Exception exception)
        {
            throw new UnexpectedException("undeclared checked exception", exception);
        }
    }

    private static final long serialVersionUID = 2L;
    private static Method $method_getFibonacci_0;
    private static Method $method_getFibonacci_1;

    static 
    {
        try
        {
            $method_getFibonacci_0 = (com.rmi.network.Fibonacci.class).getMethod("getFibonacci", new Class[] {
                Integer.TYPE
            });
            $method_getFibonacci_1 = (com.rmi.network.Fibonacci.class).getMethod("getFibonacci", new Class[] {
                java.math.BigInteger.class
            });
        }
        catch(NoSuchMethodException _ex)
        {
            throw new NoSuchMethodError("stub class initialization failed");
        }
    }
}
