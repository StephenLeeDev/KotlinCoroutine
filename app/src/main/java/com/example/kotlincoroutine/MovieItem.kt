package com.example.kotlincoroutine

import com.google.gson.annotations.SerializedName

data class MovieItem(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("language")
    val language: String
)