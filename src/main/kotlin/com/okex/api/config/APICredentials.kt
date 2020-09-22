package com.okex.api.config

open class APICredentials {
    constructor(config: APIConfiguration){
        this.apiKey = config.apiKey
        this.secretKey = config.secretKey
        this.passphrase = config.passphrase
    }
    var apiKey: String?

    var secretKey: String?

    var passphrase: String?



}