package com.okex.api.data.futures

import lombok.Data

@Data
data class SettingAccountMode(
        val underlying: String,
        val margin_mode: String,
        val result: String
)