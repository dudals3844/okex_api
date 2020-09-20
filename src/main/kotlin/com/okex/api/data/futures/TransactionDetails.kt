package com.okex.api.data.futures

import lombok.Data


@Data
data class TransactionDetails(
        val trade_id: String,
        val instrument_id: String,
        val price: String,
        val order_qty: String,
        val order_id: String,
        val client_oid: String,
        val create_at: String,
        val exec_type: String,
        val fee: String,
        val side: String,
        val type: String
)