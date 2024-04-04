package com.namnv.movieapp.presentation.viewmodels

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.namnv.movieapp.data.JwtStore
import com.namnv.movieapp.data.models.LoginVM
import com.namnv.movieapp.domain.usecase.LoginUseCase
import io.sentry.Sentry
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class MainActivityViewModel(private val jwtStore: JwtStore) : ViewModel(), KoinComponent {
    private val TAG = MainActivityViewModel::class.java.simpleName
    val loginStatus = MutableLiveData<Boolean>()
    val loginError = MutableLiveData<String>()
    val userName = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val jwt = MutableLiveData<String>()
    private lateinit var loginVM: LoginVM
    private val loginUseCase: LoginUseCase by inject()

    init {
        Log.i(TAG, "init")
        loginStatus.value = false
        loginError.value = ""
        userName.value = ""
        password.value = ""
        jwt.value = jwtStore.getStoredJwt()
    }


   fun login(){
    loginVM = LoginVM(username = userName.value!!, password = password.value!!)
    viewModelScope.launch(Dispatchers.IO) {
        val result = loginUseCase.execute(loginVM)
        withContext(Dispatchers.Main) {
            jwt.value = result
            if (result.isNotEmpty()) {
                loginStatus.value = true
                jwt.value = jwtStore.getStoredJwt()
            } else {
                loginError.value = "Login failed"
                Sentry.captureException(RuntimeException("Login failed"))
            }
        }
    }
}
}