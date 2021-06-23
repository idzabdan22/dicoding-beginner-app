package com.example.houzzdicoding.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.houzzdicoding.Activity.ContentActivity
import com.example.houzzdicoding.Models.DataApps
import com.example.houzzdicoding.R

class ListDataAppsAdapter(private val listData: ArrayList<DataApps>) : RecyclerView.Adapter<ListDataAppsAdapter.ListViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val parent: View = LayoutInflater.from(parent.context).inflate(R.layout.cardview_data, parent, false)
        return ListViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = listData[position]

        Glide.with(holder.itemView.context)
            .load(data.desImage)
            .apply(RequestOptions().override(350,350))
            .into(holder.imgPhoto)

        Glide.with(holder.itemView.context)
            .load(data.userPhoto)
            .apply(RequestOptions().override(350,350))
            .into(holder.userphoto)

        holder.name.text = data.userName
        holder.title.text = data.desTitle
        holder.desc.text = data.desDesc


        holder.imgPhoto.setOnClickListener(){
            var intent = Intent(holder.itemView.context, ContentActivity::class.java)
            intent.putExtra("content_image", data.desImage)
            intent.putExtra("user_image", data.userPhoto)
            intent.putExtra("content_title", data.desTitle)
            intent.putExtra("content_desc", data.desDesc)
            intent.putExtra("user_name", data.userName)
            intent.putExtra("category", data.typeCat)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return listData.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.cardview_imgphotos)
        var userphoto: ImageView = itemView.findViewById(R.id.ciclePhoto)
        var name: TextView = itemView.findViewById(R.id.name_user)
        var title: TextView = itemView.findViewById(R.id.judul_cardview)
        var desc: TextView = itemView.findViewById(R.id.desc_text)
    }
}