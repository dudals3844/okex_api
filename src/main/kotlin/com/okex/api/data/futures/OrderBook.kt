package com.okex.api.data.futures

import lombok.Data

@Data
data class OrderBook(
        val asks: String,
        val bids: String,
        val timestamp: String
)