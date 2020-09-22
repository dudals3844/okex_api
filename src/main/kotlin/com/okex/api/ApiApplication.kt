package com.okex.api

import com.okex.api.client.Headers
import com.okex.api.config.APIConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.okex.api.const.*
import com.okex.api.enum.ContentTypeEnum
import com.okex.api.enum.getContentType
import com.okex.api.utils.DateUtils
import com.okex.api.utils.HmacSHA256Base64Utils

@SpringBootApplication
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)




}
