package com.okex.api.data.futures

import lombok.Data

@Data
data class Indices(
        val instrument_id: String,
        val index: String,
        val timestamp: String
)