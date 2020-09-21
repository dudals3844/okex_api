package com.okex.api

import com.okex.api.config.APIConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.okex.api.const.*
import com.okex.api.enum.ContentTypeEnum
import com.okex.api.enum.getContentType
import com.okex.api.utils.DateUtils

@SpringBootApplication
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)

    var dateUtils = DateUtils()
    println(dateUtils.timeTOString())
}
