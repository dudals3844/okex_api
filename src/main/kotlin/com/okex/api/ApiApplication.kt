package com.okex.api

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

    var hmacSHA256Base64Utils = HmacSHA256Base64Utils()
    var result = hmacSHA256Base64Utils.sign(timestamp = "2020-09-21T07:12:13.065Z", method = "GET", requestPath = "/api/account/v3/wallet", queryString = "",body = "", scretKey = "D28B3F620662BE08DA392B8A7521206A")
    println(result)


}
