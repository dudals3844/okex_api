package com.okex.api.data.futures

import lombok.Data

@Data
data class CurrentTransactionFeeRate(
        val taker: String,
        val maker: String,
        val delivery: String,
        val timestamp: String,
        val category: String
)