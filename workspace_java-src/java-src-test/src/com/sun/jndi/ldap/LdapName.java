/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.jndi.ldap;


import java.util.Enumeration;
import java.util.Vector;

import javax.naming.*;
import javax.naming.directory.Attributes;
import javax.naming.directory.Attribute;
import javax.naming.directory.BasicAttributes;


/**
 * <code>LdapName</code> implements compound names for LDAP v3 as
 * specified by RFC 2253.
 *<p>
 * RFC 2253 has a few ambiguities and outright inconsistencies.  These
 * are resolved as follows:
 * <ul>
 * <li>	RFC 2253 leaves the term "whitespace" undefined.  The
 *	definition of "optional-space" given in RFC 1779 is used in
 *	its place:  either a space character or a carriage return ("\r").
 * <li>	Whitespace is allowed on either side of ',', ';', '=', and '+'.
 *	Such whitespace is accepted but not generated by this code,
 *	and is ignored when comparing names.
 * <li>	AttributeValue strings containing '=' or non-leading '#'
 *	characters (unescaped) are accepted.
 * </ul>
 *<p>
 * String names passed to <code>LdapName</code> or returned by it
 * use the full 16-bit Unicode character set.  They may also contain
 * characters encoded into UTF-8 with each octet represented by a
 * three-character substring such as "\\B4".
 * They may not, however, contain characters encoded into UTF-8 with
 * each octet represented by a single character in the string:  the
 * meaning would be ambiguous.
 *<p>
 * <code>LdapName</code> will properly parse all valid names, but
 * does not attempt to detect all possible violations when parsing
 * invalid names.  It's "generous".
 *<p>
 * When names are tested for equality, attribute types and binary
 * values are case-insensitive, and string values are by default
 * case-insensitive.
 * String values with different but equivalent usage of quoting,
 * escaping, or UTF8-hex-encoding are considered equal.  The order of
 * components in multi-valued RDNs (such as "ou=Sales+cn=Bob") is not
 * significant.
 *
 * @author Scott Seligman
 */

public final class LdapName implements Name {

    private transient String unparsed;	// if non-null, the DN in unparsed form
    private transient Vector rdns;	// parsed name components
    private transient boolean valuesCaseSensitive = false;

    /**
     * Constructs an LDAP name from the given DN.
     *
     * @param name	An LDAP DN.  To JNDI, a compound name.
     *
     * @throws InvalidNameException if a syntax violation is detected.
     */
    public LdapName(String name) throws InvalidNameException {
	unparsed = name;
	parse();
    }

    /*
     * Constructs an LDAP name given its parsed components and, optionally
     * (if "name" is not null), the unparsed DN.
     */
    private LdapName(String name, Vector rdns) {
	unparsed = name;
	this.rdns = (Vector)rdns.clone();
    }

    /*
     * Constructs an LDAP name given its parsed components (the elements
     * of "rdns" in the range [beg,end)) and, optionally
     * (if "name" is not null), the unparsed DN.
     */
    private LdapName(String name, Vector rdns, int beg, int end) {
	unparsed = name;
	this.rdns = new Vector();
	for (int i = beg; i < end; i++) {
	    this.rdns.addElement(rdns.elementAt(i));
	}
    }


    public Object clone() {
	return new LdapName(unparsed, rdns);
    }

    public String toString() {
	if (unparsed != null) {
	    return unparsed;
	}

	StringBuffer buf = new StringBuffer();
	for (int i = rdns.size() - 1; i >= 0; i--) {
	    if (i < rdns.size() - 1) {
		buf.append(',');
	    }
	    Rdn rdn = (Rdn)rdns.elementAt(i);
	    buf.append(rdn);
	}

	unparsed = new String(buf);
	return unparsed;
    }

    public boolean equals(Object obj) {
	return ((obj instanceof LdapName) &&
		(compareTo(obj) == 0));
    }

    public int compareTo(Object obj) {
	LdapName that = (LdapName)obj;

	if ((obj == this) ||			// check possible shortcuts
	    (unparsed != null && unparsed.equals(that.unparsed))) {
	    return 0;
	}

	// Compare RDNs one by one, lexicographically.
	int minSize = Math.min(rdns.size(), that.rdns.size());
	for (int i = 0 ; i < minSize; i++) {
	    // Compare a single pair of RDNs.
	    Rdn rdn1 = (Rdn)rdns.elementAt(i);
	    Rdn rdn2 = (Rdn)that.rdns.elementAt(i);

	    int diff = rdn1.compareTo(rdn2);
	    if (diff != 0) {
		return diff;
	    }
	}
	return (rdns.size() - that.rdns.size());	// longer DN wins
    }

    public int hashCode() {
	// Sum up the hash codes of the components.
	int hash = 0;

	// For each RDN...
	for (int i = 0; i < rdns.size(); i++) {
	    Rdn rdn = (Rdn)rdns.elementAt(i);
	    hash += rdn.hashCode();
	}
	return hash;
    }

    public int size() {
	return rdns.size();
    }

    public boolean isEmpty() {
	return rdns.isEmpty();
    }

    public Enumeration getAll() {
	final Enumeration enum_ = rdns.elements();

	return new Enumeration () {
	    public boolean hasMoreElements() {
		return enum_.hasMoreElements();
	    }
	    public Object nextElement() {
		return enum_.nextElement().toString();
	    }
	};
    }

    public String get(int pos) {
	return rdns.elementAt(pos).toString();
    }

    public Name getPrefix(int pos) {
	return new LdapName(null, rdns, 0, pos);
    }

    public Name getSuffix(int pos) {
	return new LdapName(null, rdns, pos, rdns.size());
    }

    public boolean startsWith(Name n) {
	int len1 = rdns.size();
	int len2 = n.size();
	return (len1 >= len2 &&
		matches(0, len2, n));
    }

    public boolean endsWith(Name n) {
	int len1 = rdns.size();
	int len2 = n.size();
	return (len1 >= len2 &&
		matches(len1 - len2, len1, n));
    }

    /**
     * Controls whether string-values are treated as case-sensitive
     * when the string values within names are compared.  The default
     * behavior is case-insensitive comparison.
     */
     public void setValuesCaseSensitive(boolean caseSensitive) {
	 toString();
	 rdns = null;	// clear any cached information
	 try {
	     parse();
	 } catch (InvalidNameException e) {
	     // shouldn't happen
	     throw new IllegalStateException("Cannot parse name: " + unparsed);
	 }
	 valuesCaseSensitive = caseSensitive;
     }

    /*
     * Helper method for startsWith() and endsWith().
     * Returns true if components [beg,end) match the components of "n".
     * If "n" is not an LdapName, each of its components is parsed as
     * the string form of an RDN.
     * The following must hold:  end - beg == n.size().
     */
    private boolean matches(int beg, int end, Name n) {
	for (int i = beg; i < end; i++) {
	    Rdn rdn;
	    if (n instanceof LdapName) {
		LdapName ln = (LdapName)n;
		rdn = (Rdn)ln.rdns.elementAt(i - beg);
	    } else {
		String rdnString = n.get(i - beg);
		try {
		    rdn = (new DnParser(rdnString, valuesCaseSensitive)).getRdn();
		} catch (InvalidNameException e) {
		    return false;
		}
	    }

	    if (!rdn.equals(rdns.elementAt(i))) {
		return false;
	    }
	}
	return true;
    }

    public Name addAll(Name suffix) throws InvalidNameException {
	return addAll(size(), suffix);
    }

    /*
     * If "suffix" is not an LdapName, each of its components is parsed as
     * the string form of an RDN.
     */
    public Name addAll(int pos, Name suffix) throws InvalidNameException {
	if (suffix instanceof LdapName) {
	    LdapName s = (LdapName)suffix;
	    for (int i = 0; i < s.rdns.size(); i++) {
		rdns.insertElementAt(s.rdns.elementAt(i), pos++);
	    }
	} else {
	    Enumeration comps = suffix.getAll();
	    while (comps.hasMoreElements()) {
		DnParser p = new DnParser((String)comps.nextElement(), 
		    valuesCaseSensitive);
		rdns.insertElementAt(p.getRdn(), pos++);
	    }
	}
	unparsed = null;				// no longer valid
	return this;
    }

    public Name add(String comp) throws InvalidNameException {
	return add(size(), comp);
    }

    public Name add(int pos, String comp) throws InvalidNameException {
	Rdn rdn = (new DnParser(comp, valuesCaseSensitive)).getRdn();
	rdns.insertElementAt(rdn, pos);
	unparsed = null;				// no longer valid
	return this;
    }

    public Object remove(int pos) throws InvalidNameException {
	String comp = get(pos);
	rdns.removeElementAt(pos);
	unparsed = null;				// no longer valid
	return comp;
    }


    private void parse() throws InvalidNameException {
	rdns = (new DnParser(unparsed, valuesCaseSensitive)).getDn();
    }

    /*
     * Best guess as to what RFC 2253 means by "whitespace".
     */
    private static boolean isWhitespace(char c) {
	return (c == ' ' || c == '\r');
    }

    /**
     * Given the value of an attribute, returns a string suitable
     * for inclusion in a DN.  If the value is a string, this is
     * accomplished by using backslash (\) to escape the following
     * characters:
     *<ul>
     *<li>leading and trailing whitespace
     *<li><pre>, = + < > # ; " \</pre>
     *</ul>
     * If the value is a byte array, it is converted to hex
     * notation (such as "#CEB1DF80").
     */
    public static String escapeAttributeValue(Object val) {
	return TypeAndValue.escapeValue(val);
    }

    /**
     * Given an attribute value formated according to RFC 2253,
     * returns the unformated value.  Returns a string value as
     * a string, and a binary value as a byte array.
     */
    public static Object unescapeAttributeValue(String val) {
	return TypeAndValue.unescapeValue(val);
    }

    /**
     * Serializes only the unparsed DN, for compactness and to avoid
     * any implementation dependency.
     *
     * @serialdata	The DN string and a boolean indicating whether
     * the values are case sensitive.
     */
    private void writeObject(java.io.ObjectOutputStream s)
	    throws java.io.IOException {
	s.writeObject(toString());
	s.writeBoolean(valuesCaseSensitive);
    }

    private void readObject(java.io.ObjectInputStream s)
	    throws java.io.IOException, ClassNotFoundException {
	unparsed = (String)s.readObject();
	valuesCaseSensitive = s.readBoolean();
	try {
	    parse();
	} catch (InvalidNameException e) {
	    // shouldn't happen
	    throw new java.io.StreamCorruptedException(
		    "Invalid name: " + unparsed);
	}
    }

    static final long serialVersionUID = -1595520034788997356L;


    /*
     * DnParser implements a recursive descent parser for a single DN.
     */
    static class DnParser {

	private final String name;	// DN being parsed
	private final char[] chars;	// characters in LDAP name being parsed
	private final int len;		// length of "chars"
	private int cur = 0;		// index of first unconsumed char in "chars"
	private boolean valuesCaseSensitive;

	/*
	 * Given an LDAP DN in string form, returns a parser for it.
	 */
	DnParser(String name, boolean valuesCaseSensitive) 
	    throws InvalidNameException {
	    this.name = name;
	    len = name.length();
	    chars = name.toCharArray();
	    this.valuesCaseSensitive = valuesCaseSensitive;
	}

	/*
	 * Parses the DN, returning a Vector of its RDNs.
	 */
	Vector getDn() throws InvalidNameException {
	    cur = 0;
	    Vector rdns = new Vector(len / 3 + 10);  // leave room for growth

	    if (len == 0) {
		return rdns;
	    }

	    rdns.addElement(parseRdn());
	    while (cur < len) {
		if (chars[cur] == ',' || chars[cur] == ';') {
		    ++cur;
		    rdns.insertElementAt(parseRdn(), 0);
		} else {
		    throw new InvalidNameException("Invalid name: " + name);
		}
	    }
	    return rdns;
	}

	/*
	 * Parses the DN, if it is known to contain a single RDN.
	 */
	Rdn getRdn() throws InvalidNameException {
	    Rdn rdn = parseRdn();
	    if (cur < len) {
		throw new InvalidNameException("Invalid RDN: " + name);
	    }
	    return rdn;
	}

	/*
	 * Parses the next RDN and returns it.  Throws an exception if
	 * none is found.  Leading and trailing whitespace is consumed.
	 */
	private Rdn parseRdn() throws InvalidNameException {

	    Rdn rdn = new Rdn();
	    while (cur < len) {
		consumeWhitespace();
		String attrType = parseAttrType();
		consumeWhitespace();
		if (cur >= len || chars[cur] != '=') {
		    throw new InvalidNameException("Invalid name: " + name);
		}
		++cur;		// consume '='
		consumeWhitespace();
		String value = parseAttrValue();
		consumeWhitespace();

		rdn.add(new TypeAndValue(attrType, value, valuesCaseSensitive));
		if (cur >= len || chars[cur] != '+') {
		    break;
		}
		++cur;		// consume '+'
	    }
	    return rdn;
	}

	/*
	 * Returns the attribute type that begins at the next unconsumed
	 * char.  No leading whitespace is expected.
	 * This routine is more generous than RFC 2253.  It accepts
	 * attribute types composed of any nonempty combination of Unicode
	 * letters, Unicode digits, '.', '-', and internal space characters.
	 */
	private String parseAttrType() throws InvalidNameException {

	    final int beg = cur;
	    while (cur < len) {
		char c = chars[cur];
		if (Character.isLetterOrDigit(c) ||
		      c == '.' ||
		      c == '-' ||
		      c == ' ') {
		    ++cur;
		} else {
		    break;
		}
	    }
	    // Back out any trailing spaces.
	    while ((cur > beg) && (chars[cur - 1] == ' ')) {
		--cur;
	    }
	    
	    if (beg == cur) {
		throw new InvalidNameException("Invalid name: " + name);
	    }
	    return new String(chars, beg, cur - beg);
	}

	/*
	 * Returns the attribute value that begins at the next unconsumed
	 * char.  No leading whitespace is expected.
	 */
	private String parseAttrValue() throws InvalidNameException {

	    if (cur < len && chars[cur] == '#') {
		return parseBinaryAttrValue();
	    } else if (cur < len && chars[cur] == '"') {
		return parseQuotedAttrValue();
	    } else {
		return parseStringAttrValue();
	    }
	}

	private String parseBinaryAttrValue() throws InvalidNameException {
	    final int beg = cur;
	    ++cur;			// consume '#'
	    while (cur < len &&
		   Character.isLetterOrDigit(chars[cur])) {
		++cur;
	    }
	    return new String(chars, beg, cur - beg);
	}

	private String parseQuotedAttrValue() throws InvalidNameException {

	    final int beg = cur;
	    ++cur;			// consume '"'

	    while ((cur < len) && chars[cur] != '"') {
		if (chars[cur] == '\\') {
		    ++cur;		// consume backslash, then what follows
		}
		++cur;
	    }
	    if (cur >= len) {	// no closing quote
		throw new InvalidNameException("Invalid name: " + name);
	    }
	    ++cur	;	// consume closing quote

	    return new String(chars, beg, cur - beg);
	}

	private String parseStringAttrValue() throws InvalidNameException {

	    final int beg = cur;
	    int esc = -1;	// index of the most recently escaped character

	    while ((cur < len) && !atTerminator()) {
		if (chars[cur] == '\\') {
		    ++cur;		// consume backslash, then what follows
		    esc = cur;
		}
		++cur;
	    }
	    if (cur > len) {		// 'twas backslash followed by nothing
		throw new InvalidNameException("Invalid name: " + name);
	    }

	    // Trim off (unescaped) trailing whitespace.
	    int end;
	    for (end = cur; end > beg; end--) {
		if (!isWhitespace(chars[end - 1]) || (esc == end - 1)) {
		    break;
		}
	    }
	    return new String(chars, beg, end - beg);
	}

	private void consumeWhitespace() {
	    while ((cur < len) && isWhitespace(chars[cur])) {
		++cur;
	    }
	}

	/*
	 * Returns true if next unconsumed character is one that terminates
	 * a string attribute value.
	 */
	private boolean atTerminator() {
	    return (cur < len &&
		    (chars[cur] == ',' ||
		     chars[cur] == ';' ||
		     chars[cur] == '+'));
	}
    }


    /*
     * Class Rdn represents a set of TypeAndValue.
     */
    static class Rdn {

	/*
	 * A vector of the TypeAndValue elements of this Rdn.
	 * It is sorted to facilitate set operations.
	 */
	private final Vector tvs = new Vector();

	void add(TypeAndValue tv) {

	    // Set i to index of first element greater than tv, or to
	    // tvs.size() if there is none.
	    int i;
	    for (i = 0; i < tvs.size(); i++) {
		int diff = tv.compareTo(tvs.elementAt(i));
		if (diff == 0) {
		    return;		// tv is a duplicate:  ignore it
		} else if (diff < 0) {
		    break;
		}
	    }

	    tvs.insertElementAt(tv, i);
	}

	public String toString() {
	    StringBuffer buf = new StringBuffer();
	    for (int i = 0; i < tvs.size(); i++) {
		if (i > 0) {
		    buf.append('+');
		}
		buf.append(tvs.elementAt(i));
	    }
	    return new String(buf);
	}

	public boolean equals(Object obj) {
	    return ((obj instanceof Rdn) &&
		    (compareTo(obj) == 0));
	}

	// Compare TypeAndValue components one by one, lexicographically.
	public int compareTo(Object obj) {
	    Rdn that = (Rdn)obj;
	    int minSize = Math.min(tvs.size(), that.tvs.size());
	    for (int i = 0; i < minSize; i++) {
		// Compare a single pair of type/value pairs.
		TypeAndValue tv = (TypeAndValue)tvs.elementAt(i);
		int diff = tv.compareTo(that.tvs.elementAt(i));
		if (diff != 0) {
		    return diff;
		}
	    }
	    return (tvs.size() - that.tvs.size());	// longer RDN wins
	}

	public int hashCode() {
	    // Sum up the hash codes of the components.
	    int hash = 0;

	    // For each type/value pair...
	    for (int i = 0; i < tvs.size(); i++) {
		hash += tvs.elementAt(i).hashCode();
	    }
	    return hash;
	}

	Attributes toAttributes() {
	    Attributes attrs = new BasicAttributes(true);
	    TypeAndValue tv;
	    Attribute attr;

	    for (int i = 0; i < tvs.size(); i++) {
		tv = (TypeAndValue) tvs.elementAt(i);
		if ((attr = attrs.get(tv.getType())) == null) {
		    attrs.put(tv.getType(), tv.getUnescapedValue());
		} else {
		    attr.add(tv.getUnescapedValue());
		}
	    }
	    return attrs;
	}
    }


    /*
     * Class TypeAndValue represents an attribute type and its
     * corresponding value.
     */
    static class TypeAndValue {

	private final String type;
	private final String value;		// value, escaped or quoted
	private final boolean binary;
	private final boolean valueCaseSensitive;

	// If non-null, a canonical represention of the value suitable
	// for comparison using String.compareTo().
	private String comparable = null;

	TypeAndValue(String type, String value, boolean valueCaseSensitive) {
	    this.type = type;
	    this.value = value;
	    binary = value.startsWith("#");
	    this.valueCaseSensitive = valueCaseSensitive;
	}

	public String toString() {
	    return (type + "=" + value);
	}

	public int compareTo(Object obj) {
	    // NB: Any change here affecting equality must be
	    //     reflected in hashCode().

	    TypeAndValue that = (TypeAndValue)obj;

	    int diff = type.toUpperCase().compareTo(that.type.toUpperCase());
	    if (diff != 0) {
		return diff;
	    }
	    if (value.equals(that.value)) {	// try shortcut
		return 0;
	    }
	    return getValueComparable().compareTo(that.getValueComparable());
	}

	public boolean equals(Object obj) {
	    // NB:  Any change here must be reflected in hashCode().
	    if (!(obj instanceof TypeAndValue)) {
		return false;
	    }
	    TypeAndValue that = (TypeAndValue)obj;
	    return (type.equalsIgnoreCase(that.type) &&
		    (value.equals(that.value) ||
		     getValueComparable().equals(that.getValueComparable())));
	}

	public int hashCode() {
	    // If two objects are equal, their hash codes must match.
	    return (type.toUpperCase().hashCode() +
		    getValueComparable().hashCode());
	}

	/*
	 * Returns the type.
	 */
	String getType() {
	    return type;
	}

	/*
	 * Returns the unescaped value.
	 */
	Object getUnescapedValue() {
	    return unescapeValue(value);
	}

	/*
	 * Returns a canonical representation of "value" suitable for
	 * comparison using String.compareTo().  If "value" is a string,
	 * it is returned with escapes and quotes stripped away, and
	 * hex-encoded UTF-8 converted to 16-bit Unicode chars.
         * If value's case is to be ignored, it is returned in uppercase.
	 * If "value" is binary, it is returned in uppercase but
	 * otherwise unmodified.
	 */
	private String getValueComparable() {
	    if (comparable != null) {
		return comparable;	// return cached result
	    }

	    // cache result
	    if (binary) {
		comparable = value.toUpperCase();
	    } else {
		comparable = (String)unescapeValue(value);
		if (!valueCaseSensitive) {
		    comparable = comparable.toUpperCase(); // ignore case
		}
	    }
	    return comparable;
	}

	/*
	 * Given the value of an attribute, returns a string suitable
	 * for inclusion in a DN.
	 */
	static String escapeValue(Object val) {
	    return (val instanceof byte[])
		? escapeBinaryValue((byte[])val)
		: escapeStringValue((String)val);
	}

	/*
	 * Given the value of a string-valued attribute, returns a
	 * string suitable for inclusion in a DN.  This is accomplished by
	 * using backslash (\) to escape the following characters:
	 *	leading and trailing whitespace
	 *	, = + < > # ; " \
	 */
	private static String escapeStringValue(String val) {

	    final String escapees = ",=+<>#;\"\\";
	    char[] chars = val.toCharArray();
	    StringBuffer buf = new StringBuffer(2 * val.length());

	    // Find leading and trailing whitespace.
	    int lead;	// index of first char that is not leading whitespace
	    for (lead = 0; lead < chars.length; lead++) {
		if (!isWhitespace(chars[lead])) {
		    break;
		}
	    }
	    int trail;	// index of last char that is not trailing whitespace
	    for (trail = chars.length - 1; trail >= 0; trail--) {
		if (!isWhitespace(chars[trail])) {
		    break;
		}
	    }

	    for (int i = 0; i < chars.length; i++) {
		char c = chars[i];
		if ((i < lead) || (i > trail) || (escapees.indexOf(c) >= 0)) {
		    buf.append('\\');
		}
		buf.append(c);
	    }
	    return new String(buf);
	}

	/*
	 * Given the value of a binary attribute, returns a string
	 * suitable for inclusion in a DN (such as "#CEB1DF80").
	 */
	private static String escapeBinaryValue(byte[] val) {

	    StringBuffer buf = new StringBuffer(1 + 2 * val.length);
	    buf.append("#");

	    for (int i = 0; i < val.length; i++) {
		byte b = val[i];
		buf.append(Character.forDigit(0xF & (b >>> 4), 16));
		buf.append(Character.forDigit(0xF & b, 16));
	    }

	    return (new String(buf)).toUpperCase();
	}

	/*
	 * Given an attribute value formated according to RFC 2253,
	 * returns the unformated value.  Escapes and quotes are
	 * stripped away, and hex-encoded UTF-8 is converted to 16-bit
	 * Unicode chars.  Returns a string value as a String, and a
	 * binary value as a byte array.
	 */
	static Object unescapeValue(String val) {

	    char[] chars = val.toCharArray();
	    int beg = 0;
	    int end = chars.length;

	    // Trim off leading and trailing whitespace.
	    while ((beg < end) && isWhitespace(chars[beg])) {
		++beg;
	    }
	    while ((beg < end) && isWhitespace(chars[end - 1])) {
		--end;
	    }

	    // Add back the trailing whitespace with a preceeding '\'
            // (escaped or unescaped) that was taken off in the above
            // loop. Whether or not to retain this whitespace is
	    // decided below.
            if (end != chars.length &&
                    (beg < end) &&
                    chars[end - 1] == '\\') {
                end++;
            }
	    if (beg >= end) {
		return "";
	    }

	    if (chars[beg] == '#') {
		// Value is binary (eg: "#CEB1DF80").
		return decodeHexPairs(chars, ++beg, end);
	    }

	    // Trim off quotes.
	    if ((chars[beg] == '\"') && (chars[end - 1] == '\"')) {
		++beg;
		--end;
	    }

	    StringBuffer buf = new StringBuffer(end - beg);
	    int esc = -1; // index of the last escaped character

	    for (int i = beg; i < end; i++) {
		if ((chars[i] == '\\') && (i + 1 < end)) {
		    if (!Character.isLetterOrDigit(chars[i + 1])) {
			++i;			// skip backslash
			buf.append(chars[i]);	// snarf escaped char
			esc = i;	
		    } else {

			// Convert hex-encoded UTF-8 to 16-bit chars.
			byte[] utf8 = getUtf8Octets(chars, i, end);
			if (utf8.length > 0) {
			    try {
			        buf.append(new String(utf8, "UTF8"));
			    } catch (java.io.UnsupportedEncodingException e) {
			        // shouldn't happen
			    }
			    i += utf8.length * 3 - 1;
			} else {
			    throw new IllegalArgumentException(
				"Not a valid attribute string value:" +
				val +", improper usage of backslash");
			}
		    }
		} else {
		    buf.append(chars[i]);	// snarf unescaped char
		}
	    }

	    // Get rid of the unescaped trailing whitespace with the
            // preceeding '\' character that was previously added back.
            int len = buf.length();
            if (isWhitespace(buf.charAt(len - 1)) && esc != (end - 1)) {
                buf.setLength(len - 1);
            }

	    return new String(buf);
	}


	/*
	 * Given an array of chars (with starting and ending indexes into it)
	 * representing bytes encoded as hex-pairs (such as "CEB1DF80"),
	 * returns a byte array containing the decoded bytes.
	 */
	private static byte[] decodeHexPairs(char[] chars, int beg, int end) {
	    byte[] bytes = new byte[(end - beg) / 2];
	    for (int i = 0; beg + 1 < end; i++) {
		int hi = Character.digit(chars[beg], 16);
		int lo = Character.digit(chars[beg + 1], 16);
		if (hi < 0 || lo < 0) {
		    break;
		}
		bytes[i] = (byte)((hi<<4) + lo);
		beg += 2;
	    }
	    if (beg != end) {
		throw new IllegalArgumentException(
			"Illegal attribute value: #" + new String(chars));
	    }
	    return bytes;
	}

	/*
	 * Given an array of chars (with starting and ending indexes into it),
	 * finds the largest prefix consisting of hex-encoded UTF-8 octets,
	 * and returns a byte array containing the corresponding UTF-8 octets.
	 *
	 * Hex-encoded UTF-8 octets look like this:
	 *	\03\B1\DF\80
	 */
	private static byte[] getUtf8Octets(char[] chars, int beg, int end) {
	    byte[] utf8 = new byte[(end - beg) / 3];	// allow enough room
	    int len = 0;	// index of first unused byte in utf8

	    while ((beg + 2 < end) &&
		   (chars[beg++] == '\\')) {
		int hi = Character.digit(chars[beg++], 16);
		int lo = Character.digit(chars[beg++], 16);
		if (hi < 0 || lo < 0) {
		    break;
		}
		utf8[len++] = (byte)((hi<<4) + lo);
	    }

	    if (len == utf8.length) {
		return utf8;
	    } else {
		byte[] res = new byte[len];
		System.arraycopy(utf8, 0, res, 0, len);
		return res;
	    }
	}
    }


    /*
     * For testing.
     */
/*
    public static void main(String[] args) {

	try {
	    if (args.length == 1) {		// parse and print components
		LdapName n = new LdapName(args[0]);

		Enumeration rdns = n.rdns.elements();
		while (rdns.hasMoreElements()) {
		    Rdn rdn = (Rdn)rdns.nextElement();
		    for (int i = 0; i < rdn.tvs.size(); i++) {
			System.out.print("[" + rdn.tvs.elementAt(i) + "]");
		    }
		    System.out.println();
		}

	    } else {				// compare two names
		LdapName n1 = new LdapName(args[0]);
		LdapName n2 = new LdapName(args[1]);
		n1.unparsed = null;
		n2.unparsed = null;
		boolean eq = n1.equals(n2);
		System.out.println("[" + n1 + (eq ? "] == [" : "] != [")
				   + n2 + "]");
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
*/
}
