package com.example.movieapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


internal class PagerThreeFragment: Fragment() {

    lateinit var newReleaseRecyclerView: RecyclerView
    lateinit var comingSoonRecyclerView: RecyclerView
    lateinit var popularRecyclerView: RecyclerView
    private val dramaList = ArrayList<DramaModel>()
    private val dramaList2 = ArrayList<DramaModel>()
    private val dramaList3 = ArrayList<DramaModel>()
    private lateinit var dramaAdapter: DramaAdapter
    private lateinit var dramaAdapter2:DramaAdapter
    private lateinit var dramaAdapter3:DramaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val applicationContext = null

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pager_three, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        newReleaseRecyclerView= view!!.findViewById(R.id.newReleaseRecyclerView)
        comingSoonRecyclerView= view!!.findViewById(R.id.coming_soon_recyclerView)
        popularRecyclerView= view!!.findViewById(R.id.popular_recyclerView)
        dramaAdapter = DramaAdapter(dramaList)
        dramaAdapter2 = DramaAdapter(dramaList2)
        dramaAdapter3 = DramaAdapter(dramaList3)
        val newReleaseLayoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,
            false)
        val comingSoonLayoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,
            false)
        val popularLayoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,
            false)

        //new release recycler
        newReleaseRecyclerView.layoutManager = newReleaseLayoutManager
        newReleaseRecyclerView.itemAnimator = DefaultItemAnimator()
        newReleaseRecyclerView.adapter = dramaAdapter

        //coming soon
        comingSoonRecyclerView.layoutManager = comingSoonLayoutManager
        comingSoonRecyclerView.itemAnimator = DefaultItemAnimator()
        comingSoonRecyclerView.adapter = dramaAdapter2

        //popular
        popularRecyclerView.layoutManager = popularLayoutManager
        popularRecyclerView.itemAnimator = DefaultItemAnimator()
        popularRecyclerView.adapter = dramaAdapter3

        prepareDramaData()
        prepareDramaData2()
        prepareDramaData3()
    }


    private fun prepareDramaData() {
        var drama = DramaModel("22 July",R.drawable.july)
        dramaList.add(drama )
        drama  = DramaModel("365 Days",R.drawable.days)
        dramaList.add(drama )
        drama  = DramaModel("A Fall From Grace",R.drawable.a_fall_from_grace)
        dramaList.add(drama )
        drama  = DramaModel("All Night And A Day",R.drawable.all_night_and_a_day)
        dramaList.add(drama )
        drama  = DramaModel("And Then We Dance",R.drawable.and_then_we_danced)
        dramaList.add(drama )
        drama  = DramaModel("Cadaver",R.drawable.cadaver)
        dramaList.add(drama )
        drama  = DramaModel("Chappaquiddick",R.drawable.chappaquiddick)
        dramaList.add(drama )
        drama  = DramaModel("Emma",R.drawable.emma)
        dramaList.add(drama )
        drama = DramaModel("Enola Holmes",R.drawable.enola_holmes)
        dramaList.add(drama )
        drama  = DramaModel("Finding Grace",R.drawable.finding_grace)
        dramaList.add(drama )
        drama  = DramaModel("Lovers Rock",R.drawable.lovers_rock)
        dramaList.add(drama )
        drama  = DramaModel("Ma Rainey Black Bottom",R.drawable.ma_rainey_black_bottom)
        dramaList.add(drama )
        dramaAdapter.notifyDataSetChanged()
    }

    private fun prepareDramaData2() {
        var drama  = DramaModel("Mank",R.drawable.mank)
        dramaList2.add(drama )
        drama  = DramaModel("Mudbound",R.drawable.mudbound)
        dramaList2.add(drama )
        drama  = DramaModel("Murder Manual",R.drawable.murder_manual)
        dramaList2.add(drama )
        drama  = DramaModel("Nomadland",R.drawable.nomadland)
        dramaList2.add(drama )
        drama  = DramaModel("Pacto De Fuga",R.drawable.pacto_de_fuga)
        dramaList2.add(drama )
        drama  = DramaModel("Promising Young Woman",R.drawable.promising_young_woman)
        dramaList2.add(drama )
        drama  = DramaModel("Proximity",R.drawable.proximity )
        dramaList2.add(drama )
        drama  = DramaModel("Relic",R.drawable.relic)
        dramaList2.add(drama )
        drama  = DramaModel("Rising High",R.drawable.rising_high)
        dramaList2.add(drama )
        drama  = DramaModel("Roma",R.drawable.roma)
        dramaList2.add(drama)
        drama = DramaModel("The Assistant",R.drawable.the_assistant)
        dramaList2.add(drama)
        drama = DramaModel("The Binding",R.drawable.the_binding)
        dramaList2.add(drama)
        dramaAdapter2.notifyDataSetChanged()
    }

    private fun prepareDramaData3() {
        var drama = DramaModel("The Craft",R.drawable.the_craft)
        dramaList3.add(drama)
        drama = DramaModel("The Other Lamb",R.drawable.the_other_lamb)
        dramaList3.add(drama)
        drama = DramaModel("The Postcard Killing",R.drawable.the_postcard_killing)
        dramaList3.add(drama)
        drama = DramaModel("The Theory Of Everything",R.drawable.the_theory_of_everything)
        dramaList3.add(drama)
        drama = DramaModel("Trial Of The Chicago",R.drawable.trial_of_the_chicago_7)
        dramaList3.add(drama)
        drama = DramaModel("Captain Marvel",R.drawable.captain_marvel )
        dramaList3.add(drama)
        drama = DramaModel("How To Build A Girl",R.drawable.how_to_build_a_girl )
        dramaList3.add(drama)
        drama = DramaModel("The Hunt Ver2",R.drawable.hunt_ver2 )
        dramaList3.add(drama)
        drama = DramaModel("The Kid Kinng",R.drawable.kid_king )
        dramaList3.add(drama)
        drama = DramaModel("The Spider Man",R.drawable.spiderman)
        dramaList3.add(drama)
        drama = DramaModel("The Croods A new Age",R.drawable.the_croods_a_new_age)
        dramaList3.add(drama)
        drama = DramaModel("News Of The World ",R.drawable.news_of_the_world)
        dramaList3.add(drama)
        dramaAdapter3.notifyDataSetChanged()
    }
}