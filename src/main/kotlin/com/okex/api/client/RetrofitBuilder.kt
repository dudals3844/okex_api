package com.okex.api.client

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.okex.api.const.*
import com.okex.api.service.futures.Futures

open class RetrofitBuilder {

    open fun getRetrofitBuilder(): Retrofit?{
        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        return retrofit
    }
}

open class RetrofitFutures{
    open fun getService(): Futures? {
        var retrofitBuilder = RetrofitBuilder()
        var retrofit = retrofitBuilder.getRetrofitBuilder()
        var service = retrofit!!.create(Futures::class.java)
        return service
    }
}

