package com.okex.api.data.futures

import lombok.Data

@Data
data class BatchModifyOrders(
        val order_id: String,
        val client_oid: String,
        val error_code: String,
        val error_message: String,
        val result: String,
        val request_id: String
)