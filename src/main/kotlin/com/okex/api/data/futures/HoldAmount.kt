package com.okex.api.data.futures

import lombok.Data

@Data
data class HoldAmount(
        val instrument_id: String,
        val amount: String,
        val timestamp: String
)