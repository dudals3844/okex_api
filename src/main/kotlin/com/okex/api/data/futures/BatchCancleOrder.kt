package com.okex.api.data.futures

import lombok.Data

@Data
data class BatchCancleOrder(
        val instrument_id: String,
        val order_id: String,
        val result: String,
        val client_oids: String,
        val error_code: String,
        val error_message: String
)