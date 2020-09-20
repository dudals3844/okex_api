package com.okex.api.data.funding.account

import lombok.Data

@Data
data class WithdrawFees(
        val currency: String,
        val min_fee: String,
        val max_fee: String
)