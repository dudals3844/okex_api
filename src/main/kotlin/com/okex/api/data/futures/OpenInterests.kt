package com.okex.api.data.futures

import lombok.Data

@Data
data class OpenInterests(
        val instrument_id: String,
        val amount: String,
        val timestamp: String
)