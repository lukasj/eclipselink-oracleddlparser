/* Generated By:JJTree&JavaCC: Do not edit this line. DDLParserConstants.java */
/*******************************************************************************
 * Copyright (c) 2011 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Mike Norman - June 10 2011, created DDL parser package
 ******************************************************************************/
package org.eclipse.persistence.tools.oracleddl.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
@SuppressWarnings("all")
public interface DDLParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int COMMENT_LINE = 6;
  /** RegularExpression Id. */
  int COMMENT_BLOCK = 7;
  /** RegularExpression Id. */
  int O_ASSIGN = 8;
  /** RegularExpression Id. */
  int O_ASTERISK = 9;
  /** RegularExpression Id. */
  int O_ATSIGN = 10;
  /** RegularExpression Id. */
  int O_CLOSEPAREN = 11;
  /** RegularExpression Id. */
  int O_CONCAT = 12;
  /** RegularExpression Id. */
  int O_COLON = 13;
  /** RegularExpression Id. */
  int O_COMMA = 14;
  /** RegularExpression Id. */
  int O_DOT = 15;
  /** RegularExpression Id. */
  int O_DOUBLEDOT = 16;
  /** RegularExpression Id. */
  int O_DOLLAR = 17;
  /** RegularExpression Id. */
  int O_PERCENT = 18;
  /** RegularExpression Id. */
  int O_EQUAL = 19;
  /** RegularExpression Id. */
  int O_GREATER = 20;
  /** RegularExpression Id. */
  int O_GREATEREQUAL = 21;
  /** RegularExpression Id. */
  int O_JOINPLUS = 22;
  /** RegularExpression Id. */
  int O_LESS = 23;
  /** RegularExpression Id. */
  int O_LESSEQUAL = 24;
  /** RegularExpression Id. */
  int O_MINUS = 25;
  /** RegularExpression Id. */
  int O_NOTEQUAL2 = 26;
  /** RegularExpression Id. */
  int O_NOTEQUAL = 27;
  /** RegularExpression Id. */
  int O_OPENPAREN = 28;
  /** RegularExpression Id. */
  int O_PLUS = 29;
  /** RegularExpression Id. */
  int O_POUND = 30;
  /** RegularExpression Id. */
  int O_QUESTIONMARK = 31;
  /** RegularExpression Id. */
  int O_SEMICOLON = 32;
  /** RegularExpression Id. */
  int O_SLASH = 33;
  /** RegularExpression Id. */
  int O_TILDE = 34;
  /** RegularExpression Id. */
  int S_NUMBER = 35;
  /** RegularExpression Id. */
  int FLOAT = 36;
  /** RegularExpression Id. */
  int INTEGER = 37;
  /** RegularExpression Id. */
  int DIGIT = 38;
  /** RegularExpression Id. */
  int R_ALL = 39;
  /** RegularExpression Id. */
  int R_ALTER = 40;
  /** RegularExpression Id. */
  int R_ANCHORED_ROWTYPE = 41;
  /** RegularExpression Id. */
  int R_ANCHORED_TYPE = 42;
  /** RegularExpression Id. */
  int R_AND = 43;
  /** RegularExpression Id. */
  int R_AS = 44;
  /** RegularExpression Id. */
  int R_ASC = 45;
  /** RegularExpression Id. */
  int R_AT = 46;
  /** RegularExpression Id. */
  int R_BEGIN = 47;
  /** RegularExpression Id. */
  int R_BETWEEN = 48;
  /** RegularExpression Id. */
  int R_BY = 49;
  /** RegularExpression Id. */
  int R_CASE = 50;
  /** RegularExpression Id. */
  int R_CHARSET = 51;
  /** RegularExpression Id. */
  int R_CHECK = 52;
  /** RegularExpression Id. */
  int R_CLUSTERS = 53;
  /** RegularExpression Id. */
  int R_CLUSTER = 54;
  /** RegularExpression Id. */
  int R_COLAUTH = 55;
  /** RegularExpression Id. */
  int R_COLUMNS = 56;
  /** RegularExpression Id. */
  int R_COMPRESS = 57;
  /** RegularExpression Id. */
  int R_CONNECT = 58;
  /** RegularExpression Id. */
  int R_CONSTRAINT = 59;
  /** RegularExpression Id. */
  int R_CRASH = 60;
  /** RegularExpression Id. */
  int R_CREATE = 61;
  /** RegularExpression Id. */
  int R_CURSOR = 62;
  /** RegularExpression Id. */
  int R_DECLARE = 63;
  /** RegularExpression Id. */
  int R_DEFAULT = 64;
  /** RegularExpression Id. */
  int R_DESC = 65;
  /** RegularExpression Id. */
  int R_DISTINCT = 66;
  /** RegularExpression Id. */
  int R_DROP = 67;
  /** RegularExpression Id. */
  int R_ELSE = 68;
  /** RegularExpression Id. */
  int R_END = 69;
  /** RegularExpression Id. */
  int R_EXCEPTION = 70;
  /** RegularExpression Id. */
  int R_EXCLUSIVE = 71;
  /** RegularExpression Id. */
  int R_FETCH = 72;
  /** RegularExpression Id. */
  int R_FOR = 73;
  /** RegularExpression Id. */
  int R_FROM = 74;
  /** RegularExpression Id. */
  int R_FUNCTION = 75;
  /** RegularExpression Id. */
  int R_GOTO = 76;
  /** RegularExpression Id. */
  int R_GRANT = 77;
  /** RegularExpression Id. */
  int R_GROUP = 78;
  /** RegularExpression Id. */
  int R_HAVING = 79;
  /** RegularExpression Id. */
  int R_IDENTIFIED = 80;
  /** RegularExpression Id. */
  int R_IF = 81;
  /** RegularExpression Id. */
  int R_IN = 82;
  /** RegularExpression Id. */
  int R_INDEX = 83;
  /** RegularExpression Id. */
  int R_INDEXES = 84;
  /** RegularExpression Id. */
  int R_INSERT = 85;
  /** RegularExpression Id. */
  int R_INTERSECT = 86;
  /** RegularExpression Id. */
  int R_INTO = 87;
  /** RegularExpression Id. */
  int R_IS = 88;
  /** RegularExpression Id. */
  int R_LIKE = 89;
  /** RegularExpression Id. */
  int R_LOCK = 90;
  /** RegularExpression Id. */
  int R_MINUS = 91;
  /** RegularExpression Id. */
  int R_MODE = 92;
  /** RegularExpression Id. */
  int R_NOCOMPRESS = 93;
  /** RegularExpression Id. */
  int R_NOT = 94;
  /** RegularExpression Id. */
  int R_NOWAIT = 95;
  /** RegularExpression Id. */
  int R_NULL = 96;
  /** RegularExpression Id. */
  int R_OF = 97;
  /** RegularExpression Id. */
  int R_ON = 98;
  /** RegularExpression Id. */
  int R_OPTION = 99;
  /** RegularExpression Id. */
  int R_OR = 100;
  /** RegularExpression Id. */
  int R_ORDER = 101;
  /** RegularExpression Id. */
  int R_OVERLAPS = 102;
  /** RegularExpression Id. */
  int R_PRIMARY = 103;
  /** RegularExpression Id. */
  int R_PROCEDURE = 104;
  /** RegularExpression Id. */
  int R_PUBLIC = 105;
  /** RegularExpression Id. */
  int R_RESOURCE = 106;
  /** RegularExpression Id. */
  int R_REVOKE = 107;
  /** RegularExpression Id. */
  int R_SELECT = 108;
  /** RegularExpression Id. */
  int R_SHARE = 109;
  /** RegularExpression Id. */
  int R_SIZE = 110;
  /** RegularExpression Id. */
  int R_SQL = 111;
  /** RegularExpression Id. */
  int R_START = 112;
  /** RegularExpression Id. */
  int R_SUBTYPE = 113;
  /** RegularExpression Id. */
  int R_TABAUTH = 114;
  /** RegularExpression Id. */
  int R_TABLE = 115;
  /** RegularExpression Id. */
  int R_THEN = 116;
  /** RegularExpression Id. */
  int R_TO = 117;
  /** RegularExpression Id. */
  int R_TYPE = 118;
  /** RegularExpression Id. */
  int R_UNION = 119;
  /** RegularExpression Id. */
  int R_UNIQUE = 120;
  /** RegularExpression Id. */
  int R_UPDATE = 121;
  /** RegularExpression Id. */
  int R_VALUES = 122;
  /** RegularExpression Id. */
  int R_VIEW = 123;
  /** RegularExpression Id. */
  int R_VIEWS = 124;
  /** RegularExpression Id. */
  int R_WHEN = 125;
  /** RegularExpression Id. */
  int R_WHERE = 126;
  /** RegularExpression Id. */
  int R_WITH = 127;
  /** RegularExpression Id. */
  int K_ARRAY = 128;
  /** RegularExpression Id. */
  int K_AUTHID = 129;
  /** RegularExpression Id. */
  int K_BFILE = 130;
  /** RegularExpression Id. */
  int K_BINARY_DOUBLE = 131;
  /** RegularExpression Id. */
  int K_BINARY_FLOAT = 132;
  /** RegularExpression Id. */
  int K_BINARY_INTEGER = 133;
  /** RegularExpression Id. */
  int K_BLOB = 134;
  /** RegularExpression Id. */
  int K_BOOLEAN = 135;
  /** RegularExpression Id. */
  int K_BYTE = 136;
  /** RegularExpression Id. */
  int K_CHAR = 137;
  /** RegularExpression Id. */
  int K_CHARACTER = 138;
  /** RegularExpression Id. */
  int K_CLOB = 139;
  /** RegularExpression Id. */
  int K_COMMIT = 140;
  /** RegularExpression Id. */
  int K_CONSTANT = 141;
  /** RegularExpression Id. */
  int K_CONSTRUCTOR = 142;
  /** RegularExpression Id. */
  int K_CURRENT_USER = 143;
  /** RegularExpression Id. */
  int K_DATE = 144;
  /** RegularExpression Id. */
  int K_DAY = 145;
  /** RegularExpression Id. */
  int K_DEC = 146;
  /** RegularExpression Id. */
  int K_DECIMAL = 147;
  /** RegularExpression Id. */
  int K_DEFINER = 148;
  /** RegularExpression Id. */
  int K_DELETE = 149;
  /** RegularExpression Id. */
  int K_DETERMINISTIC = 150;
  /** RegularExpression Id. */
  int K_DOUBLE = 151;
  /** RegularExpression Id. */
  int K_ENABLE = 152;
  /** RegularExpression Id. */
  int K_FINAL = 153;
  /** RegularExpression Id. */
  int K_FLOAT = 154;
  /** RegularExpression Id. */
  int K_FORCE = 155;
  /** RegularExpression Id. */
  int K_GLOBAL = 156;
  /** RegularExpression Id. */
  int K_INSTANTIABLE = 157;
  /** RegularExpression Id. */
  int K_INT = 158;
  /** RegularExpression Id. */
  int K_INTEGER = 159;
  /** RegularExpression Id. */
  int K_INTERVAL = 160;
  /** RegularExpression Id. */
  int K_KEY = 161;
  /** RegularExpression Id. */
  int K_LOCAL = 162;
  /** RegularExpression Id. */
  int K_LONG = 163;
  /** RegularExpression Id. */
  int K_MLSLABEL = 164;
  /** RegularExpression Id. */
  int K_MONTH = 165;
  /** RegularExpression Id. */
  int K_NATIONAL = 166;
  /** RegularExpression Id. */
  int K_NATURAL = 167;
  /** RegularExpression Id. */
  int K_NCHAR = 168;
  /** RegularExpression Id. */
  int K_NCLOB = 169;
  /** RegularExpression Id. */
  int K_NOCOPY = 170;
  /** RegularExpression Id. */
  int K_NUMBER = 171;
  /** RegularExpression Id. */
  int K_NUMERIC = 172;
  /** RegularExpression Id. */
  int K_NVARCHAR2 = 173;
  /** RegularExpression Id. */
  int K_NVARCHAR = 174;
  /** RegularExpression Id. */
  int K_OBJECT = 175;
  /** RegularExpression Id. */
  int K_OID = 176;
  /** RegularExpression Id. */
  int K_ORGANIZATION = 177;
  /** RegularExpression Id. */
  int K_OUT = 178;
  /** RegularExpression Id. */
  int K_OVERFLOW = 179;
  /** RegularExpression Id. */
  int K_PACKAGE = 180;
  /** RegularExpression Id. */
  int K_PARALLEL_ENABLE = 181;
  /** RegularExpression Id. */
  int K_PIPELINED = 182;
  /** RegularExpression Id. */
  int K_PLS_INTEGER = 183;
  /** RegularExpression Id. */
  int K_POSITIVE = 184;
  /** RegularExpression Id. */
  int K_PRAGMA = 185;
  /** RegularExpression Id. */
  int K_PRECISION = 186;
  /** RegularExpression Id. */
  int K_PRESERVE = 187;
  /** RegularExpression Id. */
  int K_RANGE = 188;
  /** RegularExpression Id. */
  int K_RAW = 189;
  /** RegularExpression Id. */
  int K_REAL = 190;
  /** RegularExpression Id. */
  int K_RECORD = 191;
  /** RegularExpression Id. */
  int K_REF = 192;
  /** RegularExpression Id. */
  int K_REPLACE = 193;
  /** RegularExpression Id. */
  int K_RESULT = 194;
  /** RegularExpression Id. */
  int K_RESULT_CACHE = 195;
  /** RegularExpression Id. */
  int K_RETURN = 196;
  /** RegularExpression Id. */
  int K_ROWID = 197;
  /** RegularExpression Id. */
  int K_ROWS = 198;
  /** RegularExpression Id. */
  int K_SECOND = 199;
  /** RegularExpression Id. */
  int K_SELF = 200;
  /** RegularExpression Id. */
  int K_SET = 201;
  /** RegularExpression Id. */
  int K_SIGNTYPE = 202;
  /** RegularExpression Id. */
  int K_SIMPLE_DOUBLE = 203;
  /** RegularExpression Id. */
  int K_SIMPLE_FLOAT = 204;
  /** RegularExpression Id. */
  int K_SIMPLE_INTEGER = 205;
  /** RegularExpression Id. */
  int K_SMALLINT = 206;
  /** RegularExpression Id. */
  int K_STRING = 207;
  /** RegularExpression Id. */
  int K_SYS_REFCURSOR = 208;
  /** RegularExpression Id. */
  int K_TEMPORARY = 209;
  /** RegularExpression Id. */
  int K_TIME = 210;
  /** RegularExpression Id. */
  int K_TIMESTAMP = 211;
  /** RegularExpression Id. */
  int K_UROWID = 212;
  /** RegularExpression Id. */
  int K_VARCHAR2 = 213;
  /** RegularExpression Id. */
  int K_VARCHAR = 214;
  /** RegularExpression Id. */
  int K_VARRAY = 215;
  /** RegularExpression Id. */
  int K_VARYING = 216;
  /** RegularExpression Id. */
  int K_XMLTYPE = 217;
  /** RegularExpression Id. */
  int K_SYSXMLTYPE = 218;
  /** RegularExpression Id. */
  int K_YEAR = 219;
  /** RegularExpression Id. */
  int K_ZONE = 220;
  /** RegularExpression Id. */
  int S_IDENTIFIER = 221;
  /** RegularExpression Id. */
  int LETTER = 222;
  /** RegularExpression Id. */
  int SPECIAL_CHARS = 223;
  /** RegularExpression Id. */
  int S_BIND = 224;
  /** RegularExpression Id. */
  int S_CHAR_LITERAL = 225;
  /** RegularExpression Id. */
  int S_QUOTED_IDENTIFIER = 226;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<COMMENT_LINE>",
    "<COMMENT_BLOCK>",
    "\":=\"",
    "\"*\"",
    "\"@\"",
    "\")\"",
    "\"||\"",
    "\":\"",
    "\",\"",
    "\".\"",
    "\"..\"",
    "\"$\"",
    "\"%\"",
    "\"=\"",
    "\">\"",
    "\">=\"",
    "\"(+)\"",
    "\"<\"",
    "\"<=\"",
    "\"-\"",
    "\"<>\"",
    "\"!=\"",
    "\"(\"",
    "\"+\"",
    "\"#\"",
    "\"?\"",
    "\";\"",
    "\"/\"",
    "\"~\"",
    "<S_NUMBER>",
    "<FLOAT>",
    "<INTEGER>",
    "<DIGIT>",
    "\"ALL\"",
    "\"ALTER\"",
    "\"%ROWTYPE\"",
    "\"%TYPE\"",
    "\"AND\"",
    "\"AS\"",
    "\"ASC\"",
    "\"AT\"",
    "\"BEGIN\"",
    "\"BETWEEN\"",
    "\"BY\"",
    "\"CASE\"",
    "\"%CHARSET\"",
    "\"CHECK\"",
    "\"CLUSTERS\"",
    "\"CLUSTER\"",
    "\"COLAUTH\"",
    "\"COLUMNS\"",
    "\"COMPRESS\"",
    "\"CONNECT\"",
    "\"CONSTRAINT\"",
    "\"CRASH\"",
    "\"CREATE\"",
    "\"CURSOR\"",
    "\"DECLARE\"",
    "\"DEFAULT\"",
    "\"DESC\"",
    "\"DISTINCT\"",
    "\"DROP\"",
    "\"ELSE\"",
    "\"END\"",
    "\"EXCEPTION\"",
    "\"EXCLUSIVE\"",
    "\"FETCH\"",
    "\"FOR\"",
    "\"FROM\"",
    "\"FUNCTION\"",
    "\"GOTO\"",
    "\"GRANT\"",
    "\"GROUP\"",
    "\"HAVING\"",
    "\"IDENTIFIED\"",
    "\"IF\"",
    "\"IN\"",
    "\"INDEX\"",
    "\"INDEXES\"",
    "\"INSERT\"",
    "\"INTERSECT\"",
    "\"INTO\"",
    "\"IS\"",
    "\"LIKE\"",
    "\"LOCK\"",
    "\"MINUS\"",
    "\"MODE\"",
    "\"NOCOMPRESS\"",
    "\"NOT\"",
    "\"NOWAIT\"",
    "\"NULL\"",
    "\"OF\"",
    "\"ON\"",
    "\"OPTION\"",
    "\"OR\"",
    "\"ORDER\"",
    "\"OVERLAPS\"",
    "\"PRIMARY\"",
    "\"PROCEDURE\"",
    "\"PUBLIC\"",
    "\"RESOURCE\"",
    "\"REVOLE\"",
    "\"SELECT\"",
    "\"SHARE\"",
    "\"SIZE\"",
    "\"SQL\"",
    "\"START\"",
    "\"SUBTYPE\"",
    "\"TABAUTH\"",
    "\"TABLE\"",
    "\"THEN\"",
    "\"TO\"",
    "\"TYPE\"",
    "\"UNION\"",
    "\"UNIQUE\"",
    "\"UPDATE\"",
    "\"VALUES\"",
    "\"VIEW\"",
    "\"VIEWS\"",
    "\"WHEN\"",
    "\"WHERE\"",
    "\"WITH\"",
    "\"ARRAY\"",
    "\"AUTHID\"",
    "\"BFILE\"",
    "\"BINARY_DOUBLE\"",
    "\"BINARY_FLOAT\"",
    "\"BINARY_INTEGER\"",
    "\"BLOB\"",
    "\"BOOLEAN\"",
    "\"BYTE\"",
    "\"CHAR\"",
    "\"CHARACTER\"",
    "\"CLOB\"",
    "\"COMMIT\"",
    "\"CONSTANT\"",
    "\"CONSTRUCTOR\"",
    "\"CURRENT_USER\"",
    "\"DATE\"",
    "\"DAY\"",
    "\"DEC\"",
    "\"DECIMAL\"",
    "\"DEFINER\"",
    "\"DELETE\"",
    "\"DETERMINISTIC\"",
    "\"DOUBLE\"",
    "\"ENABLE\"",
    "\"FINAL\"",
    "\"FLOAT\"",
    "\"FORCE\"",
    "\"GLOBAL\"",
    "\"INSTANTIABLE\"",
    "\"INT\"",
    "\"INTEGER\"",
    "\"INTERVAL\"",
    "\"KEY\"",
    "\"LOCAL\"",
    "\"LONG\"",
    "\"MLSLABEL\"",
    "\"MONTH\"",
    "\"NATIONAL\"",
    "\"NATURAL\"",
    "\"NCHAR\"",
    "\"NCLOB\"",
    "\"NOCOPY\"",
    "\"NUMBER\"",
    "\"NUMERIC\"",
    "\"NVARCHAR2\"",
    "\"NVARCHAR\"",
    "\"OBJECT\"",
    "\"OID\"",
    "\"ORGANIZATION\"",
    "\"OUT\"",
    "\"OVERFLOW\"",
    "\"PACKAGE\"",
    "\"PARALLEL_ENABLE\"",
    "\"PIPELINED\"",
    "\"PLS_INTEGER\"",
    "\"POSITIVE\"",
    "\"PRAGMA\"",
    "\"PRECISION\"",
    "\"PRESERVE\"",
    "\"RANGE\"",
    "\"RAW\"",
    "\"REAL\"",
    "\"RECORD\"",
    "\"REF\"",
    "\"REPLACE\"",
    "\"RESULT\"",
    "\"RESULT_CACHE\"",
    "\"RETURN\"",
    "\"ROWID\"",
    "\"ROWS\"",
    "\"SECOND\"",
    "\"SELF\"",
    "\"SET\"",
    "\"SIGNTYPE\"",
    "\"SIMPLE_DOUBLE\"",
    "\"SIMPLE_FLOAT\"",
    "\"SIMPLE_INTEGER\"",
    "\"SMALLINT\"",
    "\"STRING\"",
    "\"SYS_REFCURSOR\"",
    "\"TEMPORARY\"",
    "\"TIME\"",
    "\"TIMESTAMP\"",
    "\"UROWID\"",
    "\"VARCHAR2\"",
    "\"VARCHAR\"",
    "\"VARRAY\"",
    "\"VARYING\"",
    "\"XMLTYPE\"",
    "\"SYS.XMLTYPE\"",
    "\"YEAR\"",
    "\"ZONE\"",
    "<S_IDENTIFIER>",
    "<LETTER>",
    "<SPECIAL_CHARS>",
    "<S_BIND>",
    "<S_CHAR_LITERAL>",
    "<S_QUOTED_IDENTIFIER>",
  };

}
