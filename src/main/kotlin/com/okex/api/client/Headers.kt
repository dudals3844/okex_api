package com.okex.api.client

import com.okex.api.enum.HttpHeadersEnum
import com.okex.api.utils.DateUtils

open class Headers {
    private val apiKey: String = "c39039f8-4016-44e3-8b7f-5142b59e2a99"
    private var scretKey: String = "D28B3F620662BE08DA392B8A7521206A"
    private val passphrase: String = "dudals34273844"
    private var headers: MutableMap<String, String>

    constructor(testNet: Boolean = false){
        var dataUtils = DateUtils()
        var headers: MutableMap<String, String> = mutableMapOf(
                Pair(HttpHeadersEnum.OK_ACCESS_KEY.header, apiKey),
                Pair(HttpHeadersEnum.OK_ACCESS_TIMESTAMP.header, dataUtils.getUnixTime()),
                Pair(HttpHeadersEnum.OK_ACCESS_PASSPHRASE.header, passphrase),
                Pair(HttpHeadersEnum.CONTENT_TYPE.header, "application/json")
        )
        if (testNet == true){
            headers.put(HttpHeadersEnum.x_simulated_trading.header, "1")
        }
        this.headers = headers
    }

    fun addSignHeader(sign: String){
        headers.put(HttpHeadersEnum.OK_ACCESS_SIGN.header, sign)
    }

    fun getHeader(): Map<String, String>{
        return headers
    }

    fun getScretKey(): String{
        return scretKey
    }



}