package com.example.wrclcvt1kt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WineAdapter(val WineList: ArrayList<Wines>) : RecyclerView.Adapter<WineAdapter.CustomViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WineAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(view)
    }



    override fun getItemCount(): Int {
        return WineList.size
    }

    override fun onBindViewHolder(holder: WineAdapter.CustomViewHolder, position: Int) {
        holder.ivwine.setImageResource(WineList.get(position).ivwine)
        holder.productNameKR.text = WineList.get(position).productNameKR
        holder.productNameENG.text = WineList.get(position).productNameENG
        holder.price.text = WineList.get(position).price

    }
    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val ivwine = itemView.findViewById<ImageView>(R.id.iv_wine_Sample) // 와인 이미지
        val productNameKR = itemView.findViewById<TextView>(R.id.tv_wi_sampleKR) // 이름 한글
        val productNameENG = itemView.findViewById<TextView>(R.id.tv_wi_sampleE) // 이름 영문
        val price = itemView.findViewById<TextView>(R.id.tv_pr_sample) // 가격

    }

}

