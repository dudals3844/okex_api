package com.okex.api.data.funding.account

import lombok.Data

@Data
data class AssetValuation(
        val valuation_currency: String,
        val balance: String,
        val timestamp: String,
        val account_type: String
)