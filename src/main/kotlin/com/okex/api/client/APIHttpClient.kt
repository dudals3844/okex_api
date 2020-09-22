package com.okex.api.client

import com.okex.api.config.APIConfiguration
import com.okex.api.config.APICredentials
import com.okex.api.utils.DateUtils
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import org.slf4j.LoggerFactory
import java.util.concurrent.TimeUnit

open class APIHttpClient{
    val LOG = LoggerFactory.getLogger(APIHttpClient::class.java)
    var config =  APIConfiguration("5")
    val credentials: APICredentials?


    constructor(config: APIConfiguration, credentials: APICredentials){
        this.config = config
        this.credentials = credentials
    }

    open fun client(): OkHttpClient{
        var dataUtils = DateUtils()
        var timestamp: String? = null
        var requestBuilder: Request.Builder? = null
        val clientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
        clientBuilder.connectTimeout(config.connectTimeout, TimeUnit.SECONDS)
        clientBuilder.readTimeout(config.readTimeout, TimeUnit.SECONDS)
        clientBuilder.writeTimeout(config.writeTimeout, TimeUnit.SECONDS)
        clientBuilder.retryOnConnectionFailure(config.retryOnConnectionFailure)
        clientBuilder.addInterceptor(Interceptor { chain: Interceptor.Chain ->
            requestBuilder = chain.request().newBuilder()


        })




    }

}