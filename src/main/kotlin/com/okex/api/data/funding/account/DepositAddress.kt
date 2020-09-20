package com.okex.api.data.funding.account

import lombok.Data


@Data
data class DepositAddress(
        val address: String,
        val tag: String,
        val payment_id: String,
        val memo: String,
        val currency: String,
        val to: String

)