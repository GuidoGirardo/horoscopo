package com.damaris.horoscopo.data.network.response

import com.damaris.horoscopo.motherobject.HoroscopeMotherObject
import io.kotlintest.shouldBe
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class PredictionResponseTest{

    @Test
    fun `toDomain should return a correct PredictionModel`(){

        // Given
        val horoscopeResponse = HoroscopeMotherObject.anyResponse

        // When
        val predictionModel = horoscopeResponse.toDomain()

        // Then
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope

    }

}