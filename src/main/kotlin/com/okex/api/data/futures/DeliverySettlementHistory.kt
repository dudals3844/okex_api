package com.okex.api.data.futures

import lombok.Data

@Data
data class DeliverySettlementHistory(
        val instrument_id: String,
        val type: String,
        val settlement_price: String,
        val clawback_loss: String,
        val reserve: String,
        val clawback_rate: String,
        val timestamp: String
)