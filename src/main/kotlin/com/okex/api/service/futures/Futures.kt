package com.okex.api.service.futures

import com.okex.api.const.BASE_URL
import com.okex.api.const.FUTURES_POSITIONS
import com.okex.api.data.futures.FuturesPositions
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.HeaderMap

interface Futures {

    @GET(BASE_URL+ FUTURES_POSITIONS)
    fun getFuturesPosition(@HeaderMap headers: Map<String, String>): Call<ArrayList<FuturesPositions>>
}