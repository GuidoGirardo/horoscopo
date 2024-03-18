package com.damaris.horoscopo.data

import android.util.Log
import com.damaris.horoscopo.data.network.HoroscopeApiService
import com.damaris.horoscopo.data.network.response.PredictionResponse
import com.damaris.horoscopo.domain.Repository
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionResponse? {

        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it }
            .onFailure { Log.i("guido", "ha ocurrido un error -> ${it.message}") }
        return null
    }
}