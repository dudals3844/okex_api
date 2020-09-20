package com.okex.api.data.futures

import lombok.Data

@Data
data class MarkPrice(
        val instrument_id: String,
        val mark_price: String,
        val timestamp: String
)