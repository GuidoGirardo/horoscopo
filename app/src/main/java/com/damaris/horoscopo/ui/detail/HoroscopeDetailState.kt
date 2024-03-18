package com.damaris.horoscopo.ui.detail

import com.damaris.horoscopo.domain.model.HoroscopeModel

sealed class HoroscopeDetailState {
    data object Loading:HoroscopeDetailState()
    data class Error(val error:String):HoroscopeDetailState()
    data class Success(val date: String /* val prediction:String, val sign:String, val horoscopeModel: HoroscopeModel */):HoroscopeDetailState()
}