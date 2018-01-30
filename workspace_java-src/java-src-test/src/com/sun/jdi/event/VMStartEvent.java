/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.jdi.event;

import com.sun.jdi.*;

/**
 * Notification of initialization of a target VM.  This event is
 * received before the main thread is started and before any 
 * application code has been executed. Before this event occurs
 * a significant amount of system code has executed and a number 
 * of system classes have been loaded. 
 * This event is always generated by the target VM, even 
 * if not explicitly requested.
 *
 * @see VMDeathEvent
 * @see EventQueue
 * @see VirtualMachine
 *
 * @author Robert Field
 * @since  1.3
 */
public interface VMStartEvent extends Event {
    /**
     * Returns the initial thread of the VM which has started.
     *
     * @return a {@link ThreadReference} which mirrors the event's thread in 
     * the target VM.
     */
    public ThreadReference thread();
}

