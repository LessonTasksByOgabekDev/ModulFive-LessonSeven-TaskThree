package dev.ogabek.kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.model.Feed

class FeedAdapter(var context: Context, var feeds: List<Feed>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemViewType(position: Int): Int {
        return if (feeds[position].shorts == null) {
            TYPE_SIMPLE_VIEW
        } else {
            TYPE_SHORTS_VIEW
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == TYPE_SIMPLE_VIEW) {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_feed_video, parent, false)
            FeedVideoViewHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_short_video_recycler, parent, false)
            ShortsViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feed = feeds[position]
        if (holder is FeedVideoViewHolder) {
            holder.iv_video.setImageResource(feed.picture)
            holder.iv_profile.setImageResource(feed.profilePhoto)
            holder.tv_title.setText(feed.title)
            holder.tv_time.setText(feed.time)
            holder.tv_description.setText(feed.description)
        }
        if (holder is ShortsViewHolder) {
            val recyclerView = holder.recyclerView
            recyclerView.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            recyclerView.adapter = ShortAdapter(feed.shorts)
        }
    }

    override fun getItemCount(): Int {
        return feeds.size
    }

    private class FeedVideoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_video: ImageView
        var iv_more: ImageView
        var iv_profile: ShapeableImageView
        var tv_title: TextView
        var tv_description: TextView
        var tv_time: TextView

        init {
            iv_profile = view.findViewById(R.id.iv_video_profile)
            iv_video = view.findViewById(R.id.iv_video_photo)
            tv_title = view.findViewById(R.id.tv_title)
            tv_description = view.findViewById(R.id.tv_video_about)
            tv_time = view.findViewById(R.id.tv_video_time)
            iv_video = view.findViewById(R.id.iv_video_photo)
            iv_more = view.findViewById(R.id.iv_video_more)
        }
    }

    private class ShortsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var recyclerView: RecyclerView

        init {
            recyclerView = view.findViewById(R.id.rv_short)
        }
    }

    companion object {
        private const val TYPE_SHORTS_VIEW = 0
        private const val TYPE_SIMPLE_VIEW = 1
    }
}