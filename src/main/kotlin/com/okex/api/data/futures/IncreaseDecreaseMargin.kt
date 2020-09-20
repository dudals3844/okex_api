package com.okex.api.data.futures

import lombok.Data

@Data
data class IncreaseDecreaseMargin(
        val instrument_id: String,
        val direction: String,
        val type: String,
        val amount: String,
        val liquidation_price: String,
        val error_code: String,
        val error_message: String,
        val result: String

)