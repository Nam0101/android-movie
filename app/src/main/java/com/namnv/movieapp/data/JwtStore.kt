package com.namnv.movieapp.data

import android.content.Context
import android.util.Log

class JwtStore(private val context: Context) {
    init {
        Log.i("JwtStore", "init")
    }
    fun getStoredJwt(): String {
        val sharedPref = context.getSharedPreferences("com.namnv.movieapp.PREFERENCE_FILE_KEY", Context.MODE_PRIVATE)
        return sharedPref.getString("JWT", "") ?: ""
    }

    fun storeJwt(jwt: String) {
        val sharedPref = context.getSharedPreferences("com.namnv.movieapp.PREFERENCE_FILE_KEY", Context.MODE_PRIVATE) ?: return
        with (sharedPref.edit()) {
            putString("JWT", jwt)
            apply()
        }
    }
}