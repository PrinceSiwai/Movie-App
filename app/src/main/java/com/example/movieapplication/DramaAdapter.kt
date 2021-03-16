package com.example.movieapplication
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView


internal class DramaAdapter(private var dramaList: List<DramaModel>) :
    RecyclerView.Adapter<DramaAdapter.MyViewHolder>() {
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
    override fun onBindViewHolder(holder:MyViewHolder, position: Int) {
        val drama = dramaList[position]
        holder.title.text = drama.getTitle()
        holder.image.setImageResource(drama.getImage()!!)

    }
    override fun getItemCount(): Int {
        return dramaList.size
    }

}