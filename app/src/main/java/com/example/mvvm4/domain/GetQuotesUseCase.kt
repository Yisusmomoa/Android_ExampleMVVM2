package com.example.mvvm4.domain

import com.example.mvvm4.data.QuoteRepository
import com.example.mvvm4.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository=QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>?{
        return repository.getAllQuotes()
    }
}