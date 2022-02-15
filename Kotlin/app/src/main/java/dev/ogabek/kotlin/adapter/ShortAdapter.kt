package dev.ogabek.kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.model.Short

class ShortAdapter(var shorts: List<Short>?) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_short_view, parent, false)
        return ShortViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val short_video = shorts!![position]
        if (holder is ShortViewHolder) {
            holder.title.text = short_video.title
            holder.views.text = short_video.view + " views"
            holder.image.setImageResource(short_video.photo)
        }
    }

    override fun getItemCount(): Int {
        return shorts!!.size
    }

    private class ShortViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var image: ImageView = view.findViewById(R.id.iv_short_photo)
        var title: TextView = view.findViewById(R.id.tv_short_title)
        var views: TextView = view.findViewById(R.id.tv_short_view)

    }
}