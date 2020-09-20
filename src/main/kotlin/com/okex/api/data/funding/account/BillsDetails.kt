package com.okex.api.data.funding.account

import lombok.Data

@Data
data class BillsDetails(
        val ledger_id: String,
        val currency: String,
        val balance: String,
        val amount: String,
        val typename: String,
        val fee: String,
        val timestamp: String
)