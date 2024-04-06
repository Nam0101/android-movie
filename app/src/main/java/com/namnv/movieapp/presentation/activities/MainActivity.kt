package com.namnv.movieapp.presentation.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.namnv.movieapp.R
import com.namnv.movieapp.databinding.ActivityMainBinding
import com.namnv.movieapp.presentation.viewmodels.MainActivityViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {
    private val TAG = MainActivity::class.java.simpleName
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        observeJwt()
        binding.loginButton.setOnClickListener {
            loginButtonClicked()
        }
        observeError()
    }
    private fun loginButtonClicked() {
        val username = binding.usernameEditText.text.toString()
        val password = binding.passwordEditText.text.toString()
        viewModel.userName.value = username
        viewModel.password.value = password
        viewModel.login()
    }
    private fun observeJwt() {
        viewModel.jwt.observe(this) {
            if (validJwt()) {
                Log.i(TAG, "JWT is valid")
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            }
            Log.i(TAG, "JWT is invalid")
        }
    }
    private fun observeError() {
        viewModel.loginError.observe(this)
        {
            Toast.makeText(this, viewModel.loginError.value, Toast.LENGTH_SHORT).show()
        }
    }
    private fun validJwt(): Boolean {
        return viewModel.isValidJwt()
    }
}


