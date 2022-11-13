package com.example.mvvm4.data.network

import com.example.mvvm4.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
    //donde llamamos esta función, desde una class llamada QuoteService y de ahí un repositorio que nos dirá si
    //sacó la inforación desde internet o localmente

}