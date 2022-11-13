package com.example.mvvm4.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm4.data.model.QuoteModel
import com.example.mvvm4.data.model.QuoteProvider
import com.example.mvvm4.domain.GetQuotesUseCase
import com.example.mvvm4.domain.GetRandomQuoteUseCase
import kotlinx.coroutines.launch

class QuoteViewModel :ViewModel(){
    //hereda todos de viewodel
    val quoteModel=MutableLiveData<QuoteModel>()
    //este valor ira cambiando

    val isLoading=MutableLiveData<Boolean>()
    //se encarga de mostrar u ocultar la barra de progreso

    //esta función será llamada por la activity
    //Llamar a un caso de uso
    var getQuotesUseCase=GetQuotesUseCase()
    var getRandomQuoteUseCase=GetRandomQuoteUseCase()

    fun randomeQuote(){
        isLoading.postValue(true)
        /*val result=getRandomQuoteUseCase()
        if (result!=null){
            quoteModel.postValue(result)
            isLoading.postValue(true)
        }*/
    }

    fun onCreate() {
        //crea una corrutina automaticamente
        viewModelScope.launch {
            isLoading.postValue(true)
            val result=getQuotesUseCase()
            if (!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(true)
            }
            isLoading.postValue(false)
        }
    }
}