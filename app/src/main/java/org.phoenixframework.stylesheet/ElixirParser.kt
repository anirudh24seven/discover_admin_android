// Generated from /Users/anirudh/workspace/liveview-client-jetpack/client/antlr/ElixirParser.g4 by ANTLR 4.13.1
package org.phoenixframework.liveview.stylesheet

import com.strumenta.antlrkotlin.runtime.JsName
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.misc.*
import org.antlr.v4.kotlinruntime.tree.*
import kotlin.jvm.JvmField

@Suppress(
    // This is required as we are using a custom JsName alias that is not recognized by the IDE.
    // No name clashes will happen tho.
    "JS_NAME_CLASH",
    "UNUSED_VARIABLE",
    "ClassName",
    "FunctionName",
    "LocalVariableName",
    "ConstPropertyName",
    "ConvertSecondaryConstructorToPrimary",
    "CanBeVal",
)
public open class ElixirParser(input: TokenStream) : Parser(input) {
    private companion object {
        init {
            RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.runtimeVersion)
        }

        private const val SERIALIZED_ATN: String =
            "\u0004\u0001\u0022\u0162\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\u0008\u0007\u0008\u0002\u0009\u0007\u0009\u0002\u000a\u0007\u000a\u0002\u000b\u0007\u000b\u0002\u000c\u0007\u000c\u0002\u000d\u0007\u000d\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0003\u0001\u002b\u0008\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0031\u0008\u0001\u000a\u0001\u000c\u0001\u0034\u0009\u0001\u0001\u0001\u0003\u0001\u0037\u0008\u0001\u0001\u0002\u0004\u0002\u003a\u0008\u0002\u000b\u0002\u000c\u0002\u003b\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0056\u0008\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u005d\u0008\u0003\u000a\u0003\u000c\u0003\u0060\u0009\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u006a\u0008\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u0070\u0008\u0007\u000a\u0007\u000c\u0007\u0073\u0009\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0077\u0008\u0007\u0001\u0007\u0005\u0007\u007a\u0008\u0007\u000a\u0007\u000c\u0007\u007d\u0009\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0083\u0008\u0007\u000a\u0007\u000c\u0007\u0086\u0009\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008a\u0008\u0007\u0001\u0007\u0005\u0007\u008d\u0008\u0007\u000a\u0007\u000c\u0007\u0090\u0009\u0007\u0003\u0007\u0092\u0008\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0097\u0008\u0007\u000a\u0007\u000c\u0007\u009a\u0009\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009f\u0008\u0007\u0001\u0007\u0005\u0007\u00a2\u0008\u0007\u000a\u0007\u000c\u0007\u00a5\u0009\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ab\u0008\u0007\u000a\u0007\u000c\u0007\u00ae\u0009\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00b2\u0008\u0007\u000a\u0007\u000c\u0007\u00b5\u0009\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b9\u0008\u0007\u0001\u0008\u0001\u0008\u0001\u0008\u0005\u0008\u00be\u0008\u0008\u000a\u0008\u000c\u0008\u00c1\u0009\u0008\u0001\u0009\u0001\u0009\u0001\u0009\u0003\u0009\u00c6\u0008\u0009\u0003\u0009\u00c8\u0008\u0009\u0001\u0009\u0001\u0009\u0001\u000a\u0001\u000a\u0005\u000a\u00ce\u0008\u000a\u000a\u000a\u000c\u000a\u00d1\u0009\u000a\u0001\u000a\u0001\u000a\u0001\u000a\u0005\u000a\u00d6\u0008\u000a\u000a\u000a\u000c\u000a\u00d9\u0009\u000a\u0001\u000a\u0001\u000a\u0001\u000a\u0003\u000a\u00de\u0008\u000a\u0001\u000a\u0001\u000a\u0003\u000a\u00e2\u0008\u000a\u0001\u000a\u0005\u000a\u00e5\u0008\u000a\u000a\u000a\u000c\u000a\u00e8\u0009\u000a\u0001\u000a\u0001\u000a\u0001\u000a\u0001\u000a\u0005\u000a\u00ee\u0008\u000a\u000a\u000a\u000c\u000a\u00f1\u0009\u000a\u0001\u000a\u0001\u000a\u0001\u000a\u0003\u000a\u00f6\u0008\u000a\u0001\u000a\u0001\u000a\u0003\u000a\u00fa\u0008\u000a\u0001\u000a\u0005\u000a\u00fd\u0008\u000a\u000a\u000a\u000c\u000a\u0100\u0009\u000a\u0001\u000a\u0001\u000a\u0001\u000a\u0001\u000a\u0005\u000a\u0106\u0008\u000a\u000a\u000a\u000c\u000a\u0109\u0009\u000a\u0001\u000a\u0001\u000a\u0001\u000a\u0003\u000a\u010e\u0008\u000a\u0001\u000a\u0001\u000a\u0001\u000a\u0003\u000a\u0113\u0008\u000a\u0001\u000a\u0003\u000a\u0116\u0008\u000a\u0001\u000a\u0005\u000a\u0119\u0008\u000a\u000a\u000a\u000c\u000a\u011c\u0009\u000a\u0001\u000a\u0001\u000a\u0003\u000a\u0120\u0008\u000a\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0125\u0008\u000b\u000a\u000b\u000c\u000b\u0128\u0009\u000b\u0001\u000c\u0001\u000c\u0001\u000c\u0001\u000c\u0001\u000d\u0001\u000d\u0001\u000d\u0005\u000d\u0131\u0008\u000d\u000a\u000d\u000c\u000d\u0134\u0009\u000d\u0001\u000d\u0005\u000d\u0137\u0008\u000d\u000a\u000d\u000c\u000d\u013a\u0009\u000d\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0143\u0008\u000f\u000a\u000f\u000c\u000f\u0146\u0009\u000f\u0001\u000f\u0005\u000f\u0149\u0008\u000f\u000a\u000f\u000c\u000f\u014c\u0009\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0155\u0008\u0011\u000a\u0011\u000c\u0011\u0158\u0009\u0011\u0001\u0011\u0005\u0011\u015b\u0008\u0011\u000a\u0011\u000c\u0011\u015e\u0009\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0001\u0006\u0013\u0000\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0000\u0002\u0002\u0000\u0002\u0002\u0022\u0022\u0001\u0000\u0005\u0006\u0190\u0000\u0026\u0001\u0000\u0000\u0000\u0002\u002a\u0001\u0000\u0000\u0000\u0004\u0039\u0001\u0000\u0000\u0000\u0006\u0055\u0001\u0000\u0000\u0000\u0008\u0061\u0001\u0000\u0000\u0000\u000a\u0069\u0001\u0000\u0000\u0000\u000c\u006b\u0001\u0000\u0000\u0000\u000e\u00b8\u0001\u0000\u0000\u0000\u0010\u00ba\u0001\u0000\u0000\u0000\u0012\u00c2\u0001\u0000\u0000\u0000\u0014\u011f\u0001\u0000\u0000\u0000\u0016\u0121\u0001\u0000\u0000\u0000\u0018\u0129\u0001\u0000\u0000\u0000\u001a\u012d\u0001\u0000\u0000\u0000\u001c\u013b\u0001\u0000\u0000\u0000\u001e\u013f\u0001\u0000\u0000\u0000\u0020\u014d\u0001\u0000\u0000\u0000\u0022\u0151\u0001\u0000\u0000\u0000\u0024\u015f\u0001\u0000\u0000\u0000\u0026\u0027\u0003\u0002\u0001\u0000\u0027\u0028\u0005\u0000\u0000\u0001\u0028\u0001\u0001\u0000\u0000\u0000\u0029\u002b\u0003\u0004\u0002\u0000\u002a\u0029\u0001\u0000\u0000\u0000\u002a\u002b\u0001\u0000\u0000\u0000\u002b\u002c\u0001\u0000\u0000\u0000\u002c\u0032\u0003\u0006\u0003\u0000\u002d\u002e\u0003\u0004\u0002\u0000\u002e\u002f\u0003\u0006\u0003\u0000\u002f\u0031\u0001\u0000\u0000\u0000\u0030\u002d\u0001\u0000\u0000\u0000\u0031\u0034\u0001\u0000\u0000\u0000\u0032\u0030\u0001\u0000\u0000\u0000\u0032\u0033\u0001\u0000\u0000\u0000\u0033\u0036\u0001\u0000\u0000\u0000\u0034\u0032\u0001\u0000\u0000\u0000\u0035\u0037\u0003\u0004\u0002\u0000\u0036\u0035\u0001\u0000\u0000\u0000\u0036\u0037\u0001\u0000\u0000\u0000\u0037\u0003\u0001\u0000\u0000\u0000\u0038\u003a\u0007\u0000\u0000\u0000\u0039\u0038\u0001\u0000\u0000\u0000\u003a\u003b\u0001\u0000\u0000\u0000\u003b\u0039\u0001\u0000\u0000\u0000\u003b\u003c\u0001\u0000\u0000\u0000\u003c\u0005\u0001\u0000\u0000\u0000\u003d\u003e\u0006\u0003\uffff\uffff\u0000\u003e\u003f\u0005\u0019\u0000\u0000\u003f\u0040\u0003\u0006\u0003\u0000\u0040\u0041\u0005\u001a\u0000\u0000\u0041\u0056\u0001\u0000\u0000\u0000\u0042\u0043\u0003\u0008\u0004\u0000\u0043\u0044\u0003\u0006\u0003\u0012\u0044\u0056\u0001\u0000\u0000\u0000\u0045\u0056\u0003\u000e\u0007\u0000\u0046\u0056\u0003\u0012\u0009\u0000\u0047\u0056\u0003\u0014\u000a\u0000\u0048\u0056\u0003\u000c\u0006\u0000\u0049\u0056\u0005\u0004\u0000\u0000\u004a\u0056\u0005\u000b\u0000\u0000\u004b\u0056\u0005\u0008\u0000\u0000\u004c\u0056\u0005\u0009\u0000\u0000\u004d\u0056\u0005\u000a\u0000\u0000\u004e\u0056\u0005\u000c\u0000\u0000\u004f\u0056\u0005\u000d\u0000\u0000\u0050\u0056\u0005\u000e\u0000\u0000\u0051\u0056\u0005\u000f\u0000\u0000\u0052\u0056\u0005\u0010\u0000\u0000\u0053\u0056\u0005\u0011\u0000\u0000\u0054\u0056\u0005\u0007\u0000\u0000\u0055\u003d\u0001\u0000\u0000\u0000\u0055\u0042\u0001\u0000\u0000\u0000\u0055\u0045\u0001\u0000\u0000\u0000\u0055\u0046\u0001\u0000\u0000\u0000\u0055\u0047\u0001\u0000\u0000\u0000\u0055\u0048\u0001\u0000\u0000\u0000\u0055\u0049\u0001\u0000\u0000\u0000\u0055\u004a\u0001\u0000\u0000\u0000\u0055\u004b\u0001\u0000\u0000\u0000\u0055\u004c\u0001\u0000\u0000\u0000\u0055\u004d\u0001\u0000\u0000\u0000\u0055\u004e\u0001\u0000\u0000\u0000\u0055\u004f\u0001\u0000\u0000\u0000\u0055\u0050\u0001\u0000\u0000\u0000\u0055\u0051\u0001\u0000\u0000\u0000\u0055\u0052\u0001\u0000\u0000\u0000\u0055\u0053\u0001\u0000\u0000\u0000\u0055\u0054\u0001\u0000\u0000\u0000\u0056\u005e\u0001\u0000\u0000\u0000\u0057\u0058\u000a\u0011\u0000\u0000\u0058\u0059\u0005\u0016\u0000\u0000\u0059\u005d\u0003\u0006\u0003\u0012\u005a\u005b\u000a\u0014\u0000\u0000\u005b\u005d\u0003\u000a\u0005\u0000\u005c\u0057\u0001\u0000\u0000\u0000\u005c\u005a\u0001\u0000\u0000\u0000\u005d\u0060\u0001\u0000\u0000\u0000\u005e\u005c\u0001\u0000\u0000\u0000\u005e\u005f\u0001\u0000\u0000\u0000\u005f\u0007\u0001\u0000\u0000\u0000\u0060\u005e\u0001\u0000\u0000\u0000\u0061\u0062\u0005\u0014\u0000\u0000\u0062\u0009\u0001\u0000\u0000\u0000\u0063\u0064\u0005\u001b\u0000\u0000\u0064\u0065\u0003\u0006\u0003\u0000\u0065\u0066\u0005\u001c\u0000\u0000\u0066\u006a\u0001\u0000\u0000\u0000\u0067\u0068\u0005\u0013\u0000\u0000\u0068\u006a\u0003\u0006\u0003\u0000\u0069\u0063\u0001\u0000\u0000\u0000\u0069\u0067\u0001\u0000\u0000\u0000\u006a\u000b\u0001\u0000\u0000\u0000\u006b\u006c\u0007\u0001\u0000\u0000\u006c\u000d\u0001\u0000\u0000\u0000\u006d\u0071\u0005\u001b\u0000\u0000\u006e\u0070\u0005\u0002\u0000\u0000\u006f\u006e\u0001\u0000\u0000\u0000\u0070\u0073\u0001\u0000\u0000\u0000\u0071\u006f\u0001\u0000\u0000\u0000\u0071\u0072\u0001\u0000\u0000\u0000\u0072\u0074\u0001\u0000\u0000\u0000\u0073\u0071\u0001\u0000\u0000\u0000\u0074\u0076\u0003\u0022\u0011\u0000\u0075\u0077\u0005\u0020\u0000\u0000\u0076\u0075\u0001\u0000\u0000\u0000\u0076\u0077\u0001\u0000\u0000\u0000\u0077\u007b\u0001\u0000\u0000\u0000\u0078\u007a\u0005\u0002\u0000\u0000\u0079\u0078\u0001\u0000\u0000\u0000\u007a\u007d\u0001\u0000\u0000\u0000\u007b\u0079\u0001\u0000\u0000\u0000\u007b\u007c\u0001\u0000\u0000\u0000\u007c\u007e\u0001\u0000\u0000\u0000\u007d\u007b\u0001\u0000\u0000\u0000\u007e\u007f\u0005\u001c\u0000\u0000\u007f\u00b9\u0001\u0000\u0000\u0000\u0080\u0084\u0005\u001b\u0000\u0000\u0081\u0083\u0005\u0002\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0091\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0089\u0003\u0022\u0011\u0000\u0088\u008a\u0005\u0020\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008e\u0001\u0000\u0000\u0000\u008b\u008d\u0005\u0002\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0087\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u00b9\u0005\u001c\u0000\u0000\u0094\u0098\u0005\u001b\u0000\u0000\u0095\u0097\u0005\u0002\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0003\u0010\u0008\u0000\u009c\u009d\u0005\u0020\u0000\u0000\u009d\u009f\u0003\u001a\u000d\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a3\u0001\u0000\u0000\u0000\u00a0\u00a2\u0005\u0002\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u001c\u0000\u0000\u00a7\u00b9\u0001\u0000\u0000\u0000\u00a8\u00ac\u0005\u001b\u0000\u0000\u00a9\u00ab\u0005\u0002\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b3\u0003\u001a\u000d\u0000\u00b0\u00b2\u0005\u0002\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u001c\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u006d\u0001\u0000\u0000\u0000\u00b8\u0080\u0001\u0000\u0000\u0000\u00b8\u0094\u0001\u0000\u0000\u0000\u00b8\u00a8\u0001\u0000\u0000\u0000\u00b9\u000f\u0001\u0000\u0000\u0000\u00ba\u00bf\u0003\u0012\u0009\u0000\u00bb\u00bc\u0005\u0020\u0000\u0000\u00bc\u00be\u0003\u0012\u0009\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u0011\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c7\u0005\u001d\u0000\u0000\u00c3\u00c5\u0003\u0022\u0011\u0000\u00c4\u00c6\u0005\u0020\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u001e\u0000\u0000\u00ca\u0013\u0001\u0000\u0000\u0000\u00cb\u00cf\u0005\u001f\u0000\u0000\u00cc\u00ce\u0005\u0002\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u0120\u0005\u001e\u0000\u0000\u00d3\u00d7\u0005\u001f\u0000\u0000\u00d4\u00d6\u0005\u0002\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00dd\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0003\u0006\u0003\u0000\u00db\u00dc\u0005\u0018\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0003\u0016\u000b\u0000\u00e0\u00e2\u0005\u0020\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e6\u0001\u0000\u0000\u0000\u00e3\u00e5\u0005\u0002\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u001e\u0000\u0000\u00ea\u0120\u0001\u0000\u0000\u0000\u00eb\u00ef\u0005\u001f\u0000\u0000\u00ec\u00ee\u0005\u0002\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f5\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003\u0006\u0003\u0000\u00f3\u00f4\u0005\u0018\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9\u0003\u001a\u000d\u0000\u00f8\u00fa\u0005\u0020\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fe\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005\u0002\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u001e\u0000\u0000\u0102\u0120\u0001\u0000\u0000\u0000\u0103\u0107\u0005\u001f\u0000\u0000\u0104\u0106\u0005\u0002\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010d\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010b\u0003\u0006\u0003\u0000\u010b\u010c\u0005\u0018\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0112\u0003\u0016\u000b\u0000\u0110\u0111\u0005\u0020\u0000\u0000\u0111\u0113\u0003\u001a\u000d\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0116\u0005\u0020\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u011a\u0001\u0000\u0000\u0000\u0117\u0119\u0005\u0002\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u001e\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u00cb\u0001\u0000\u0000\u0000\u011f\u00d3\u0001\u0000\u0000\u0000\u011f\u00eb\u0001\u0000\u0000\u0000\u011f\u0103\u0001\u0000\u0000\u0000\u0120\u0015\u0001\u0000\u0000\u0000\u0121\u0126\u0003\u0018\u000c\u0000\u0122\u0123\u0005\u0020\u0000\u0000\u0123\u0125\u0003\u0018\u000c\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0017\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012a\u0003\u0006\u0003\u0000\u012a\u012b\u0005\u0017\u0000\u0000\u012b\u012c\u0003\u0006\u0003\u0000\u012c\u0019\u0001\u0000\u0000\u0000\u012d\u0138\u0003\u001c\u000e\u0000\u012e\u0132\u0005\u0020\u0000\u0000\u012f\u0131\u0005\u0002\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0137\u0003\u001c\u000e\u0000\u0136\u012e\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u001b\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013c\u0003\u0024\u0012\u0000\u013c\u013d\u0005\u0021\u0000\u0000\u013d\u013e\u0003\u0006\u0003\u0000\u013e\u001d\u0001\u0000\u0000\u0000\u013f\u014a\u0003\u0020\u0010\u0000\u0140\u0144\u0005\u0020\u0000\u0000\u0141\u0143\u0005\u0002\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u0149\u0003\u0020\u0010\u0000\u0148\u0140\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u001f\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u014e\u0003\u0024\u0012\u0000\u014e\u014f\u0005\u0021\u0000\u0000\u014f\u0150\u0003\u0006\u0003\u0000\u0150\u0021\u0001\u0000\u0000\u0000\u0151\u015c\u0003\u0006\u0003\u0000\u0152\u0156\u0005\u0020\u0000\u0000\u0153\u0155\u0005\u0002\u0000\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015b\u0003\u0006\u0003\u0000\u015a\u0152\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u0023\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0012\u0000\u0000\u0160\u0025\u0001\u0000\u0000\u0000\u002e\u002a\u0032\u0036\u003b\u0055\u005c\u005e\u0069\u0071\u0076\u007b\u0084\u0089\u008e\u0091\u0098\u009e\u00a3\u00ac\u00b3\u00b8\u00bf\u00c5\u00c7\u00cf\u00d7\u00dd\u00e1\u00e6\u00ef\u00f5\u00f9\u00fe\u0107\u010d\u0112\u0115\u011a\u011f\u0126\u0132\u0138\u0144\u014a\u0156\u015c"

        private val ATN = ATNDeserializer().deserialize(SERIALIZED_ATN.toCharArray())

        private val DECISION_TO_DFA = Array(ATN.numberOfDecisions) {
            DFA(ATN.getDecisionState(it)!!, it)
        }

        private val SHARED_CONTEXT_CACHE = PredictionContextCache()
        private val RULE_NAMES: Array<String> = arrayOf(
            "parse", "block", "eoe", "expression", "unaryOp", "expression_tail", 
            "bool_", "list", "tuples", "tuple", "map", "map_entries", "map_entry", 
            "short_map_entries", "short_map_entry", "options_", "option", 
            "expressions_", "variable"
        )

        private val LITERAL_NAMES: Array<String?> = arrayOf(
            null, null, null, null, null, "'true'", "'false'", "'nil'", 
            null, null, null, null, null, null, null, null, null, null, 
            null, "'.'", "'-'", "'..'", "'='", "'=>'", "'|'", "'('", "')'", 
            "'['", "']'", "'{'", "'}'", null, "','", "':'", "';'"
        )

        private val SYMBOLIC_NAMES: Array<String?> = arrayOf(
            null, "COMMENT", "NL", "SPACES", "ATOM", "TRUE", "FALSE", "NIL", 
            "HEXADECIMAL", "OCTAL", "BINARY", "INTEGER", "FLOAT", "SINGLE_LINE_STRING", 
            "MULTI_LINE_STRING", "SINGLE_LINE_CHARLIST", "MULTI_LINE_CHARLIST", 
            "ALIAS", "VARIABLE", "DOT", "SUB", "DOT2", "EQ", "ARROW", "PIPE", 
            "OPAR", "CPAR", "OBRACK", "CBRACK", "OBRACE", "CBRACE", "OMAP", 
            "COMMA", "COL", "SCOL"
        )

        private val VOCABULARY = VocabularyImpl(LITERAL_NAMES, SYMBOLIC_NAMES)

        private val TOKEN_NAMES: Array<String> = Array(SYMBOLIC_NAMES.size) {
            VOCABULARY.getLiteralName(it)
                ?: VOCABULARY.getSymbolicName(it)
                ?: "<INVALID>"
        }
    }

    public object Tokens {
        public const val EOF: Int = -1
        public const val COMMENT: Int = 1
        public const val NL: Int = 2
        public const val SPACES: Int = 3
        public const val ATOM: Int = 4
        public const val TRUE: Int = 5
        public const val FALSE: Int = 6
        public const val NIL: Int = 7
        public const val HEXADECIMAL: Int = 8
        public const val OCTAL: Int = 9
        public const val BINARY: Int = 10
        public const val INTEGER: Int = 11
        public const val FLOAT: Int = 12
        public const val SINGLE_LINE_STRING: Int = 13
        public const val MULTI_LINE_STRING: Int = 14
        public const val SINGLE_LINE_CHARLIST: Int = 15
        public const val MULTI_LINE_CHARLIST: Int = 16
        public const val ALIAS: Int = 17
        public const val VARIABLE: Int = 18
        public const val DOT: Int = 19
        public const val SUB: Int = 20
        public const val DOT2: Int = 21
        public const val EQ: Int = 22
        public const val ARROW: Int = 23
        public const val PIPE: Int = 24
        public const val OPAR: Int = 25
        public const val CPAR: Int = 26
        public const val OBRACK: Int = 27
        public const val CBRACK: Int = 28
        public const val OBRACE: Int = 29
        public const val CBRACE: Int = 30
        public const val OMAP: Int = 31
        public const val COMMA: Int = 32
        public const val COL: Int = 33
        public const val SCOL: Int = 34
    }

    public object Rules {
        public const val Parse: Int = 0
        public const val Block: Int = 1
        public const val Eoe: Int = 2
        public const val Expression: Int = 3
        public const val UnaryOp: Int = 4
        public const val Expression_tail: Int = 5
        public const val Bool_: Int = 6
        public const val List: Int = 7
        public const val Tuples: Int = 8
        public const val Tuple: Int = 9
        public const val Map: Int = 10
        public const val Map_entries: Int = 11
        public const val Map_entry: Int = 12
        public const val Short_map_entries: Int = 13
        public const val Short_map_entry: Int = 14
        public const val Options_: Int = 15
        public const val Option: Int = 16
        public const val Expressions_: Int = 17
        public const val Variable: Int = 18
    }

    override var interpreter: ParserATNSimulator =
        @Suppress("LeakingThis")
        ParserATNSimulator(this, ATN, DECISION_TO_DFA, SHARED_CONTEXT_CACHE)

    override val grammarFileName: String =
        "ElixirParser.g4"

    @Deprecated("Use vocabulary instead", replaceWith = ReplaceWith("vocabulary"))
    override val tokenNames: Array<String> =
        TOKEN_NAMES

    override val ruleNames: Array<String> =
        RULE_NAMES

    override val atn: ATN =
        ATN

    override val vocabulary: Vocabulary =
        VOCABULARY

    override val serializedATN: String =
        SERIALIZED_ATN

    /* Named actions */

    /* Funcs */
    public open class ParseContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Parse

        public fun block(): BlockContext = getRuleContext(BlockContext::class, 0)!!
        public fun EOF(): TerminalNode = getToken(Tokens.EOF, 0)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun parse(): ParseContext {
        var _localctx = ParseContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 0, Rules.Parse)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 38
            block()

            this.state = 39
            match(Tokens.EOF)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class BlockContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Block

        public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)
        public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)
        public fun eoe(): List<EoeContext> = getRuleContexts(EoeContext::class)
        public fun eoe(i: Int): EoeContext? = getRuleContext(EoeContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun block(): BlockContext {
        var _localctx = BlockContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 2, Rules.Block)
        var _la: Int

        try {
            var _alt: Int
            enterOuterAlt(_localctx, 1)
            this.state = 42
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.NL || _la == Tokens.SCOL) {
                this.state = 41
                eoe()

            }
            this.state = 44
            expression(0)

            this.state = 50
            errorHandler.sync(this)
            _alt = interpreter.adaptivePredict(_input, 1, context)

            while (_alt != 2 && _alt != INVALID_ALT_NUMBER) {
                if (_alt == 1 ) {
                    this.state = 45
                    eoe()

                    this.state = 46
                    expression(0)
             
                }

                this.state = 52
                errorHandler.sync(this)
                _alt = interpreter.adaptivePredict(_input, 1, context)
            }
            this.state = 54
            errorHandler.sync(this)
            _la = _input.LA(1)

            if (_la == Tokens.NL || _la == Tokens.SCOL) {
                this.state = 53
                eoe()

            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class EoeContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Eoe

        public fun SCOL(): List<TerminalNode> = getTokens(Tokens.SCOL)
        public fun SCOL(i: Int): TerminalNode? = getToken(Tokens.SCOL, i)
        public fun NL(): List<TerminalNode> = getTokens(Tokens.NL)
        public fun NL(i: Int): TerminalNode? = getToken(Tokens.NL, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun eoe(): EoeContext {
        var _localctx = EoeContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 4, Rules.Eoe)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 57 
            errorHandler.sync(this)
            _la = _input.LA(1)

            do {
                this.state = 56
                _la = _input.LA(1)

                if (!(_la == Tokens.NL || _la == Tokens.SCOL)) {
                    errorHandler.recoverInline(this)
                }
                else {
                    if (_input.LA(1) == Tokens.EOF) {
                        isMatchedEOF = true
                    }

                    errorHandler.reportMatch(this)
                    consume()
                }
                this.state = 59 
                errorHandler.sync(this)
                _la = _input.LA(1)
            } while (_la == Tokens.NL || _la == Tokens.SCOL)
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class ExpressionContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Expression


        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        public constructor() : super()

        public fun copyFrom(ctx: ExpressionContext) {
            super.copyFrom(ctx)
        }
    }

    public open class HexadecimalExprContext : ExpressionContext {
        public fun HEXADECIMAL(): TerminalNode = getToken(Tokens.HEXADECIMAL, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class SingleLineCharlistExprContext : ExpressionContext {
        public fun SINGLE_LINE_CHARLIST(): TerminalNode = getToken(Tokens.SINGLE_LINE_CHARLIST, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class DotExprContext : ExpressionContext {
        public fun expression(): ExpressionContext = getRuleContext(ExpressionContext::class, 0)!!
        public fun expression_tail(): Expression_tailContext = getRuleContext(Expression_tailContext::class, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class IntegerExprContext : ExpressionContext {
        public fun INTEGER(): TerminalNode = getToken(Tokens.INTEGER, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class SingleLineStringExprContext : ExpressionContext {
        public fun SINGLE_LINE_STRING(): TerminalNode = getToken(Tokens.SINGLE_LINE_STRING, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class NestedExprContext : ExpressionContext {
        public fun OPAR(): TerminalNode = getToken(Tokens.OPAR, 0)!!
        public fun expression(): ExpressionContext = getRuleContext(ExpressionContext::class, 0)!!
        public fun CPAR(): TerminalNode = getToken(Tokens.CPAR, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class MapExprContext : ExpressionContext {
        public fun map(): MapContext = getRuleContext(MapContext::class, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class AtomExprContext : ExpressionContext {
        public fun ATOM(): TerminalNode = getToken(Tokens.ATOM, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class BinaryExprContext : ExpressionContext {
        public fun BINARY(): TerminalNode = getToken(Tokens.BINARY, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class NilExprContext : ExpressionContext {
        public fun NIL(): TerminalNode = getToken(Tokens.NIL, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class OctalExprContext : ExpressionContext {
        public fun OCTAL(): TerminalNode = getToken(Tokens.OCTAL, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class FloatExprContext : ExpressionContext {
        public fun FLOAT(): TerminalNode = getToken(Tokens.FLOAT, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class AliasExprContext : ExpressionContext {
        public fun ALIAS(): TerminalNode = getToken(Tokens.ALIAS, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class UnaryExprContext : ExpressionContext {
        public fun unaryOp(): UnaryOpContext = getRuleContext(UnaryOpContext::class, 0)!!
        public fun expression(): ExpressionContext = getRuleContext(ExpressionContext::class, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class MultiLineStringExprContext : ExpressionContext {
        public fun MULTI_LINE_STRING(): TerminalNode = getToken(Tokens.MULTI_LINE_STRING, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class MultiLineCharlistExprContext : ExpressionContext {
        public fun MULTI_LINE_CHARLIST(): TerminalNode = getToken(Tokens.MULTI_LINE_CHARLIST, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class TupleExprContext : ExpressionContext {
        public fun tuple(): TupleContext = getRuleContext(TupleContext::class, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class BoolExprContext : ExpressionContext {
        public fun bool_(): Bool_Context = getRuleContext(Bool_Context::class, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class PatternExprContext : ExpressionContext {
        public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)
        public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)
        public fun EQ(): TerminalNode = getToken(Tokens.EQ, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }

    public open class ListExprContext : ExpressionContext {
        public fun list(): ListContext = getRuleContext(ListContext::class, 0)!!

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

    }


    public fun expression(): ExpressionContext {
        return expression(0)
    }

    private fun expression(_p: Int): ExpressionContext {
        var _parentctx = context
        var _parentState = state
        var _localctx = ExpressionContext(context, _parentState)
        var _prevctx = _localctx
        var _startState = 6
        var _token: Token?
        var _ctx: RuleContext?

        enterRecursionRule(_localctx, 6, Rules.Expression, _p)

        try {
            var _alt: Int
            enterOuterAlt(_localctx, 1)
            this.state = 85
            errorHandler.sync(this)

            when (_input.LA(1)) {
                Tokens.OPAR -> /*LL1AltBlock*/ {
                    _localctx = NestedExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx

                    this.state = 62
                    match(Tokens.OPAR)

                    this.state = 63
                    expression(0)

                    this.state = 64
                    match(Tokens.CPAR)

                }Tokens.SUB -> /*LL1AltBlock*/ {
                    _localctx = UnaryExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 66
                    unaryOp()

                    this.state = 67
                    expression(18)

                }Tokens.OBRACK -> /*LL1AltBlock*/ {
                    _localctx = ListExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 69
                    list()

                }Tokens.OBRACE -> /*LL1AltBlock*/ {
                    _localctx = TupleExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 70
                    tuple()

                }Tokens.OMAP -> /*LL1AltBlock*/ {
                    _localctx = MapExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 71
                    map()

                }Tokens.TRUE, Tokens.FALSE -> /*LL1AltBlock*/ {
                    _localctx = BoolExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 72
                    bool_()

                }Tokens.ATOM -> /*LL1AltBlock*/ {
                    _localctx = AtomExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 73
                    match(Tokens.ATOM)

                }Tokens.INTEGER -> /*LL1AltBlock*/ {
                    _localctx = IntegerExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 74
                    match(Tokens.INTEGER)

                }Tokens.HEXADECIMAL -> /*LL1AltBlock*/ {
                    _localctx = HexadecimalExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 75
                    match(Tokens.HEXADECIMAL)

                }Tokens.OCTAL -> /*LL1AltBlock*/ {
                    _localctx = OctalExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 76
                    match(Tokens.OCTAL)

                }Tokens.BINARY -> /*LL1AltBlock*/ {
                    _localctx = BinaryExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 77
                    match(Tokens.BINARY)

                }Tokens.FLOAT -> /*LL1AltBlock*/ {
                    _localctx = FloatExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 78
                    match(Tokens.FLOAT)

                }Tokens.SINGLE_LINE_STRING -> /*LL1AltBlock*/ {
                    _localctx = SingleLineStringExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 79
                    match(Tokens.SINGLE_LINE_STRING)

                }Tokens.MULTI_LINE_STRING -> /*LL1AltBlock*/ {
                    _localctx = MultiLineStringExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 80
                    match(Tokens.MULTI_LINE_STRING)

                }Tokens.SINGLE_LINE_CHARLIST -> /*LL1AltBlock*/ {
                    _localctx = SingleLineCharlistExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 81
                    match(Tokens.SINGLE_LINE_CHARLIST)

                }Tokens.MULTI_LINE_CHARLIST -> /*LL1AltBlock*/ {
                    _localctx = MultiLineCharlistExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 82
                    match(Tokens.MULTI_LINE_CHARLIST)

                }Tokens.ALIAS -> /*LL1AltBlock*/ {
                    _localctx = AliasExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 83
                    match(Tokens.ALIAS)

                }Tokens.NIL -> /*LL1AltBlock*/ {
                    _localctx = NilExprContext(_localctx)
                    context = _localctx
                    _prevctx = _localctx
                    this.state = 84
                    match(Tokens.NIL)

                }
                else -> throw NoViableAltException(this)
            }
            context!!.stop = _input.LT(-1)
            this.state = 94
            errorHandler.sync(this)
            _alt = interpreter.adaptivePredict(_input, 6, context)

            while (_alt != 2 && _alt != INVALID_ALT_NUMBER) {
                if (_alt == 1 ) {
                    if (_parseListeners.isNotEmpty()) {
                        triggerExitRuleEvent()
                    }

                    _prevctx = _localctx
                    this.state = 92
                    errorHandler.sync(this)

                    when (interpreter.adaptivePredict(_input, 5, context)) {
                        1 -> {
                            _localctx = PatternExprContext(ExpressionContext(_parentctx, _parentState))
                            pushNewRecursionContext(_localctx, _startState, Rules.Expression)
                            this.state = 87

                            if (!(precpred(context!!, 17))) {
                                throw FailedPredicateException(this, "precpred(context!!, 17)")
                            }
                            this.state = 88
                            match(Tokens.EQ)

                            this.state = 89
                            expression(18)

                        }2 -> {
                            _localctx = DotExprContext(ExpressionContext(_parentctx, _parentState))
                            pushNewRecursionContext(_localctx, _startState, Rules.Expression)
                            this.state = 90

                            if (!(precpred(context!!, 20))) {
                                throw FailedPredicateException(this, "precpred(context!!, 20)")
                            }
                            this.state = 91
                            expression_tail()

                        }
                    } 
                }

                this.state = 96
                errorHandler.sync(this)
                _alt = interpreter.adaptivePredict(_input, 6, context)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            unrollRecursionContexts(_parentctx)
        }

        return _localctx
    }

    public open class UnaryOpContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.UnaryOp

        public fun SUB(): TerminalNode = getToken(Tokens.SUB, 0)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun unaryOp(): UnaryOpContext {
        var _localctx = UnaryOpContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 8, Rules.UnaryOp)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 97
            match(Tokens.SUB)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class Expression_tailContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Expression_tail

        public fun OBRACK(): TerminalNode? = getToken(Tokens.OBRACK, 0)
        public fun expression(): ExpressionContext = getRuleContext(ExpressionContext::class, 0)!!
        public fun CBRACK(): TerminalNode? = getToken(Tokens.CBRACK, 0)
        public fun DOT(): TerminalNode? = getToken(Tokens.DOT, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun expression_tail(): Expression_tailContext {
        var _localctx = Expression_tailContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 10, Rules.Expression_tail)

        try {
            this.state = 105
            errorHandler.sync(this)

            when (_input.LA(1)) {
                Tokens.OBRACK -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 1)
                    this.state = 99
                    match(Tokens.OBRACK)

                    this.state = 100
                    expression(0)

                    this.state = 101
                    match(Tokens.CBRACK)

                }Tokens.DOT -> /*LL1AltBlock*/ {
                    enterOuterAlt(_localctx, 2)
                    this.state = 103
                    match(Tokens.DOT)

                    this.state = 104
                    expression(0)

                }
                else -> throw NoViableAltException(this)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class Bool_Context : ParserRuleContext {
        override val ruleIndex: Int = Rules.Bool_

        public fun TRUE(): TerminalNode? = getToken(Tokens.TRUE, 0)
        public fun FALSE(): TerminalNode? = getToken(Tokens.FALSE, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun bool_(): Bool_Context {
        var _localctx = Bool_Context(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 12, Rules.Bool_)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 107
            _la = _input.LA(1)

            if (!(_la == Tokens.TRUE || _la == Tokens.FALSE)) {
                errorHandler.recoverInline(this)
            }
            else {
                if (_input.LA(1) == Tokens.EOF) {
                    isMatchedEOF = true
                }

                errorHandler.reportMatch(this)
                consume()
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class ListContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.List

        public fun OBRACK(): TerminalNode = getToken(Tokens.OBRACK, 0)!!
        public fun expressions_(): Expressions_Context? = getRuleContext(Expressions_Context::class, 0)
        public fun CBRACK(): TerminalNode = getToken(Tokens.CBRACK, 0)!!
        public fun NL(): List<TerminalNode> = getTokens(Tokens.NL)
        public fun NL(i: Int): TerminalNode? = getToken(Tokens.NL, i)
        public fun COMMA(): TerminalNode? = getToken(Tokens.COMMA, 0)
        public fun tuples(): TuplesContext? = getRuleContext(TuplesContext::class, 0)
        public fun short_map_entries(): Short_map_entriesContext? = getRuleContext(Short_map_entriesContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun list(): ListContext {
        var _localctx = ListContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 14, Rules.List)
        var _la: Int

        try {
            this.state = 184
            errorHandler.sync(this)

            when (interpreter.adaptivePredict(_input, 20, context)) {
                1 -> {
                    enterOuterAlt(_localctx, 1)
                    this.state = 109
                    match(Tokens.OBRACK)

                    this.state = 113
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 110
                        match(Tokens.NL)

                        this.state = 115
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 116
                    expressions_()

                    this.state = 118
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    if (_la == Tokens.COMMA) {
                        this.state = 117
                        match(Tokens.COMMA)

                    }
                    this.state = 123
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 120
                        match(Tokens.NL)

                        this.state = 125
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 126
                    match(Tokens.CBRACK)

                }2 -> {
                    enterOuterAlt(_localctx, 2)
                    this.state = 128
                    match(Tokens.OBRACK)

                    this.state = 132
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 129
                        match(Tokens.NL)

                        this.state = 134
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 145
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 2853437424L) != 0L)) {
                        this.state = 135
                        expressions_()

                        this.state = 137
                        errorHandler.sync(this)
                        _la = _input.LA(1)

                        if (_la == Tokens.COMMA) {
                            this.state = 136
                            match(Tokens.COMMA)

                        }
                        this.state = 142
                        errorHandler.sync(this)
                        _la = _input.LA(1)

                        while (_la == Tokens.NL) {
                            this.state = 139
                            match(Tokens.NL)

                            this.state = 144
                            errorHandler.sync(this)
                            _la = _input.LA(1)
                        }
                    }
                    this.state = 147
                    match(Tokens.CBRACK)

                }3 -> {
                    enterOuterAlt(_localctx, 3)
                    this.state = 148
                    match(Tokens.OBRACK)

                    this.state = 152
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 149
                        match(Tokens.NL)

                        this.state = 154
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 155
                    tuples()

                    this.state = 158
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    if (_la == Tokens.COMMA) {
                        this.state = 156
                        match(Tokens.COMMA)

                        this.state = 157
                        short_map_entries()

                    }
                    this.state = 163
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 160
                        match(Tokens.NL)

                        this.state = 165
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 166
                    match(Tokens.CBRACK)

                }4 -> {
                    enterOuterAlt(_localctx, 4)
                    this.state = 168
                    match(Tokens.OBRACK)

                    this.state = 172
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 169
                        match(Tokens.NL)

                        this.state = 174
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 175
                    short_map_entries()

                    this.state = 179
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 176
                        match(Tokens.NL)

                        this.state = 181
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 182
                    match(Tokens.CBRACK)

                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class TuplesContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Tuples

        public fun tuple(): List<TupleContext> = getRuleContexts(TupleContext::class)
        public fun tuple(i: Int): TupleContext? = getRuleContext(TupleContext::class, i)
        public fun COMMA(): List<TerminalNode> = getTokens(Tokens.COMMA)
        public fun COMMA(i: Int): TerminalNode? = getToken(Tokens.COMMA, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun tuples(): TuplesContext {
        var _localctx = TuplesContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 16, Rules.Tuples)

        try {
            var _alt: Int
            enterOuterAlt(_localctx, 1)
            this.state = 186
            tuple()

            this.state = 191
            errorHandler.sync(this)
            _alt = interpreter.adaptivePredict(_input, 21, context)

            while (_alt != 2 && _alt != INVALID_ALT_NUMBER) {
                if (_alt == 1 ) {
                    this.state = 187
                    match(Tokens.COMMA)

                    this.state = 188
                    tuple()
             
                }

                this.state = 193
                errorHandler.sync(this)
                _alt = interpreter.adaptivePredict(_input, 21, context)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class TupleContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Tuple

        public fun OBRACE(): TerminalNode = getToken(Tokens.OBRACE, 0)!!
        public fun CBRACE(): TerminalNode = getToken(Tokens.CBRACE, 0)!!
        public fun expressions_(): Expressions_Context? = getRuleContext(Expressions_Context::class, 0)
        public fun COMMA(): TerminalNode? = getToken(Tokens.COMMA, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun tuple(): TupleContext {
        var _localctx = TupleContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 18, Rules.Tuple)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 194
            match(Tokens.OBRACE)

            this.state = 199
            errorHandler.sync(this)
            _la = _input.LA(1)

            if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 2853437424L) != 0L)) {
                this.state = 195
                expressions_()

                this.state = 197
                errorHandler.sync(this)
                _la = _input.LA(1)

                if (_la == Tokens.COMMA) {
                    this.state = 196
                    match(Tokens.COMMA)

                }
            }
            this.state = 201
            match(Tokens.CBRACE)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class MapContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Map

        public fun OMAP(): TerminalNode = getToken(Tokens.OMAP, 0)!!
        public fun CBRACE(): TerminalNode = getToken(Tokens.CBRACE, 0)!!
        public fun NL(): List<TerminalNode> = getTokens(Tokens.NL)
        public fun NL(i: Int): TerminalNode? = getToken(Tokens.NL, i)
        public fun map_entries(): Map_entriesContext? = getRuleContext(Map_entriesContext::class, 0)
        public fun expression(): ExpressionContext? = getRuleContext(ExpressionContext::class, 0)
        public fun PIPE(): TerminalNode? = getToken(Tokens.PIPE, 0)
        public fun COMMA(): List<TerminalNode> = getTokens(Tokens.COMMA)
        public fun COMMA(i: Int): TerminalNode? = getToken(Tokens.COMMA, i)
        public fun short_map_entries(): Short_map_entriesContext? = getRuleContext(Short_map_entriesContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun map(): MapContext {
        var _localctx = MapContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 20, Rules.Map)
        var _la: Int

        try {
            this.state = 287
            errorHandler.sync(this)

            when (interpreter.adaptivePredict(_input, 38, context)) {
                1 -> {
                    enterOuterAlt(_localctx, 1)
                    this.state = 203
                    match(Tokens.OMAP)

                    this.state = 207
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 204
                        match(Tokens.NL)

                        this.state = 209
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 210
                    match(Tokens.CBRACE)

                }2 -> {
                    enterOuterAlt(_localctx, 2)
                    this.state = 211
                    match(Tokens.OMAP)

                    this.state = 215
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 212
                        match(Tokens.NL)

                        this.state = 217
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 221
                    errorHandler.sync(this)

                    when (interpreter.adaptivePredict(_input, 26, context)) {
                        1 -> {
                            this.state = 218
                            expression(0)

                            this.state = 219
                            match(Tokens.PIPE)

                        }
                    }
                    this.state = 223
                    map_entries()

                    this.state = 225
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    if (_la == Tokens.COMMA) {
                        this.state = 224
                        match(Tokens.COMMA)

                    }
                    this.state = 230
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 227
                        match(Tokens.NL)

                        this.state = 232
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 233
                    match(Tokens.CBRACE)

                }3 -> {
                    enterOuterAlt(_localctx, 3)
                    this.state = 235
                    match(Tokens.OMAP)

                    this.state = 239
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 236
                        match(Tokens.NL)

                        this.state = 241
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 245
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 2853437424L) != 0L)) {
                        this.state = 242
                        expression(0)

                        this.state = 243
                        match(Tokens.PIPE)

                    }
                    this.state = 247
                    short_map_entries()

                    this.state = 249
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    if (_la == Tokens.COMMA) {
                        this.state = 248
                        match(Tokens.COMMA)

                    }
                    this.state = 254
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 251
                        match(Tokens.NL)

                        this.state = 256
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 257
                    match(Tokens.CBRACE)

                }4 -> {
                    enterOuterAlt(_localctx, 4)
                    this.state = 259
                    match(Tokens.OMAP)

                    this.state = 263
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 260
                        match(Tokens.NL)

                        this.state = 265
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 269
                    errorHandler.sync(this)

                    when (interpreter.adaptivePredict(_input, 34, context)) {
                        1 -> {
                            this.state = 266
                            expression(0)

                            this.state = 267
                            match(Tokens.PIPE)

                        }
                    }
                    this.state = 271
                    map_entries()

                    this.state = 274
                    errorHandler.sync(this)

                    when (interpreter.adaptivePredict(_input, 35, context)) {
                        1 -> {
                            this.state = 272
                            match(Tokens.COMMA)

                            this.state = 273
                            short_map_entries()

                        }
                    }
                    this.state = 277
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    if (_la == Tokens.COMMA) {
                        this.state = 276
                        match(Tokens.COMMA)

                    }
                    this.state = 282
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 279
                        match(Tokens.NL)

                        this.state = 284
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 285
                    match(Tokens.CBRACE)

                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class Map_entriesContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Map_entries

        public fun map_entry(): List<Map_entryContext> = getRuleContexts(Map_entryContext::class)
        public fun map_entry(i: Int): Map_entryContext? = getRuleContext(Map_entryContext::class, i)
        public fun COMMA(): List<TerminalNode> = getTokens(Tokens.COMMA)
        public fun COMMA(i: Int): TerminalNode? = getToken(Tokens.COMMA, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun map_entries(): Map_entriesContext {
        var _localctx = Map_entriesContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 22, Rules.Map_entries)

        try {
            var _alt: Int
            enterOuterAlt(_localctx, 1)
            this.state = 289
            map_entry()

            this.state = 294
            errorHandler.sync(this)
            _alt = interpreter.adaptivePredict(_input, 39, context)

            while (_alt != 2 && _alt != INVALID_ALT_NUMBER) {
                if (_alt == 1 ) {
                    this.state = 290
                    match(Tokens.COMMA)

                    this.state = 291
                    map_entry()
             
                }

                this.state = 296
                errorHandler.sync(this)
                _alt = interpreter.adaptivePredict(_input, 39, context)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class Map_entryContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Map_entry

        public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)
        public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)
        public fun ARROW(): TerminalNode = getToken(Tokens.ARROW, 0)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun map_entry(): Map_entryContext {
        var _localctx = Map_entryContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 24, Rules.Map_entry)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 297
            expression(0)

            this.state = 298
            match(Tokens.ARROW)

            this.state = 299
            expression(0)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class Short_map_entriesContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Short_map_entries

        public fun short_map_entry(): List<Short_map_entryContext> = getRuleContexts(Short_map_entryContext::class)
        public fun short_map_entry(i: Int): Short_map_entryContext? = getRuleContext(Short_map_entryContext::class, i)
        public fun COMMA(): List<TerminalNode> = getTokens(Tokens.COMMA)
        public fun COMMA(i: Int): TerminalNode? = getToken(Tokens.COMMA, i)
        public fun NL(): List<TerminalNode> = getTokens(Tokens.NL)
        public fun NL(i: Int): TerminalNode? = getToken(Tokens.NL, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun short_map_entries(): Short_map_entriesContext {
        var _localctx = Short_map_entriesContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 26, Rules.Short_map_entries)
        var _la: Int

        try {
            var _alt: Int
            enterOuterAlt(_localctx, 1)
            this.state = 301
            short_map_entry()

            this.state = 312
            errorHandler.sync(this)
            _alt = interpreter.adaptivePredict(_input, 41, context)

            while (_alt != 2 && _alt != INVALID_ALT_NUMBER) {
                if (_alt == 1 ) {
                    this.state = 302
                    match(Tokens.COMMA)

                    this.state = 306
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 303
                        match(Tokens.NL)

                        this.state = 308
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 309
                    short_map_entry()
             
                }

                this.state = 314
                errorHandler.sync(this)
                _alt = interpreter.adaptivePredict(_input, 41, context)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class Short_map_entryContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Short_map_entry

        public fun variable(): VariableContext = getRuleContext(VariableContext::class, 0)!!
        public fun COL(): TerminalNode = getToken(Tokens.COL, 0)!!
        public fun expression(): ExpressionContext = getRuleContext(ExpressionContext::class, 0)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun short_map_entry(): Short_map_entryContext {
        var _localctx = Short_map_entryContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 28, Rules.Short_map_entry)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 315
            variable()

            this.state = 316
            match(Tokens.COL)

            this.state = 317
            expression(0)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class Options_Context : ParserRuleContext {
        override val ruleIndex: Int = Rules.Options_

        public fun option(): List<OptionContext> = getRuleContexts(OptionContext::class)
        public fun option(i: Int): OptionContext? = getRuleContext(OptionContext::class, i)
        public fun COMMA(): List<TerminalNode> = getTokens(Tokens.COMMA)
        public fun COMMA(i: Int): TerminalNode? = getToken(Tokens.COMMA, i)
        public fun NL(): List<TerminalNode> = getTokens(Tokens.NL)
        public fun NL(i: Int): TerminalNode? = getToken(Tokens.NL, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun options_(): Options_Context {
        var _localctx = Options_Context(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 30, Rules.Options_)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 319
            option()

            this.state = 330
            errorHandler.sync(this)
            _la = _input.LA(1)

            while (_la == Tokens.COMMA) {
                this.state = 320
                match(Tokens.COMMA)

                this.state = 324
                errorHandler.sync(this)
                _la = _input.LA(1)

                while (_la == Tokens.NL) {
                    this.state = 321
                    match(Tokens.NL)

                    this.state = 326
                    errorHandler.sync(this)
                    _la = _input.LA(1)
                }
                this.state = 327
                option()

                this.state = 332
                errorHandler.sync(this)
                _la = _input.LA(1)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class OptionContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Option

        public fun variable(): VariableContext = getRuleContext(VariableContext::class, 0)!!
        public fun COL(): TerminalNode = getToken(Tokens.COL, 0)!!
        public fun expression(): ExpressionContext = getRuleContext(ExpressionContext::class, 0)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun option(): OptionContext {
        var _localctx = OptionContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 32, Rules.Option)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 333
            variable()

            this.state = 334
            match(Tokens.COL)

            this.state = 335
            expression(0)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class Expressions_Context : ParserRuleContext {
        override val ruleIndex: Int = Rules.Expressions_

        public fun expression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)
        public fun expression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)
        public fun COMMA(): List<TerminalNode> = getTokens(Tokens.COMMA)
        public fun COMMA(i: Int): TerminalNode? = getToken(Tokens.COMMA, i)
        public fun NL(): List<TerminalNode> = getTokens(Tokens.NL)
        public fun NL(i: Int): TerminalNode? = getToken(Tokens.NL, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun expressions_(): Expressions_Context {
        var _localctx = Expressions_Context(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 34, Rules.Expressions_)
        var _la: Int

        try {
            var _alt: Int
            enterOuterAlt(_localctx, 1)
            this.state = 337
            expression(0)

            this.state = 348
            errorHandler.sync(this)
            _alt = interpreter.adaptivePredict(_input, 45, context)

            while (_alt != 2 && _alt != INVALID_ALT_NUMBER) {
                if (_alt == 1 ) {
                    this.state = 338
                    match(Tokens.COMMA)

                    this.state = 342
                    errorHandler.sync(this)
                    _la = _input.LA(1)

                    while (_la == Tokens.NL) {
                        this.state = 339
                        match(Tokens.NL)

                        this.state = 344
                        errorHandler.sync(this)
                        _la = _input.LA(1)
                    }
                    this.state = 345
                    expression(0)
             
                }

                this.state = 350
                errorHandler.sync(this)
                _alt = interpreter.adaptivePredict(_input, 45, context)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    public open class VariableContext : ParserRuleContext {
        override val ruleIndex: Int = Rules.Variable

        public fun VARIABLE(): TerminalNode = getToken(Tokens.VARIABLE, 0)!!

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

    }


    public fun variable(): VariableContext {
        var _localctx = VariableContext(context, state)
        var _token: Token?
        var _ctx: RuleContext?

        enterRule(_localctx, 36, Rules.Variable)

        try {
            enterOuterAlt(_localctx, 1)
            this.state = 351
            match(Tokens.VARIABLE)

        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int): Boolean {
        when (ruleIndex) {
            3 -> return expression_sempred(_localctx as ExpressionContext?, predIndex)
        }

        return true
    }

    @Suppress("UNSAFE_CALL")
    private fun expression_sempred(_localctx: ExpressionContext?, predIndex: Int): Boolean {
        when (predIndex) {
            0 -> return (precpred(context!!, 17))
            1 -> return (precpred(context!!, 20))
        }

        return true
    }
}
