package com.namnv.movieapp.presentation.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.namnv.movieapp.R
import com.namnv.movieapp.databinding.ActivityMainBinding
import com.namnv.movieapp.presentation.viewmodels.MainActivityViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import android.widget.Toast
class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupInsets()
        setupObservers()
        setupLoginButton()
    }

    private fun setupInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun setupObservers() {
        viewModel.jwt.observe(this) {
            if (viewModel.isValidJwt()) {
                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            }
        }

        viewModel.loginError.observe(this) { error ->
            showToast(error)
        }
    }

    private fun setupLoginButton() {
        binding.loginButton.setOnClickListener {
            viewModel.userName.value = binding.usernameEditText.text.toString()
            viewModel.password.value = binding.passwordEditText.text.toString()
            viewModel.login()
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}