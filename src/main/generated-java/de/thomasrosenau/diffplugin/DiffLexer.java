/* The following code was generated by JFlex 1.7.0-1 tweaked for IntelliJ platform */

/*
 Copyright 2019 Thomas Rosenau

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package de.thomasrosenau.diffplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static de.thomasrosenau.diffplugin.psi.DiffTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-1
 * from the specification file <tt>/Users/thomas/projects/intellij-diff-plugin/src/main/java/de/thomasrosenau/diffplugin/lexer/Diff.flex</tt>
 */
public class DiffLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int CONTEXT = 2;
  public static final int UNIFIED = 4;
  public static final int NORMAL = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  1,  0,  2,  0,  3,  0, 4
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\12\0\1\4\2\5\1\1\22\0\1\7\1\11\10\0\1\6\1\12\1\3\1\10\2\0\12\2\2\0\1\20\1"+
    "\0\1\17\1\0\1\13\33\0\1\23\4\0\1\14\1\0\1\15\1\16\1\0\1\22\2\0\1\21\33\0\1"+
    "\5\242\0\2\5\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\1\1\1\2\22\1\1\0\3\3\11\0\1\3"+
    "\2\0\2\4\2\0\2\5\1\0\2\6\2\0\2\7"+
    "\1\3\1\0\2\10\1\3\2\0\2\11\1\3\4\0"+
    "\2\12\1\3\1\0\2\13\1\3\1\14\7\0\3\15"+
    "\2\0\1\3\1\0\1\3\2\0\1\3\1\0\1\3"+
    "\4\0\1\16\1\0\2\16\1\17\1\0\2\17\3\20"+
    "\3\0\1\21\2\0\2\22\4\0\1\3\3\23\1\24"+
    "\1\0\1\25\1\0\1\26\1\0\1\3\1\0\1\3"+
    "\5\0\1\3\1\0\1\3\1\0\3\27\3\30\1\0"+
    "\1\3\3\0\3\31\2\0\3\32\1\0\1\33\1\34"+
    "\3\35\3\0\1\36\2\0\1\37\1\0\1\40\3\0"+
    "\3\41\4\0\1\42\5\0\3\43\3\44\1\0\1\45"+
    "\1\46\3\0\3\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[210];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\24\0\50\0\74\0\120\0\144\0\144\0\170"+
    "\0\214\0\240\0\264\0\310\0\334\0\360\0\u0104\0\u0118"+
    "\0\u012c\0\u0140\0\u0154\0\u0168\0\u017c\0\u0190\0\u01a4\0\u01b8"+
    "\0\u01cc\0\170\0\u01e0\0\144\0\170\0\214\0\u01f4\0\u0208"+
    "\0\u021c\0\u0230\0\u0244\0\u0258\0\u026c\0\u0280\0\u0280\0\u0294"+
    "\0\u02a8\0\u01e0\0\144\0\u02bc\0\u02d0\0\u01e0\0\144\0\u02e4"+
    "\0\u01e0\0\144\0\u02f8\0\u0154\0\u01e0\0\144\0\u0154\0\u030c"+
    "\0\u01e0\0\144\0\u030c\0\u0320\0\u0334\0\u01e0\0\144\0\u0334"+
    "\0\u0348\0\u035c\0\u0370\0\u01b8\0\u01e0\0\144\0\u01b8\0\u01cc"+
    "\0\u01e0\0\144\0\u01cc\0\144\0\u0384\0\u0398\0\u03ac\0\u03c0"+
    "\0\u03d4\0\u03e8\0\u03fc\0\u0410\0\144\0\u0280\0\u0424\0\u0438"+
    "\0\u0438\0\u044c\0\u044c\0\u0460\0\u0474\0\u0474\0\u0488\0\u0488"+
    "\0\u049c\0\u04b0\0\u04c4\0\u04d8\0\u04ec\0\u0500\0\144\0\170"+
    "\0\u0514\0\u0528\0\144\0\170\0\u053c\0\144\0\170\0\u0550"+
    "\0\u0564\0\u0578\0\144\0\u058c\0\u05a0\0\u01e0\0\144\0\u05b4"+
    "\0\u05c8\0\u05dc\0\u05f0\0\u05f0\0\u0604\0\144\0\170\0\144"+
    "\0\u0618\0\144\0\u062c\0\144\0\u0640\0\u0640\0\u0654\0\u0654"+
    "\0\u0668\0\u067c\0\u0690\0\u06a4\0\u06b8\0\u06a4\0\u06cc\0\u06cc"+
    "\0\u06e0\0\u06f4\0\144\0\u0640\0\u0708\0\144\0\u0654\0\u071c"+
    "\0\u071c\0\u0730\0\u0744\0\u0758\0\u076c\0\144\0\u06a4\0\u0780"+
    "\0\u0794\0\u07a8\0\144\0\u06cc\0\u07bc\0\144\0\144\0\u07d0"+
    "\0\144\0\u071c\0\u07e4\0\u07f8\0\u080c\0\144\0\u0820\0\u0834"+
    "\0\144\0\u0848\0\144\0\u085c\0\u0870\0\u0884\0\u0898\0\144"+
    "\0\u05f0\0\u08ac\0\u08c0\0\u08d4\0\u08e8\0\144\0\u08fc\0\u0910"+
    "\0\u0924\0\u0938\0\u094c\0\u0960\0\144\0\170\0\u0974\0\144"+
    "\0\u06a4\0\u0988\0\144\0\144\0\u099c\0\u09b0\0\u09c4\0\u09d8"+
    "\0\144\0\170";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[210];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\6\1\7\2\6\1\7\17\6\1\10\1\7\1\11"+
    "\1\10\1\7\1\10\1\12\1\10\1\13\5\10\1\14"+
    "\4\10\1\15\1\10\1\7\2\10\1\7\1\10\1\16"+
    "\1\17\1\20\1\21\1\22\3\10\1\14\4\10\1\15"+
    "\1\10\1\7\2\10\1\7\2\10\1\23\1\24\1\10"+
    "\1\25\1\26\2\10\1\14\4\10\1\15\1\10\1\7"+
    "\1\11\1\10\1\7\3\10\1\27\5\10\1\14\1\30"+
    "\1\31\2\10\1\15\24\0\1\32\1\33\2\32\1\34"+
    "\1\35\17\32\1\33\1\36\1\37\1\34\1\35\6\32"+
    "\1\40\1\41\1\42\6\32\1\33\2\32\1\34\1\35"+
    "\1\43\16\32\1\33\2\32\1\34\1\35\2\32\1\44"+
    "\14\32\1\33\2\32\1\34\1\35\13\32\1\45\2\32"+
    "\1\46\1\33\2\46\1\34\1\47\16\46\1\32\1\33"+
    "\2\32\1\34\1\35\1\50\16\32\1\33\2\32\1\34"+
    "\1\35\1\32\1\51\15\32\1\52\2\32\1\53\1\35"+
    "\1\32\1\54\1\55\14\32\1\56\2\32\1\57\1\35"+
    "\1\32\1\60\15\32\1\61\2\32\1\62\1\35\1\32"+
    "\1\63\14\32\1\64\1\65\2\64\1\66\1\67\16\64"+
    "\1\70\1\71\2\70\1\72\1\73\2\70\1\74\13\70"+
    "\1\75\1\76\2\75\1\77\1\100\4\75\1\101\11\75"+
    "\1\32\1\33\2\32\1\34\1\35\5\32\1\102\11\32"+
    "\1\33\2\32\1\34\1\35\2\32\1\103\13\32\1\104"+
    "\1\105\2\104\1\106\1\107\16\104\1\110\1\111\2\110"+
    "\1\112\1\113\16\110\4\0\1\114\17\0\1\32\1\33"+
    "\1\115\1\32\1\34\1\35\17\32\1\33\1\116\1\32"+
    "\1\34\1\35\17\32\1\33\1\117\1\32\1\34\1\35"+
    "\17\32\1\33\1\120\1\32\1\34\1\35\17\32\1\33"+
    "\2\32\1\34\1\35\1\121\16\32\1\33\2\32\1\34"+
    "\1\35\2\32\1\122\14\32\1\33\2\32\1\34\1\35"+
    "\14\32\1\123\1\32\1\46\1\124\2\46\1\125\1\126"+
    "\16\46\1\32\1\33\2\32\1\34\1\35\1\127\15\32"+
    "\1\130\1\33\2\130\1\34\1\131\16\130\1\132\1\33"+
    "\2\132\1\34\1\133\16\132\1\32\1\33\2\32\1\34"+
    "\1\35\2\32\1\134\13\32\1\135\1\33\2\135\1\34"+
    "\1\136\16\135\1\137\1\33\2\137\1\34\1\140\16\137"+
    "\1\70\1\71\2\70\1\72\1\73\17\70\1\71\2\70"+
    "\1\72\1\73\2\70\1\141\13\70\1\75\1\76\2\75"+
    "\1\77\1\100\17\75\1\76\2\75\1\77\1\100\4\75"+
    "\1\142\11\75\1\32\1\33\2\32\1\34\1\35\1\32"+
    "\1\143\15\32\1\33\2\32\1\34\1\35\2\32\1\144"+
    "\14\32\1\33\1\115\1\32\1\34\1\35\7\32\1\41"+
    "\1\42\6\32\1\145\1\116\1\146\1\147\1\150\17\32"+
    "\1\151\1\117\1\152\1\153\1\154\17\32\1\155\1\120"+
    "\1\32\1\156\1\157\17\32\1\33\2\32\1\34\1\35"+
    "\1\32\1\160\15\32\1\33\2\32\1\34\1\35\1\32"+
    "\1\161\15\32\1\33\2\32\1\34\1\35\14\32\1\162"+
    "\1\32\4\0\1\163\17\0\1\32\1\33\2\32\1\34"+
    "\1\35\1\164\1\165\14\32\1\130\1\166\2\130\1\167"+
    "\1\131\16\130\1\132\1\52\2\132\1\53\1\133\16\132"+
    "\1\32\1\33\2\32\1\34\1\35\1\32\1\170\14\32"+
    "\1\135\1\56\2\135\1\57\1\136\16\135\1\137\1\61"+
    "\2\137\1\62\1\140\16\137\1\70\1\71\2\70\1\72"+
    "\1\73\1\70\1\171\14\70\1\75\1\76\2\75\1\77"+
    "\1\100\1\75\1\172\14\75\1\173\1\33\2\173\1\34"+
    "\1\174\16\173\1\32\1\175\2\32\1\176\1\177\16\32"+
    "\4\0\1\200\17\0\1\32\1\33\1\201\1\32\1\34"+
    "\1\35\16\32\4\0\1\202\17\0\1\32\1\33\1\203"+
    "\1\32\1\34\1\35\16\32\4\0\1\204\17\0\1\205"+
    "\1\33\2\205\1\34\1\206\16\205\1\207\1\33\2\207"+
    "\1\34\1\210\16\207\1\32\1\33\2\32\1\34\1\35"+
    "\1\32\1\211\15\32\1\33\2\32\1\34\1\35\1\212"+
    "\16\32\1\33\1\213\1\32\1\34\1\35\16\32\1\214"+
    "\1\33\1\215\1\214\1\34\1\216\16\214\1\207\1\71"+
    "\2\207\1\72\1\210\16\207\1\217\1\76\2\217\1\77"+
    "\1\220\16\217\1\173\1\33\2\173\1\34\1\174\1\173"+
    "\1\221\14\173\4\0\1\176\17\0\1\32\1\145\1\201"+
    "\1\32\1\147\1\150\17\32\1\151\1\203\1\32\1\153"+
    "\1\154\16\32\1\205\1\222\2\205\1\223\1\224\16\205"+
    "\1\207\1\225\2\207\1\226\1\227\16\207\1\230\1\33"+
    "\2\230\1\34\1\231\16\230\1\32\1\33\2\32\1\34"+
    "\1\35\1\232\16\32\1\33\1\213\1\233\1\34\1\35"+
    "\1\32\1\234\14\32\1\214\1\235\2\214\1\236\1\237"+
    "\17\214\1\235\1\215\1\240\1\236\1\237\1\214\1\241"+
    "\14\214\1\217\1\242\2\217\1\243\1\244\16\217\1\173"+
    "\1\33\2\173\1\34\1\174\1\173\1\221\3\173\1\245"+
    "\10\173\4\0\1\246\23\0\1\247\17\0\1\230\1\250"+
    "\2\230\1\251\1\252\16\230\1\32\1\33\2\32\1\34"+
    "\1\35\1\253\16\32\1\33\1\254\1\32\1\34\1\35"+
    "\17\32\1\33\2\32\1\34\1\35\1\255\15\32\4\0"+
    "\1\256\17\0\1\214\1\235\1\257\1\214\1\236\1\237"+
    "\17\214\1\235\2\214\1\236\1\237\2\214\1\260\13\214"+
    "\4\0\1\261\17\0\1\173\1\33\2\173\1\34\1\174"+
    "\1\173\1\221\3\173\1\262\10\173\4\0\1\263\17\0"+
    "\1\32\1\33\2\32\1\34\1\35\1\264\16\32\1\33"+
    "\1\254\1\32\1\34\1\35\1\32\1\234\15\32\1\33"+
    "\2\32\1\34\1\35\1\265\15\32\1\214\1\235\1\257"+
    "\1\214\1\236\1\237\1\214\1\241\15\214\1\235\2\214"+
    "\1\236\1\237\2\214\1\266\13\214\1\173\1\267\2\173"+
    "\1\270\1\271\1\173\1\272\14\173\1\32\1\33\2\32"+
    "\1\34\1\35\1\273\16\32\1\33\2\32\1\34\1\35"+
    "\1\274\15\32\1\214\1\235\2\214\1\236\1\237\2\214"+
    "\1\275\13\214\4\0\1\276\17\0\1\277\1\33\2\277"+
    "\1\34\1\174\16\277\1\32\1\33\2\32\1\34\1\35"+
    "\1\300\16\32\1\33\2\32\1\34\1\35\1\301\15\32"+
    "\1\214\1\235\2\214\1\236\1\237\2\214\1\302\13\214"+
    "\1\277\1\267\2\277\1\270\1\271\16\277\1\32\1\33"+
    "\2\32\1\34\1\35\1\303\16\32\1\304\2\32\1\305"+
    "\1\306\16\32\1\214\1\307\2\214\1\310\1\311\16\214"+
    "\1\32\1\33\2\32\1\34\1\35\1\312\15\32\4\0"+
    "\1\313\23\0\1\314\17\0\1\32\1\33\2\32\1\34"+
    "\1\35\1\315\16\32\1\33\2\32\1\34\1\35\1\316"+
    "\16\32\1\33\2\32\1\34\1\35\1\317\16\32\1\320"+
    "\2\32\1\321\1\322\16\32\4\0\1\321\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2540];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\5\0\2\11\22\1\1\0\1\1\1\11\1\1\11\0"+
    "\1\1\2\0\1\1\1\11\2\0\1\1\1\11\1\0"+
    "\1\1\1\11\2\0\1\1\1\11\1\1\1\0\1\1"+
    "\1\11\1\1\2\0\1\1\1\11\1\1\4\0\1\1"+
    "\1\11\1\1\1\0\1\1\1\11\1\1\1\11\7\0"+
    "\1\1\1\11\1\1\2\0\1\1\1\0\1\1\2\0"+
    "\1\1\1\0\1\1\4\0\1\1\1\0\1\11\2\1"+
    "\1\0\1\11\2\1\1\11\1\1\3\0\1\11\2\0"+
    "\1\1\1\11\4\0\2\1\1\11\1\1\1\11\1\0"+
    "\1\11\1\0\1\11\1\0\1\1\1\0\1\1\5\0"+
    "\1\1\1\0\1\1\1\0\1\1\1\11\2\1\1\11"+
    "\1\1\1\0\1\1\3\0\1\1\1\11\1\1\2\0"+
    "\1\1\1\11\1\1\1\0\2\11\1\1\1\11\1\1"+
    "\3\0\1\11\2\0\1\11\1\0\1\11\3\0\1\1"+
    "\1\11\1\1\4\0\1\11\5\0\1\1\1\11\2\1"+
    "\1\11\1\1\1\0\2\11\3\0\1\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[210];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public DiffLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      if (zzMarkedPosL > zzStartRead) {
        switch (zzBufferL.charAt(zzMarkedPosL-1)) {
        case '\n':
        case '\u000B':  // fall though
        case '\u000C':  // fall though
        case '\u0085':  // fall though
        case '\u2028':  // fall though
        case '\u2029':  // fall though
          zzAtBOL = true;
          break;
        case '\r': 
          if (zzMarkedPosL < zzEndReadL)
            zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          else if (zzAtEOF)
            zzAtBOL = false;
          else {
            boolean eof = zzRefill();
            zzMarkedPosL = zzMarkedPos;
            zzEndReadL = zzEndRead;
            zzBufferL = zzBuffer;
            if (eof) 
              zzAtBOL = false;
            else 
              zzAtBOL = zzBufferL.charAt(zzMarkedPosL) != '\n';
          }
          break;
        default:
          zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 40: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 41: break;
          case 3: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return OTHER;
            } 
            // fall through
          case 42: break;
          case 4: 
            { return CONTEXT_DELETED_LINE;
            } 
            // fall through
          case 43: break;
          case 5: 
            { return CONTEXT_CHANGED_LINE;
            } 
            // fall through
          case 44: break;
          case 6: 
            { return CONTEXT_INSERTED_LINE;
            } 
            // fall through
          case 45: break;
          case 7: 
            { return UNIFIED_COMMON_LINE;
            } 
            // fall through
          case 46: break;
          case 8: 
            { return UNIFIED_DELETED_LINE;
            } 
            // fall through
          case 47: break;
          case 9: 
            { return UNIFIED_INSERTED_LINE;
            } 
            // fall through
          case 48: break;
          case 10: 
            { return NORMAL_TO_LINE;
            } 
            // fall through
          case 49: break;
          case 11: 
            { return NORMAL_FROM_LINE;
            } 
            // fall through
          case 50: break;
          case 12: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return OTHER;
            } 
            // fall through
          case 51: break;
          case 13: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return EOLHINT;
            } 
            // fall through
          case 52: break;
          case 14: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { yybegin(NORMAL); return NORMAL_ADD_COMMAND;
            } 
            // fall through
          case 53: break;
          case 15: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { yybegin(NORMAL); return NORMAL_CHANGE_COMMAND;
            } 
            // fall through
          case 54: break;
          case 16: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { yybegin(NORMAL); return NORMAL_DELETE_COMMAND;
            } 
            // fall through
          case 55: break;
          case 17: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return EOLHINT;
            } 
            // fall through
          case 56: break;
          case 18: 
            { return CONTEXT_COMMON_LINE;
            } 
            // fall through
          case 57: break;
          case 19: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 3);
            { return NORMAL_SEPARATOR;
            } 
            // fall through
          case 58: break;
          case 20: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { yybegin(NORMAL); return NORMAL_ADD_COMMAND;
            } 
            // fall through
          case 59: break;
          case 21: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { yybegin(NORMAL); return NORMAL_CHANGE_COMMAND;
            } 
            // fall through
          case 60: break;
          case 22: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { yybegin(NORMAL); return NORMAL_DELETE_COMMAND;
            } 
            // fall through
          case 61: break;
          case 23: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { yybegin(CONTEXT); return CONTEXT_FROM_LABEL;
            } 
            // fall through
          case 62: break;
          case 24: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { yybegin(UNIFIED); return UNIFIED_FROM_LABEL;
            } 
            // fall through
          case 63: break;
          case 25: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return CONTEXT_TO_LABEL;
            } 
            // fall through
          case 64: break;
          case 26: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return UNIFIED_TO_LABEL;
            } 
            // fall through
          case 65: break;
          case 27: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { yybegin(CONTEXT); return CONTEXT_FROM_LABEL;
            } 
            // fall through
          case 66: break;
          case 28: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { yybegin(UNIFIED); return UNIFIED_FROM_LABEL;
            } 
            // fall through
          case 67: break;
          case 29: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { yybegin(YYINITIAL); return COMMAND;
            } 
            // fall through
          case 68: break;
          case 30: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return CONTEXT_TO_LABEL;
            } 
            // fall through
          case 69: break;
          case 31: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return UNIFIED_TO_LABEL;
            } 
            // fall through
          case 70: break;
          case 32: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { yybegin(YYINITIAL); return COMMAND;
            } 
            // fall through
          case 71: break;
          case 33: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return UNIFIED_LINE_NUMBERS;
            } 
            // fall through
          case 72: break;
          case 34: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return UNIFIED_LINE_NUMBERS;
            } 
            // fall through
          case 73: break;
          case 35: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return CONTEXT_FROM_LINE_NUMBERS;
            } 
            // fall through
          case 74: break;
          case 36: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -1);
            { return CONTEXT_TO_LINE_NUMBERS;
            } 
            // fall through
          case 75: break;
          case 37: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return CONTEXT_FROM_LINE_NUMBERS;
            } 
            // fall through
          case 76: break;
          case 38: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzMarkedPos, -2);
            { return CONTEXT_TO_LINE_NUMBERS;
            } 
            // fall through
          case 77: break;
          case 39: 
            // lookahead expression with fixed base length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL/*, zzStartRead, zzEndRead - zzStartRead*/, zzStartRead, 15);
            { return CONTEXT_HUNK_SEPERATOR;
            } 
            // fall through
          case 78: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
