package com.example.mvvm4.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm4.data.model.PokeResult
import com.example.mvvm4.domain.GetAllPokesUseCase
import kotlinx.coroutines.launch

class PokeListViewModel:ViewModel() {
    val pokeListViewModel=MutableLiveData<PokeResult>()
    var getAllPokesUseCase=GetAllPokesUseCase()

    fun onCreate() {
        //crea una corrutina automaticamente
        viewModelScope.launch {
            //isLoading.postValue(true)
            val result=getAllPokesUseCase

            if (result!=null){
                pokeListViewModel.postValue(result)
                //isLoading.postValue(true)
            }
        }
    }
}