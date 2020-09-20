package com.okex.api.data.funding.account

import lombok.Data

@Data
data class Currency(
        val balance: String,
        val hold: String,
        val available: String,
        val currency: String
)