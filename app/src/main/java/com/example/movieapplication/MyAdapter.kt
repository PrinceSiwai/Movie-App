package com.example.movieapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.PagerAdapter


class MyAdapter internal constructor(
    supportFragmentManager: FragmentManager?,
    var list: List<Int>
) :
    PagerAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view =
            LayoutInflater.from(container.context).inflate(R.layout.image_layout, container, false)
        val image = view.findViewById<ImageView>(R.id.imageView)
        image.setImageResource(list[position])
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}
