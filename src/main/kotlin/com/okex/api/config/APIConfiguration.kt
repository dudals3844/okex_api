package com.okex.api.config

import com.okex.api.enum.I18nEnum

open class APIConfiguration {

    constructor(endpoint: String){
        this.endpoint = endpoint
    }

    var apiKey: String? = null

    var secretKey: String? = null

    var passphrase: String? = null

    var endpoint: String

    var connectTimeout: Long = 2

    var readTimeout: Long = 2

    var writeTimeout: Long = 2

    var retryOnConnectionFailure: Boolean = true

    var print: Boolean = false

    var i18n: I18nEnum = I18nEnum.ENGLISH



}