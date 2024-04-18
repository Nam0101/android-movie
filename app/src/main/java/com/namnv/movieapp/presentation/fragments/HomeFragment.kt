package com.namnv.movieapp.presentation.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.SimpleExoPlayer
import com.namnv.movieapp.databinding.FragmentHomeBinding
import com.namnv.movieapp.presentation.viewmodels.HomeActivityViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment :Fragment(){
    private lateinit var binding : FragmentHomeBinding
    private val TAG = HomeFragment::class.java.simpleName
    private val viewModel: HomeActivityViewModel by viewModel()
    private var player : ExoPlayer? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        Log.i(TAG, "HomeFragment created")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "HomeFragment view created")
        initializePlayer()
    }

    private fun initializePlayer() {
        player = ExoPlayer.Builder(requireContext()).build()
        binding.playerView.player = player

        val mediaItem = MediaItem.fromUri("https://vip.opstream11.com/20240408/51686_516da6c3/index.m3u8?sign=3b23a072aba20a782cf11c2f70b9693c")
        Log.i(TAG, "Media item: $mediaItem")
        player?.setMediaItem(mediaItem)
        player?.prepare()
        player?.play()
        // xoay màn hình

    }

    override fun onDestroyView() {
        super.onDestroyView()
        releasePlayer()
    }

    private fun releasePlayer() {
        player?.release()
        player = null
    }
}