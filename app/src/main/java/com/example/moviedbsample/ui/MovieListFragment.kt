package com.example.moviedbsample.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.moviedbsample.R
import com.example.moviedbsample.databinding.FragmentMovieListBinding

class MovieListFragment : Fragment() {
    private val viewModel: MovieListViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentMovieListBinding.inflate(inflater)

        binding.lifecycleOwner = this

        binding.viewModel = viewModel

        return  binding.root
    }


}