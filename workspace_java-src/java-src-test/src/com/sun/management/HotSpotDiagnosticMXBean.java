/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
                                                                                
package com.sun.management;

/**
 * Diagnostic management interface for the HotSpot Virtual Machine.  
 * The diagnostic MBean is registered to the platform MBeanServer 
 * as are other platform MBeans. 
 *
 * <p>The <tt>ObjectName</tt> for uniquely identifying the diagnostic
 * MXBean within an MBeanServer is:
 * <blockquote>
 *    <tt>com.sun.management:type=HotSpotDiagnostic</tt>
 * </blockquote>
 */
public interface HotSpotDiagnosticMXBean {
    /**
     * Dumps the heap to the <tt>outputFile</tt> file in the same
     * format as the hprof heap dump.
     * <p>
     * If this method is called remotely from another process,
     * the heap dump output is written to a file named <tt>outputFile</tt>
     * on the machine where the target VM is running.  If outputFile is
     * a relative path, it is relative to the working directory where 
     * the target VM was started.
     *
     * @param  outputFile the system-dependent filename
     * @param  live if <tt>true</tt> dump only <i>live</i> objects
     *         i.e. objects that are reachable from others
     * @throws IOException if the <tt>outputFile</tt>
     *                     cannot be created, opened, or written to.
     * @throws UnsupportedOperationException if this operation is not supported.
     * @throws NullPointerException if <tt>outputFile</tt> is <tt>null</tt>.
     */
    public void dumpHeap(String outputFile, boolean live) throws java.io.IOException; 

    /**
     * Returns a list of <tt>VMOption</tt> objects for all diagnostic options.
     * A diagnostic option is a {@link VMOption#isWriteable writeable}
     * VM option that can be set dynamically mainly for troubleshooting
     * and diagnosis.
     *
     * @return a list of <tt>VMOption</tt> objects for all diagnostic options.
     */
    public java.util.List<VMOption> getDiagnosticOptions();

    /**
     * Returns a <tt>VMOption</tt> object for a VM option of the given
     * name.
     *
     * @return a <tt>VMOption</tt> object for a VM option of the given name.
     * @throws NullPointerException if name is <tt>null</tt>.
     * @throws IllegalArgumentException if a VM option of the given name
     *                                     does not exist.
     */
    public VMOption getVMOption(String name);

    /**
     * Sets a VM option of the given name to the specified value. 
     * The new value will be reflected in a new <tt>VMOption</tt>
     * object returned by the {@link #getVMOption} method or
     * the {@link #getDiagnosticOptions} method.  This method does 
     * not change the value of this <tt>VMOption</tt> object.
     *
     * @param name Name of a VM option 
     * @param value New value of the VM option to be set 
     *
     * @throws IllegalArgumentException if the VM option of the given name
     *                                     does not exist.
     * @throws IllegalArgumentException if the new value is invalid.
     * @throws IllegalArgumentException if the VM option is not writeable.
     * @throws NullPointerException if name or value is <tt>null</tt>.
     *
     * @throws  java.security.SecurityException
     *     if a security manager exists and the caller does not have
     *     ManagementPermission("control").
     */
    public void setVMOption(String name, String value);
}