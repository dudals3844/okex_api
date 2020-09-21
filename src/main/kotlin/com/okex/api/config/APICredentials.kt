package com.okex.api.config

open class APICredentials {
    constructor(config: APIConfiguration){
        this.apiKey = config.apiKey
        this.secretKey = config.secretKey
        this.passphrase = config.passphrase
    }
    private var apiKey: String? = null

    private var secretKey: String? = null

    private var passphrase: String? = null



}