package com.example.mvvm4.data.network

import com.example.mvvm4.core.RetrofitHelper
import com.example.mvvm4.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class QuoteService {
    //todas las llamadas a internet serán desde aquí
    private var retrofit=RetrofitHelper.getRetrofit()

    suspend fun getQuotes():List<QuoteModel>{
        return withContext(Dispatchers.IO){
            val response=retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body()?: emptyList()

        }
    }
}