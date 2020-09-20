package com.okex.api.data.futures

import lombok.Data

@Data

data class HistoricalMarketData(
        val time: String,
        val open: String,
        val high: String,
        val low: String,
        val close: String,
        val volume: String,
        val currency_volume: String
)
