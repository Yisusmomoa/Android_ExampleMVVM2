package com.example.mvvm4.data

import com.example.mvvm4.data.model.PokeResult
import com.example.mvvm4.data.network.Pokemon.PokemonService

class PokeRepository {
    //será la encargada de gestionar si accedemos a la parte de network, a la de database, etc
    //quoteprovider puede ser nuestra base de datos local
    private val api=PokemonService()
    suspend fun getAllPokemon():List<PokeResult>{
        val response=api.getAllPokemon()
        return response
    }
}