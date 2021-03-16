package com.example.movieapplication
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


internal class PagerTwoFragment: Fragment() {

    lateinit var newReleaseRecyclerView: RecyclerView
    lateinit var comingSoonRecyclerView: RecyclerView
    lateinit var popularRecyclerView: RecyclerView
    private val showList = ArrayList<ShowModel>()
    private val showList2 = ArrayList<ShowModel>()
    private val showList3 = ArrayList<ShowModel>()
    private lateinit var showAdapter: ShowAdapter
    private lateinit var showAdapter2: ShowAdapter
    private lateinit var showAdapter3: ShowAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val applicationContext = null

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pager_two, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        newReleaseRecyclerView= view!!.findViewById(R.id.newReleaseRecyclerView)
        comingSoonRecyclerView= view!!.findViewById(R.id.coming_soon_recyclerView)
        popularRecyclerView= view!!.findViewById(R.id.popular_recyclerView)
        showAdapter = ShowAdapter(showList)
        showAdapter2 = ShowAdapter(showList2)
        showAdapter3 = ShowAdapter(showList3)
        val newReleaseLayoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,
                false)
        val comingSoonLayoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,
                false)
        val popularLayoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,
                false)

        //new release recycler
        newReleaseRecyclerView.layoutManager = newReleaseLayoutManager
        newReleaseRecyclerView.itemAnimator = DefaultItemAnimator()
        newReleaseRecyclerView.adapter = showAdapter

        //coming soon
        comingSoonRecyclerView.layoutManager = comingSoonLayoutManager
        comingSoonRecyclerView.itemAnimator = DefaultItemAnimator()
        comingSoonRecyclerView.adapter = showAdapter2

        //popular
        popularRecyclerView.layoutManager = popularLayoutManager
        popularRecyclerView.itemAnimator = DefaultItemAnimator()
        popularRecyclerView.adapter = showAdapter3

        prepareShowData()
        prepareShowData2()
        prepareShowData3()
    }


    private fun prepareShowData() {
        var show = ShowModel("7th-Heaven",R.drawable.heaven)
        showList.add(show)
        show= ShowModel("All In The Family",R.drawable.all_in_the_family)
        showList.add(show)
        show = ShowModel("Black Ish",R.drawable.black_ish)
        showList.add(show)
        show =ShowModel("Box's Burger",R.drawable.boxs_burger)
        showList.add(show)
        show = ShowModel("Brothers & Sisters",R.drawable.brothers_sisthers)
        showList.add(show)
        show = ShowModel("Eight Is Enough",R.drawable.eight_is_enough)
        showList.add(show)
        show = ShowModel("Everybody Loves Raymond",R.drawable.everybody_loves_raymond)
        showList.add(show)
        show = ShowModel("Family Ties",R.drawable.family_ties)
        showList.add(  show)
        show= ShowModel("Fresh Off The Boat",R.drawable.fresh_off_the_boat)
        showList.add(show)
        show = ShowModel("Full House",R.drawable.full_house)
        showList.add(show)
        show= ShowModel("Good Luck Charlie",R.drawable.good_luck_charlie)
        showList.add(show)
        show= ShowModel("ParentHood",R.drawable.parenthood)
        showList.add(show)
        showAdapter.notifyDataSetChanged()
    }

    private fun prepareShowData2() {
        var show = ShowModel("Roseanne",R.drawable.roseanne)
        showList2.add(show)
        show= ShowModel("Shameless",R.drawable.shameless)
        showList2.add(show)
        show = ShowModel("Six Feet Under",R.drawable.six_feet_under)
        showList2.add(show)
        show =ShowModel("The Foster",R.drawable.the_fosters)
        showList2.add(show)
        show = ShowModel("The Brady Bunch",R.drawable.the_brady_bunch)
        showList2.add(show)
        show = ShowModel("The Cosby Show",R.drawable.thecosbyshow)
        showList2.add(show)
        show = ShowModel("The Middle",R.drawable.the_middle)
        showList2.add(show)
        show = ShowModel("The Simpson",R.drawable.the_simpsons)
        showList2.add(  show)
        show= ShowModel("The Wonder Years",R.drawable.the_wonder_years)
        showList2.add(show)
        show = ShowModel("Trophy Wife",R.drawable.trophy_wife)
        showList2.add(show)
        show= ShowModel("Growing Pains",R.drawable.growing_pains)
        showList2.add(show)
        show= ShowModel("Step By Step ",R.drawable.step_bystep)
        showList2.add(show)
        showAdapter2.notifyDataSetChanged()
    }

    private fun prepareShowData3() {

        var show = ShowModel("Aquaman2",R.drawable.aquaman1)
        showList3.add(show)
        show= ShowModel("Antman",R.drawable.antman)
        showList3.add(show)
        show = ShowModel("Joker",R.drawable.download4 )
        showList3.add(show)
        show =ShowModel("Jumanji2",R.drawable.jumanji2 )
        showList3.add(show)
        show = ShowModel("Bad Boys",R.drawable.badboys )
        showList3.add(show)
        show = ShowModel("Captain Marvel",R.drawable.captain_marvel )
        showList3.add(show)
        show = ShowModel("How To Build A Girl",R.drawable.how_to_build_a_girl )
        showList3.add(show)
        show = ShowModel("The Hunt Ver2",R.drawable.hunt_ver2 )
        showList3.add(  show)
        show= ShowModel("The Kid Kinng",R.drawable.kid_king )
        showList3.add(show)
        show = ShowModel("The Spider Man",R.drawable.spiderman)
        showList3.add(show)
        show= ShowModel("The Croods A new Age",R.drawable.the_croods_a_new_age)
        showList3.add(show)
        show= ShowModel("News Of The World ",R.drawable.news_of_the_world)
        showList3.add(show)
        showAdapter3.notifyDataSetChanged()
    }

}