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
/* Generated By:JavaCC: Do not edit this line. SCDParserConstants.java */
package com.sun.xml.internal.xsom.impl.scd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface SCDParserConstants {

  int EOF = 0;
  int Letter = 6;
  int BaseChar = 7;
  int Ideographic = 8;
  int CombiningChar = 9;
  int UnicodeDigit = 10;
  int Extender = 11;
  int NCNAME = 12;
  int NUMBER = 13;
  int FACETNAME = 14;

  int DEFAULT = 0;

  static final List<String> tokenImage = Collections.unmodifiableList(Arrays.asList(

       new String[] {
         "<EOF>",
         "\" \"",
         "\"\\t\"",
         "\"\\n\"",
         "\"\\r\"",
         "\"\\f\"",
         "<Letter>",
         "<BaseChar>",
         "<Ideographic>",
         "<CombiningChar>",
         "<UnicodeDigit>",
         "<Extender>",
         "<NCNAME>",
         "<NUMBER>",
         "<FACETNAME>",
         "\":\"",
         "\"/\"",
         "\"//\"",
         "\"attribute::\"",
         "\"@\"",
         "\"element::\"",
         "\"substitutionGroup::\"",
         "\"type::\"",
         "\"~\"",
         "\"baseType::\"",
         "\"primitiveType::\"",
         "\"itemType::\"",
         "\"memberType::\"",
         "\"scope::\"",
         "\"attributeGroup::\"",
         "\"group::\"",
         "\"identityContraint::\"",
         "\"key::\"",
         "\"notation::\"",
         "\"model::sequence\"",
         "\"model::choice\"",
         "\"model::all\"",
         "\"model::*\"",
         "\"any::*\"",
         "\"anyAttribute::*\"",
         "\"facet::*\"",
         "\"facet::\"",
         "\"component::*\"",
         "\"x-schema::\"",
         "\"x-schema::*\"",
         "\"*\"",
         "\"0\"",
       }));
  }