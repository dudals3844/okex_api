package com.okex.api.data.futures

import lombok.Data

@Data
data class PriceLimit(
        val instrument_id: String,
        val highest: String,
        val lowest: String,
        val timestamp: String
)