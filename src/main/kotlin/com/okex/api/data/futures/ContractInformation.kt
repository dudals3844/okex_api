package com.okex.api.data.futures

import lombok.Data

@Data
data class ContractInformation(
        val instrument_id: String,
        var underlying: String,
        var base_currency: String,
        var quote_currency: String,
        var settlement_currency: String,
        var contract_val: String,
        var listing: String,
        var delivery: String,
        var tick_size: String,
        var trade_increment: String,
        var alias: String,
        var is_inverse: String,
        var contract_val_currency: String,
        var category: String
)