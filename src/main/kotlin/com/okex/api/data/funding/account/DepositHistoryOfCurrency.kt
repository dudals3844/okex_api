package com.okex.api.data.funding.account

import lombok.Data

@Data
data class DepositHistoryOfCurrency(
        val amount: String,
        val from: String,
        val to: String,
        val txid: String,
        val timestamp: String,
        val currency: String,
        val state: String,
        val deposit_id: String
)