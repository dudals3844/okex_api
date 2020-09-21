package com.okex.api.enum

import java.nio.charset.Charset

enum class CharsetEnum(val charset: String) {
    UTF_8("UTF-8"),
    ISO_8859_1("ISO-8859-1")
}

fun getCharset(c: CharsetEnum): String {
    when(c){
        CharsetEnum.ISO_8859_1 -> return c.charset
        CharsetEnum.UTF_8 -> return c.charset
    }
}