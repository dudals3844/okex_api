package com.okex.api.data.futures

import lombok.Data

@Data
data class OrderList(
        val instrument_id: String,
        val client_oid: String,
        val size: String,
        val timestamp: String,
        val filled_qty: String,
        val fee: String,
        val order_id: String,
        val price: String,
        val price_avg: String,
        val type: String,
        val contract_val: String,
        val leverage: String,
        val order_type: String,
        val pnl: String,
        val state: String
)