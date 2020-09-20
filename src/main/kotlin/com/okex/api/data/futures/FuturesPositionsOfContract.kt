package com.okex.api.data.futures

import lombok.Data

@Data
data class FuturesPositionsOfContract(
        val margin_mode: String,
        val liquidation_price: String,
        val long_qty: String,
        val long_avail_qty: String,
        val long_avg_cost: String,
        val long_settlement_price: String,
        val realised_pnl: String,
        val leverage: String,
        val short_qty: String,
        val short_avail_qty: String,
        val short_settlement_price: String,
        val instrument_id: String,
        val created_at: String,
        val updated_at: String,
        val short_margin: String,
        val short_pnl: String,
        val short_pnl_ratio: String,
        val short_unrealised_pnl: String,
        val short_settled_pnl: String,
        val long_margin: String,
        val long_pnl: String,
        val long_pnl_ratio: String,
        val long_unrealised_pnl: String,
        val long_settled_pnl: String,
        val last: String
)