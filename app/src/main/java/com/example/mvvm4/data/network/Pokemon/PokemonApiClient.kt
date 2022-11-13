package com.example.mvvm4.data.network.Pokemon

import com.example.mvvm4.data.model.PokeResult
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApiClient {
    @GET("/pokemon")
    suspend fun getAllPokes(): Response<List<PokeResult>>
}