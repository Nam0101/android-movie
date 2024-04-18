package com.namnv.movieapp.presentation.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.namnv.movieapp.databinding.ActivityHomeBinding
import com.namnv.movieapp.presentation.viewmodels.HomeActivityViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.namnv.movieapp.R
import com.namnv.movieapp.presentation.fragments.*

class HomeActivity : BaseActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val viewModel: HomeActivityViewModel by viewModel()
    private val fragments = listOf(HomeFragment(), SearchFragment(), PlaylistFragment(), ProfileFragment())
    private var activeFragment: Fragment = fragments[0]
    private val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        setUpBottomNavigation()
        viewModel.getMovieList()
        viewModel.getMovieResource()
    }

    private fun setUpBottomNavigation() {
        fragmentManager.beginTransaction().apply {
            fragments.forEach { fragment ->
                add(R.id.fragment_container, fragment, fragment::class.java.simpleName).hide(fragment)
            }
            show(fragments[0])
        }.commit()

        binding.bottomNavigation.apply {
            itemIconTintList = ContextCompat.getColorStateList(this@HomeActivity, R.color.bottom_nav_color)
            itemTextColor = ContextCompat.getColorStateList(this@HomeActivity, R.color.bottom_nav_color)
        }

        binding.bottomNavigation.setOnItemSelectedListener {
            val selectedFragment = when (it.itemId) {
                R.id.navigation_home -> fragments[0]
                R.id.navigation_favorite -> fragments[1]
                R.id.navigation_search -> fragments[2]
                R.id.navigation_profile -> fragments[3]
                else -> null
            }
            selectedFragment?.let { fragment ->
                fragmentManager.beginTransaction().hide(activeFragment).show(fragment).commit()
                activeFragment = fragment
            }
            selectedFragment != null
        }
    }
}