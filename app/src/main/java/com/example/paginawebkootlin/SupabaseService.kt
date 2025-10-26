package com.example.paginawebkootlin

import retrofit2.http.*

data class User(
    val id: Int? = null,
    val username: String,
    val email: String,
    val password: String
)

interface SupabaseService {

    @GET("users")
    suspend fun getUsers(
        @Header("apikey") apiKey: String,
        @Header("Authorization") bearer: String = "Bearer $apiKey"
    ): List<User>

    @POST("users")
    suspend fun addUser(
        @Header("apikey") apiKey: String,
        @Header("Authorization") bearer: String = "Bearer $apiKey",
        @Body user: User
    )
}

