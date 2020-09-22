package com.okex.api.service.futures

import com.okex.api.const.BASE_URL
import com.okex.api.const.FUTURES_POSITIONS
import com.okex.api.const.FUTURES_PUBLIC_DATA_BASE_URL
import com.okex.api.data.futures.ContractInformation
import com.okex.api.data.futures.FuturesPositions
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.Path

interface Futures {

    @GET(FUTURES_POSITIONS)
    fun getFuturesPosition(@HeaderMap headers: Map<String, String>): Call<FuturesPositions>

    @GET(FUTURES_PUBLIC_DATA_BASE_URL)
    fun getInstrument_ID():Call<ArrayList<ContractInformation>>
}




