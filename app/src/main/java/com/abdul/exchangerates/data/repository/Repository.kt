package com.abdul.exchangerates.data.repository

import com.abdul.exchangerates.data.api.RetrofitInstance
import com.abdul.exchangerates.model.beznal.Beznal
import com.abdul.exchangerates.model.nal.Nalichka
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nalichka>{
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBeznal(): Response<Beznal>{
        return RetrofitInstance.api.getBeznalMoneys()
    }

}