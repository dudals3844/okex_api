package com.okex.api.data.funding.account

import lombok.Data

@Data
data class Balance(
        val currency: String,
        val balance: String,
        val hold: String,
        val available: String
)