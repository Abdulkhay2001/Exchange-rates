package com.abdul.exchangerates.data.api

import com.abdul.exchangerates.model.beznal.Beznal
import com.abdul.exchangerates.model.nal.Nalichka
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoneys():Response<Nalichka>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoneys():Response<Beznal>

}
