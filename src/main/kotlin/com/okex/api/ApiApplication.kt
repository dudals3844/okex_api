package com.okex.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.okex.api.request.futures.RequestFutures

@SpringBootApplication
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)

    var futures = RequestFutures()
    futures.requestFuturesPosition()
    futures.requestContractInformation()


}
