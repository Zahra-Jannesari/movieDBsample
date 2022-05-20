package com.example.moviedbsample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moviedbsample.databinding.MovieItemBinding
import com.example.moviedbsample.model.Movie

typealias onItemClick=(Int)->Unit
class MovieAdapter(var onClick:onItemClick) : ListAdapter<Movie, MovieAdapter.ViewHolder>(DiffCallback) {

    inner class ViewHolder(
        private var binding:MovieItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie) {
            binding.filmName.text=movie.title

            Glide.with(binding.filmImage)
                .load("https://image.tmdb.org/t/p/w500${movie.posterPath}")
                .apply(RequestOptions().override(500, 500))
                .fitCenter()
//                .placeholder(R.drawable.loading_animation)
//                .error(R.drawable.ic_broken_image)
                .into(binding.filmImage)

            binding.root.setOnClickListener{onClick(movie.id)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.ViewHolder {
        return ViewHolder(
            MovieItemBinding.inflate(LayoutInflater.from(parent.context))
        )
    }

    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, position: Int) {
        val movie = getItem(position)
        holder.bind(movie)
    }

}

object DiffCallback : DiffUtil.ItemCallback<Movie>() {
    override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
        return oldItem.id == newItem.id
    }
}