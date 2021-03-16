package com.example.movieapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

internal class PagerOneFragment: Fragment() {

    lateinit var newReleaseRecyclerView: RecyclerView
    lateinit var comingSoonRecyclerView: RecyclerView
    lateinit var popularRecyclerView: RecyclerView
    private val movieList = ArrayList<MovieModel>()
    private val movieList2 = ArrayList<MovieModel>()
    private val movieList3 = ArrayList<MovieModel>()
    private lateinit var moviesAdapter: MoviesAdapter
    private lateinit var moviesAdapter2: MoviesAdapter
    private lateinit var moviesAdapter3: MoviesAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val applicationContext = null
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pager_one, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        newReleaseRecyclerView= view!!.findViewById(R.id.newReleaseRecyclerView)
        comingSoonRecyclerView= view!!.findViewById(R.id.coming_soon_recyclerView)
        popularRecyclerView= view!!.findViewById(R.id.popular_recyclerView)
        moviesAdapter = MoviesAdapter(movieList)
        moviesAdapter2 = MoviesAdapter(movieList2)
        moviesAdapter3 = MoviesAdapter(movieList3)

        val newReleaseLayoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,
            false)
        val comingSoonLayoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,
            false)
        val popularLayoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,
            false)

        //new release recycler
        newReleaseRecyclerView.layoutManager = newReleaseLayoutManager
        newReleaseRecyclerView.itemAnimator = DefaultItemAnimator()
        newReleaseRecyclerView.adapter = moviesAdapter

        //coming soon
        comingSoonRecyclerView.layoutManager = comingSoonLayoutManager
        comingSoonRecyclerView.itemAnimator = DefaultItemAnimator()
        comingSoonRecyclerView.adapter = moviesAdapter2

        //popular
        popularRecyclerView.layoutManager = popularLayoutManager
        popularRecyclerView.itemAnimator = DefaultItemAnimator()
        popularRecyclerView.adapter = moviesAdapter3

        prepareMovieData()
        prepareMovieData2()
        prepareMovieData3()
    }


    private fun prepareMovieData() {
        var movie = MovieModel("Aquaman2",R.drawable.aquaman1)
        movieList.add(movie)
        movie = MovieModel("Antman",R.drawable.antman)
        movieList.add(movie)
        movie = MovieModel("Joker",R.drawable.download4 )
        movieList.add(movie)
        movie = MovieModel("Jumanji2",R.drawable.jumanji2 )
        movieList.add(movie)
        movie = MovieModel("Bad Boys",R.drawable.badboys )
        movieList.add(movie)
        movie = MovieModel("Captain Marvel",R.drawable.captain_marvel )
        movieList.add(movie)
        movie = MovieModel("How To Build A Girl",R.drawable.how_to_build_a_girl )
        movieList.add(movie)
        movie = MovieModel("The Hunt Ver2",R.drawable.hunt_ver2 )
        movieList.add(movie)
        movie = MovieModel("The Kid Kinng",R.drawable.kid_king )
        movieList.add(movie)
        movie = MovieModel("The Spider Man",R.drawable.spiderman)
        movieList.add(movie)
        movie = MovieModel("The Croods A new Age",R.drawable.the_croods_a_new_age)
        movieList.add(movie)
        movie = MovieModel("News Of The World ",R.drawable.news_of_the_world)
        movieList.add(movie)
        moviesAdapter.notifyDataSetChanged()
    }

    private fun prepareMovieData2() {

        var movie = MovieModel("Aliens",R.drawable.aliens)
        movieList2.add(movie)
        movie = MovieModel("The Beauty and The Beast",R.drawable.beauty_and_beast)
        movieList2.add(movie)
        movie = MovieModel("Big Lebowski",R.drawable.big_lebowski)
        movieList2.add(movie)
        movie = MovieModel("Bird Man",R.drawable.birdman )
        movieList2.add(movie)
        movie = MovieModel("Back To The Future",R.drawable.back_to_the_future)
        movieList2.add(movie)
        movie = MovieModel("Black Panther",R.drawable.black_panther)
        movieList2.add(movie)
        movie = MovieModel("Children Of Men",R.drawable.children_of_men )
        movieList2.add(movie)
        movie = MovieModel("Election",R.drawable.election )
        movieList2.add(movie)
        movie = MovieModel("The Beautiful Mind",R.drawable.thebeautifulmind )
        movieList2.add(movie)
        movie = MovieModel("The Elephant Man",R.drawable.the_elephant_man)
        movieList2.add(movie)
        movie = MovieModel("Tesla",R.drawable.tesla)
        movieList2.add(movie)
        movie = MovieModel("Tax Collector",R.drawable.tax_collector)
        movieList2.add(movie)
        moviesAdapter2.notifyDataSetChanged()
    }

    private fun prepareMovieData3() {
        var movie = MovieModel("Aquaman2",R.drawable.aquaman1)
        movieList3.add(movie)
        movie = MovieModel("Antman",R.drawable.antman)
        movieList3.add(movie)
        movie = MovieModel("Joker",R.drawable.download4 )
        movieList3.add(movie)
        movie = MovieModel("Jumanji2",R.drawable.jumanji2 )
        movieList3.add(movie)
        movie = MovieModel("Bad Boys",R.drawable.badboys )
        movieList3.add(movie)
        movie = MovieModel("Captain Marvel",R.drawable.captain_marvel )
        movieList3.add(movie)
        movie = MovieModel("How To Build A Girl",R.drawable.how_to_build_a_girl )
        movieList3.add(movie)
        movie = MovieModel("The Hunt Ver2",R.drawable.hunt_ver2 )
        movieList3.add(movie)
        movie = MovieModel("The Kid Kinng",R.drawable.kid_king )
        movieList3.add(movie)
        movie = MovieModel("The Spider Man",R.drawable.spiderman)
        movieList3.add(movie)
        moviesAdapter3.notifyDataSetChanged()
    }
}