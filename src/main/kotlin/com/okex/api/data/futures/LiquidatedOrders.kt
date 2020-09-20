package com.okex.api.data.futures

import lombok.Data

@Data
data class LiquidatedOrders(
        val instrument_id: String,
        val size: String,
        val created_at: String,
        val loss: String,
        val price: String,
        val type: String
)