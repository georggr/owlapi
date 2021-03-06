/* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
/* Generated By:JavaCC: Do not edit this line. TurtleParserConstants.java */
package org.semanticweb.owlapi.rdf.turtle.parser;

interface TurtleParserConstants {

    int EOF = 0;
    int COMMENT = 5;
    int STRING_START = 6;
    int ANY_ESCAPED_CHAR = 7;
    int ANY_CHAR = 8;
    int STRING = 9;
    int THREEQUOTES = 10;
    int ANY_ESCAPED_CHAR_IN_LONG_STRING = 12;
    int LONG_STRING = 13;
    int DIGIT = 14;
    int INTEGER = 15;
    int DOUBLE = 16;
    int DECIMAL = 17;
    int EXPONENT = 18;
    int OPENPAR = 19;
    int CLOSEPAR = 20;
    int OPEN_SQUARE_BRACKET = 21;
    int CLOSE_SQUARE_BRACKET = 22;
    int COMMA = 23;
    int DOT = 24;
    int SEMICOLON = 25;
    int PREFIX = 26;
    int DOUBLE_CARET = 27;
    int BASE = 28;
    int AT = 29;
    int A = 30;
    int EMPTY_BLANK_NODE = 31;
    int NODE_ID_START = 32;
    int TRUE = 33;
    int FALSE = 34;
    int SELECT = 35;
    int WHERE = 36;
    int FILTER = 37;
    int LETTER = 38;
    int FULLIRI = 39;
    int PNAME_NS = 40;
    int PN_LOCAL = 41;
    int PNAME_LN = 42;
    int PN_PREFIX = 43;
    int PN_CHARS_BASE = 44;
    int PN_CHARS = 45;
    int PN_CHARS_U = 46;
    int NODEID = 47;
    int ERROR = 48;
    int DEFAULT = 0;
    int IN_STRING = 1;
    int IN_LONG_STRING = 2;
    String[] tokenImage = { "<EOF>", "\" \"", "\"\\n\"", "\"\\t\"", "\"\\r\"",
            "<COMMENT>", "\"\\\"\"", "<ANY_ESCAPED_CHAR>", "<ANY_CHAR>",
            "\"\\\"\"", "<THREEQUOTES>", "<token of kind 11>",
            "<ANY_ESCAPED_CHAR_IN_LONG_STRING>", "<LONG_STRING>", "<DIGIT>",
            "<INTEGER>", "<DOUBLE>", "<DECIMAL>", "<EXPONENT>", "\"(\"",
            "\")\"", "\"[\"", "\"]\"", "\",\"", "\".\"", "\";\"",
            "\"@prefix\"", "\"^^\"", "\"@base\"", "\"@\"", "\"a\"",
            "<EMPTY_BLANK_NODE>", "\"_:\"", "\"true\"", "\"false\"",
            "\"SELECT\"", "\"WHERE\"", "\"FILTER\"", "<LETTER>", "<FULLIRI>",
            "<PNAME_NS>", "<PN_LOCAL>", "<PNAME_LN>", "<PN_PREFIX>",
            "<PN_CHARS_BASE>", "<PN_CHARS>", "<PN_CHARS_U>", "<NODEID>",
            "<ERROR>", };
}
