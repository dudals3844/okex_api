package com.okex.api.data.futures

import lombok.Data

@Data
data class ModifyOrder(
        val order_id: String,
        val client_oid: String,
        val request_id: String,
        val error_code: String,
        val error_message: String,
        val result: String
)