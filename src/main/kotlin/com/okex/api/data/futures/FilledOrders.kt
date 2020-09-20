package com.okex.api.data.futures

import lombok.Data

@Data
data class FilledOrders(
        val timestamp: String,
        val trade_id: String,
        val price: String,
        val qty: String,
        val side: String
)