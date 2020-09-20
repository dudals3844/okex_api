package com.okex.api.data.futures

import lombok.Data

@Data
data class FuturesAccountOfCurrency(
        val margin_mode: String,
        val equity: String,
        val total_avail_balance: String,
        val margin: String,
        val margin_frozen: String,
        val margin_for_unfilled: String,
        val realized_pnl: String,
        val unrealized_pnl: String,
        val margin_ratio: String,
        val maint_margin_ratio: String,
        val liqui_mode: String,
        val can_withdraw: String,
        val liqui_fee_rate: String,
        val underlying: String,
        val currency: String
)