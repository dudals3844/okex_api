package com.okex.api.client

import com.okex.api.config.APIConfiguration
import com.okex.api.config.APICredentials
import okhttp3.OkHttpClient
import org.slf4j.LoggerFactory
import java.util.concurrent.TimeUnit

open class APIHttpClient{
    val LOG = LoggerFactory.getLogger(APIHttpClient::class.java)
    val config: APIConfiguration?
    val credentials: APICredentials?

    constructor(config: APIConfiguration, credentials: APICredentials){
        this.config = config
        this.credentials = credentials
    }

    open fun client(): OkHttpClient{
        val clientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
        clientBuilder.connectTimeout(config.getConnectTimeout(), TimeUnit.SECONDS)

    }

}