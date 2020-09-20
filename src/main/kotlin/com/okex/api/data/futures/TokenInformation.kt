package com.okex.api.data.futures

import lombok.Data

@Data
data class TokenInformation(
        val instrument_id: String,
        val best_ask: String,
        val best_bid: String,
        val last: String,
        val high_24h: String,
        val low_24h: String,
        val volume_24h: String,
        val timestamp: String,
        val last_qty: String,
        val best_bid_size: String,
        val best_ask_size: String
)