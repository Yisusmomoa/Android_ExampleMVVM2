package com.example.mvvm4.data.model

import com.google.gson.annotations.SerializedName

//usaos este modelo de resppuesta de retrofit
//la info que recuperamos de retrofit la  convertimos en este modelo de datos
//se deben de llamar igual para funcioanr
data class QuoteModel(
    @SerializedName("quote") val quote:String,
    @SerializedName("author") val author:String
)
