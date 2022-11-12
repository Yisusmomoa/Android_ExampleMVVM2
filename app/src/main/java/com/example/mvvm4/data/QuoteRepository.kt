package com.example.mvvm4.data

import com.example.mvvm4.data.model.QuoteModel
import com.example.mvvm4.data.model.QuoteProvider
import com.example.mvvm4.data.network.QuoteService

class QuoteRepository {
    //será la encargada de gestionar si accedemos a la parte de network, a la de database, etc
    //quoteprovider puede ser nuestra base de datos local
    private val api=QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response=api.getQuotes()
        //guardamos en memoria, una bd local
        QuoteProvider.quotes=response
        return response
    }

}