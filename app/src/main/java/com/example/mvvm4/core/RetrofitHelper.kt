package com.example.mvvm4.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
//puro consumo de apis
    //configuración de retrofift
    fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")//ruta fija de nuestros endpoints
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}