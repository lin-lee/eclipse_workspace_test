/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.jndi.ldap;

import javax.naming.NamingEnumeration;

interface ReferralEnumeration extends NamingEnumeration {
    void appendUnprocessedReferrals(LdapReferralException ex);
}
