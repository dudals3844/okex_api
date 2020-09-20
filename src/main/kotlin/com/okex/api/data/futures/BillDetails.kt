package com.okex.api.data.futures

import lombok.Data

@Data
data class BillDetails(
        val ledger_id: String,
        val underlying: String,
        val amount: String,
        val type: String,
        val timestamp: String,
        val order_id: String,
        val instrument_id: String,
        val balance: String,
        val currency: String,
        val details: String,
        val from: String,
        val to: String
)