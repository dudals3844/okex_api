package com.okex.api.data.futures

import lombok.Data

@Data
data class EstimatedDeliveryPrice(
        val instrument_id: String,
        val settlement_price: String,
        val timestamp: String
)