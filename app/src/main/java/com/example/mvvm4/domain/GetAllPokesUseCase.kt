package com.example.mvvm4.domain

import com.example.mvvm4.data.PokeRepository
import com.example.mvvm4.data.model.PokeResult

class GetAllPokesUseCase {
    private val repository=PokeRepository()

    suspend operator fun invoke():List<PokeResult>?{
        return repository.getAllPokemon()
    }
}