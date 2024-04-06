package com.namnv.movieapp.presentation.fragments

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.namnv.movieapp.databinding.FragmentPlaylistBinding

class PlaylistFragment : Fragment(){
    private lateinit var binding : FragmentPlaylistBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentPlaylistBinding.inflate(inflater, container, false)
        return binding.root
    }
}