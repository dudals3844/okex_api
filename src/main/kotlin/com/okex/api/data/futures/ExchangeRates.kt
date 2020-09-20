package com.okex.api.data.futures

import lombok.Data

@Data
data class ExchangeRates(
        val instrument_id: String,
        val rate: String,
        val timestamp: String
)