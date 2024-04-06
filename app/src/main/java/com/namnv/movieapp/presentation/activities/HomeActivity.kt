package com.namnv.movieapp.presentation.activities

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.fragment.app.Fragment
import coil.load
import com.namnv.movieapp.databinding.ActivityHomeBinding
import com.namnv.movieapp.presentation.viewmodels.HomeActivityViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.bumptech.glide.Glide
import com.namnv.movieapp.R
import com.namnv.movieapp.presentation.fragments.HomeFragment
import com.namnv.movieapp.presentation.fragments.PlaylistFragment
import com.namnv.movieapp.presentation.fragments.ProfileFragment
import com.namnv.movieapp.presentation.fragments.SearchFragment

class HomeActivity : BaseActivity() {
    private final val TAG = HomeActivity::class.java.simpleName
    private lateinit var binding: ActivityHomeBinding
    private val viewModel: HomeActivityViewModel by viewModel()
    private var homeFragment = HomeFragment()
    private var searchFragment = SearchFragment()
    private var playlistFragment = PlaylistFragment()
    private var profileFragment = ProfileFragment()
    private var activeFragment:Fragment = homeFragment
    private val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        setUpBottomNavigation()
        Log.i(TAG, "HomeActivity created")
        viewModel.getMovieList()

    }
    private fun setUpBottomNavigation() {
        Log.i(TAG, "Setting up bottom navigation")
        fragmentManager.beginTransaction().apply {
            add(R.id.fragment_container, profileFragment, "profile").hide(profileFragment)
            add(R.id.fragment_container, playlistFragment, "playlist").hide(playlistFragment)
            add(R.id.fragment_container, searchFragment, "search").hide(searchFragment)
            add(R.id.fragment_container, homeFragment, "home")
        }.commit()
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> {
                    Log.i(TAG, "Home selected")
                    fragmentManager.beginTransaction().hide(activeFragment).show(homeFragment).commit()
                    // cách xem kích thước của fragment_container
                     Log.i(TAG, "Fragment container size: ${binding.fragmentContainer.width} x ${binding.fragmentContainer.height}")
                    activeFragment = homeFragment
                    true
                }
                R.id.navigation_favorite -> {
                    Log.i(TAG, "Favorite selected")
                    fragmentManager.beginTransaction().hide(activeFragment).show(playlistFragment).commit()
                    activeFragment = playlistFragment
                    true
                }
                R.id.navigation_search -> {
                    Log.i(TAG, "Search selected")
                    fragmentManager.beginTransaction().hide(activeFragment).show(searchFragment).commit()
                    activeFragment = searchFragment
                    true
                }
                R.id.navigation_profile -> {
                    Log.i(TAG, "Profile selected")
                    fragmentManager.beginTransaction().hide(activeFragment).show(profileFragment).commit()
                    activeFragment = profileFragment
                    true
                }
                else -> false
            }
        }
    }
}