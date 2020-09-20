package com.okex.api.data.funding.account

import lombok.Data

@Data
data class SubAccount(
        val balance: String,
        val hold: String,
        val available: String,
        val equity: String,
        val max_withdraw: String,
        val currency: String,
        val sub_account: String,
        val asset_valuation: String,
        val account_type: String

)