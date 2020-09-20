package com.okex.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.okex.api.const.*

@SpringBootApplication
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
    underlying = "btc-usdt"
    println(underlying)
    println(GET_FUTURES_LEVERAGE)
}
