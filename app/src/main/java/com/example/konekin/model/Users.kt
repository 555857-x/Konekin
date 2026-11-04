package com.example.konekin.model

import com.google.gson.annotations.SerializedName

data class Users(
    @SerializedName("Data")
    val data: List<Data>
)