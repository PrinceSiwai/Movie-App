package com.example.movieapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView

internal class ShowAdapter(private var showList: List<ShowModel>) :
        RecyclerView.Adapter<ShowAdapter.MyViewHolder>() {
    internal inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.title)
        var image: ImageView = view.findViewById(R.id.image)
    }

    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_row, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val show = showList[position]
        holder.title.text = show.getTitle()
        holder.image.setImageResource(show.getImage()!!)

    }

    override fun getItemCount(): Int {
        return showList.size
    }
}
