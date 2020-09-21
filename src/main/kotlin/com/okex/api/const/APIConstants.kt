package com.okex.api.const

import com.google.gson.JsonObject
import com.okex.api.enum.CharsetEnum
import com.okex.api.enum.ContentTypeEnum
import com.okex.api.enum.getCharset
import com.okex.api.enum.getContentType
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import java.nio.charset.Charset


open class APIConstants {
    val TIMEOUT = 1000 * 30

    val CONTENT_TYPE = "Content-Type"

    val ACCEPT = "Accept"

    val COOKIE = "Cookie"

    val LOCALE = "locale="

    val JSON: MediaType = getContentType(ContentTypeEnum.APPLICATION_JSON).toMediaTypeOrNull()!!

    val UTF_8: Charset = Charset.forName(getCharset(CharsetEnum.UTF_8))

    val QUESTION = "?"

    val EMPTY = ""

    val NOTHING: JsonObject = JsonObject()

    val toStringTypeArray: ArrayList<String> = arrayListOf("class java.lang.Long",
            "class java.lang.Integer",
            "long",
            "int")

    val toStringTypeDoubleArray: ArrayList<String> = arrayListOf("class java.lang.Double",
            "double")


    val resultStatusArray: ArrayList<Int> = arrayListOf(400, 401, 429, 500)

    val BOOLEAN = "boolean"

    val IS = "is"

    val get = "get"

    val a = 'a'

    val z = 'z'

    val ZERO_STRING = "0"

    val DOUBLE_ZERO_STRING = "0.00"

    val DOT1 = "."

    val DOT2 = "\\."

    val E = 'E'

    val e = "e"

    val DEFAULT_SCALE = 2

    val DOUBLE_END1 = "0+?$"

    val DOUBLE_END2 = "[.]$"

    val ONE = 1

    val HUNDRED = 100

    val HLINE = "-"

    val SLASH = "/"
}