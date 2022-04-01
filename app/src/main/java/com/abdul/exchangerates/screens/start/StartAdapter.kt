package com.abdul.exchangerates.screens.start

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abdul.exchangerates.R
import com.abdul.exchangerates.model.nal.NalichkaItem

class StartAdapter:RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = emptyList<NalichkaItem>()

    class StartViewHolder(view:View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout,parent,false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.item_name).text = listStart[position].ccy
        holder.itemView.findViewById<TextView>(R.id.item_buy).text = listStart[position].buy
        holder.itemView.findViewById<TextView>(R.id.item_sale).text = listStart[position].sale

    }

    override fun getItemCount(): Int {
        return listStart.size
    }

    fun setList(list: List<NalichkaItem>){
        listStart = list
        notifyDataSetChanged()
    }

}