package com.damaris.horoscopo.domain

import com.damaris.horoscopo.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sing:String): PredictionModel?
}