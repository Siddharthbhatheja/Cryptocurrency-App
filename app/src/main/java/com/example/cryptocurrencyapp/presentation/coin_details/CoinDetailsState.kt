package com.example.cryptocurrencyapp.presentation.coin_details

import com.example.cryptocurrencyapp.domain.model.CoinDetails

data class CoinDetailsState(
    val isLoading: Boolean = false,
    val coin: CoinDetails? = null,
    val error: String = ""
)

