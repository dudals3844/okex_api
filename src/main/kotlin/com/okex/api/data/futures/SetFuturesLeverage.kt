package com.okex.api.data.futures

import lombok.Data

@Data
data class SetFuturesLeverage(
        val margin_mode: String,
        val underlying: String,
        val leverage: String,
        val result: String
)