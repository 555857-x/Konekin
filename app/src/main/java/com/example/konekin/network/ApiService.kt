package com.example.konekin.network

interface ApiService {
    @GET("employees")
    fun getAllUsers(): Call<Users>
}