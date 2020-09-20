package com.okex.api.data.funding.account

import lombok.Data

@Data
data class DepositHistory(
        val currency: String,
        val amount: String,
        val from: String,
        val to: String,
        val txid: String,
        val timestamp: String,
        val state: String,
        val deposit_id: String
)