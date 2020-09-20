package com.okex.api.data.funding.account

import lombok.Data

@Data
data class WithdrawalHistoryOfCurrency(
        val currency: String,
        val amount: String,
        val timestamp: String,
        val from: String,
        val to: String,
        val tag: String,
        val payment_id: String,
        val memo: String,
        val txid: String,
        val fee: String,
        val status: String,
        val withdrawal_id: String
)