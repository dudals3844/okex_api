package com.okex.api.config

open class APIConfiguration {

    constructor(endpoint: String){
        this.endpoint = endpoint
    }

    var apiKey: String? = null

    var secretKey: String? = null

    var passphrase: String? = null

    var endpoint: String

    var connectTimeout: String? = null

    var readTimeout: String? = null

    var writeTimeout: String? = null

    var retryOnConnectionFailure: Boolean = true

    var print: Boolean = false


}