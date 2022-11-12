package com.example.mvvm4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm4.model.QuoteModel
import com.example.mvvm4.model.QuoteProvider

class QuoteViewModel :ViewModel(){
    //hereda todos de viewodel
    val quoteModel=MutableLiveData<QuoteModel>()
    //este valor ira cambiando

    //esta función será llamada por lal activity

    fun randomeQuote(){
        val currentQuote=QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}