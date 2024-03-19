package com.damaris.horoscopo.data

import android.util.Log
import com.damaris.horoscopo.data.network.HoroscopeApiService
import com.damaris.horoscopo.data.network.response.PredictionResponse
import com.damaris.horoscopo.domain.Repository
import com.damaris.horoscopo.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {

        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("guido", "ha ocurrido un error -> ${it.message}") }
        return null
    }
}