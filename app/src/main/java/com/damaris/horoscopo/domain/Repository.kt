package com.damaris.horoscopo.domain

import com.damaris.horoscopo.data.network.response.PredictionResponse

interface Repository {
    suspend fun getPrediction(sing:String): PredictionResponse?
}