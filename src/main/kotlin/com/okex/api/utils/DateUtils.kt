package com.okex.api.utils

import okhttp3.internal.UTC
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


open class DateUtils{
    var TIME_STYLE_S1 = "yyyy-MM-dd"
    var TIME_STYLE_S2 = "yyyy-MM-dd HH:mm"
    var TIME_STYLE_S3 = "yyyy-MM-dd HH:mm:ss"
    var TIME_STYLE_S4 = "yyyy-MM-dd HH:mm:ss:S"
    var TIME_STYLE_S5 = "yyyy-MM-dd HH:mm:ss:S E zZ"
    var TIME_STYLE_S6 = "yyyyMMddHHmmssS"
    var TIME_STYLE_S7 = "yyyy년MM월dd일HH시mm분ss초"
    var SDF: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'")

    init {
        SDF.timeZone = TimeZone.getTimeZone("UTC")
    }

    open fun timeTOString(): String{
        val cal  = Calendar.getInstance()
        cal.time = Date()
        println(SDF.format(cal.time))
        return SDF.format(cal.time)
    }
}