package com.example.mvvm4.data.network.Pokemon

import com.example.mvvm4.core.RetrofitHelper
import com.example.mvvm4.data.model.PokeResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.create

class PokemonService {
    private var retrofit= RetrofitHelper.getRetrofit()

    suspend fun getAllPokemon():List<PokeResult>{
        return withContext(Dispatchers.IO){
            val response=retrofit.create(PokemonApiClient::class.java).getAllPokes()
            response.body()?: emptyList()

        }
    }
}