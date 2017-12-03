package com.lccj.newsagregador

import android.support.v7.widget.RecyclerView
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.items_news.view.*

/**
 * A RecyclerView.ViewHolder for the news items.
 */

class NewsViewHolder(view: View): RecyclerView.ViewHolder(view) {

    fun bind(model: News){
        itemView.newsTitleTextView.text = model.title
        Picasso.with(itemView.context).load(model.thumbnail).into(itemView.newsThumbnailImageView)
    }
}