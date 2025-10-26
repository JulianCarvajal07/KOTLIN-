package com.example.paginawebkootlin

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SupabaseClient {

    private const val BASE_URL = "https://pivcshwdikzdopotsfbr.supabase.co/rest/v1/"

    fun createService(): SupabaseService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(SupabaseService::class.java)
    }
}
