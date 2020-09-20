package com.okex.api.data.funding.account

import lombok.Data

@Data
data class FundsTransfer(
        val transfer_id: String,
        val currency: String,
        val from: String,
        val amount: String,
        val to: String,
        val result: Boolean
)