package com.abdul.exchangerates.screens.second

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abdul.exchangerates.R
import com.abdul.exchangerates.model.beznal.BeznalItem

class SecondAdapter:RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    var listSecond = emptyList<BeznalItem>()

    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout,parent,false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.item_name).text = listSecond[position].ccy
        holder.itemView.findViewById<TextView>(R.id.item_buy).text = listSecond[position].buy
        holder.itemView.findViewById<TextView>(R.id.item_sale).text = listSecond[position].sale
    }

    override fun getItemCount(): Int {
        return listSecond.size
    }

    fun setList(list: List<BeznalItem>){
        listSecond = list
        notifyDataSetChanged()
    }

}