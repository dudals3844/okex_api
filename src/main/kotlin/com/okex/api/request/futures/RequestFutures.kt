package com.okex.api.request.futures

import com.okex.api.client.Headers
import com.okex.api.client.RetrofitBuilder
import com.okex.api.client.RetrofitFutures
import com.okex.api.client.Sign
import com.okex.api.const.BASE_URL
import com.okex.api.const.FUTURES_POSITIONS
import com.okex.api.enum.MethodEnum
import com.okex.api.service.futures.Futures
import com.okex.api.utils.DateUtils

open class RequestFutures{
    private lateinit var timestamp: String
    private lateinit var method: String
    private lateinit var requestPath: String
    private var queryString: String = ""
    private var body: String = ""
    private lateinit var scretKey: String

    fun requestFuturesPosition(){

        var service = RetrofitFutures().getService()

        var headers = Headers(testNet = true)

        this.timestamp = DateUtils().getUnixTime()
        this.method = MethodEnum.GET.method
        this.requestPath = FUTURES_POSITIONS
        this.scretKey = headers.getScretKey()

        var sign = Sign().getSign(timestamp, method, requestPath, queryString, body, scretKey)
        headers.addSignHeader(sign)
        var headerMap = headers.getHeader()
        val result = service!!.getFuturesPosition(headers = headerMap)
        val executeResult = result.execute()
        println(executeResult.body())

    }


    fun requestContractInformation(){
        var service = RetrofitFutures().getService()

        var headers = Headers(testNet = true)

        this.timestamp = DateUtils().getUnixTime()
        this.method = MethodEnum.GET.method
        this.requestPath = FUTURES_POSITIONS
        this.scretKey = headers.getScretKey()

        var sign = Sign().getSign(timestamp, method, requestPath, queryString, body, scretKey)
        headers.addSignHeader(sign)
        var headerMap = headers.getHeader()
        val result = service!!.getInstrument_ID()
        val executeResult = result.execute()
        println(executeResult.body())
    }

}




