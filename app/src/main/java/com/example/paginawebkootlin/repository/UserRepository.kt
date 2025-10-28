package com.example.paginawebkootlin.repository

import com.example.paginawebkootlin.network.SupabaseClient
import com.example.paginawebkootlin.network.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import android.util.Log

object UserRepository {

    var currentUser: User? = null

    fun loginUser(email:String, password: String, onResult: (User?) -> Unit) {

        val apiKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InBpdmNzaHdkaWt6ZG9wb3RzZmJyIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NjE0OTk0NTIsImV4cCI6MjA3NzA3NTQ1Mn0.3oMNoboP_ZH3GDB-lCB6sIvsS5r94nGtXzqOUD28_14"
        val token = "Bearer $apiKey"
        val service = SupabaseClient.createService()

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val users = service.getUsers(apiKey, token)
                Log.d("UserRepository", "Usuarios obtenidos: ${users.size}")

                val usuario = users.find { it.email == email && it.password == password }

                withContext(Dispatchers.Main) {
                    onResult(usuario)
                }

            } catch (e: Exception) {
                Log.e("UserRepository", "Error en login: ${e.message}")
                withContext(Dispatchers.Main) {
                    onResult(null)
                }
            }
        }
    }

    fun logout() {
        currentUser = null
    }
}