package com.okex.api.data.futures

import lombok.Data

@Data
data class CancleAllPositionReductionOrders(
        val instrument_id: String,
        val direction: String,
        val error_code: String,
        val error_message: String,
        val result: String
)