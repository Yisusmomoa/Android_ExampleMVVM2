package com.example.mvvm4.data.model

import com.google.gson.annotations.SerializedName

data class PokeResult (
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)