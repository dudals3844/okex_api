package com.okex.api.data.futures

import lombok.Data


@Data
data class CancleOrder(
        val order_id: String,
        val result: String,
        val client_oid: String,
        val instrument_id: String,
        val error_code: String,
        val error_message: String

)