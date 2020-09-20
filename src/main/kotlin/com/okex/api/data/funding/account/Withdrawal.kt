package com.okex.api.data.funding.account

import lombok.Data

@Data
data class Withdrawal(
        val currency: String,
        val amount: String,
        val withdraw_id: String,
        val result: String
)