package com.okex.api.data.funding.account

import lombok.Data

@Data
data class Currencies(
        val currency: String,
        val name: String,
        val can_deposit: String,
        val can_withdraw: String,
        val min_withdraw:String
)