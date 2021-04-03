package com.nullpointer.newsapp.view

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.nullpointer.newsapp.R
import com.nullpointer.newsapp.datasource.Article
import kotlinx.android.synthetic.main.news_row.view.*

class NewsRecyclerViewAdapter(var newsData: ArrayList<Article>): RecyclerView.Adapter<NewsRecyclerViewAdapter.NewsViewHolder>() {

    lateinit var context: Context
    fun updateList(newList: List<Article>) {
        newsData.clear()
        newsData.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        context = parent.context
        return NewsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.news_row, parent, false))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(newsData[position], context)
    }

    override fun getItemCount(): Int {
        return newsData.size
    }

    class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        @SuppressLint("SimpleDateFormat", "SetTextI18n")
        fun bind(article: Article, context: Context) {
            itemView.newsTitleLbl.text = article.title

            val options = RequestOptions()
                .error(R.mipmap.ic_launcher_round)
            Glide.with(itemView.newsImageView.context)
                .setDefaultRequestOptions(options)
                .load(article.urlToImage)
                .into(itemView.newsImageView)
        }
    }
}