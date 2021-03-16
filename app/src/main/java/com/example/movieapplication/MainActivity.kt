package com.example.movieapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import java.util.*
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainActivity : AppCompatActivity() {

    lateinit var viewPager: ViewPager
    lateinit var mTabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.viewPager)
        mTabLayout = findViewById(R.id.tab_layout)

        val imageList: MutableList<Int> = ArrayList()
        imageList.add(R.drawable.images7)
        imageList.add(R.drawable.antman)
        imageList.add(R.drawable.aquaman1)
        imageList.add(R.drawable.images8)
        imageList.add(R.drawable.martian)
        imageList.add(R.drawable.thebeautifulmind)
        imageList.add(R.drawable.download)
        imageList.add(R.drawable.download4)
        imageList.add(R.drawable.download5)
        imageList.add(R.drawable.download6)
        val myAdapter = MyAdapter(supportFragmentManager, imageList)
        viewPager.setAdapter(myAdapter)
        //mTabLayout.tabSelectedIndicator = resources.getDrawable(R.drawable.tab_indicator_selected)
        mTabLayout.setTabsFromPagerAdapter(myAdapter)

        var tab_viewpager = findViewById<ViewPager>(R.id.tab_viewpager)
        var tab_tablayout = findViewById<TabLayout>(R.id.tab_tablayout)
        setupViewPager(tab_viewpager)
        tab_tablayout.setupWithViewPager(tab_viewpager)

    }
    private fun setupViewPager(viewpager: ViewPager) {
        var adapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        // is a title of tab
        adapter.addFragment(PagerOneFragment(), "Movies")
        adapter.addFragment(PagerTwoFragment(), "Shows")
        adapter.addFragment(PagerThreeFragment(), "Drama")

        // setting adapter to view pager.
        viewpager.setAdapter(adapter)
    }

    class ViewPagerAdapter : FragmentPagerAdapter {

        // objects of arraylist. One is of Fragment type and
        // another one is of String type.*/
        private final var fragmentList1: ArrayList<Fragment> = ArrayList()
        private final var fragmentTitleList1: ArrayList<String> = ArrayList()

        // this is a secondary constructor of ViewPagerAdapter class.
        public constructor(supportFragmentManager: FragmentManager)
                : super(supportFragmentManager)

        // returns which item is selected from arraylist of fragments.
        override fun getItem(position: Int): Fragment {
            return fragmentList1.get(position)
        }

        // returns which item is selected from arraylist of titles.
        @Nullable
        override fun getPageTitle(position: Int): CharSequence {
            return fragmentTitleList1.get(position)
        }

        // returns the number of items present in arraylist.
        override fun getCount(): Int {
            return fragmentList1.size
        }

        // this function adds the fragment and title in 2 separate  arraylist.
        fun addFragment(fragment: Fragment, title: String) {
            fragmentList1.add(fragment)
            fragmentTitleList1.add(title)
        }
    }



}

