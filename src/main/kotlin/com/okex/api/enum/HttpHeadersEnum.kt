package com.okex.api.enum

enum class HttpHeadersEnum(val header: String) {
    OK_ACCESS_KEY("OK-ACCESS-KEY"),
    OK_ACCESS_SIGN("OK-ACCESS-SIGN"),
    OK_ACCESS_TIMESTAMP("OK-ACCESS-TIMESTAMP"),
    OK_ACCESS_PASSPHRASE("OK-ACCESS-PASSPHRASE"),
    OK_FROM("OK-FROM"),
    OK_TO("OK-TO"),
    OK_LIMIT("OK-LIMIT"),
    x_simulated_trading("x-simulated-trading"),
    CONTENT_TYPE("Content-Type")
}

