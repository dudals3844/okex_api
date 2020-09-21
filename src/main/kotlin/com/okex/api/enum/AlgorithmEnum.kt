package com.okex.api.enum

enum class AlgorithmEnum(val algorithm: String) {
    HMAC_SHA256("HmacSHA256"),
    MD5("MD5")
}

fun getAlgorithm(c: AlgorithmEnum): String? {
    when(c){
        AlgorithmEnum.HMAC_SHA256 -> return c.algorithm
        AlgorithmEnum.MD5 -> return c.algorithm
    }
}