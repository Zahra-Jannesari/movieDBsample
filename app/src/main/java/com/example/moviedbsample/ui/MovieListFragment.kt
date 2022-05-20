package com.example.moviedbsample.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.moviedbsample.MovieAdapter
import com.example.moviedbsample.R
import com.example.moviedbsample.databinding.FragmentMovieListBinding

class MovieListFragment : Fragment() {
    private val viewModel: MovieListViewModel by viewModels()
    lateinit var binding: FragmentMovieListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMovieListBinding.inflate(inflater)

        binding.lifecycleOwner = this

        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var adapter = MovieAdapter { id->onItemClick(id) }
        binding.recyclerView.adapter = adapter
        viewModel.upcomingMovies.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

    }
    fun onItemClick(id:Int){
        viewModel.getMovieDetails(id)
    }

}