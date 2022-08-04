package com.vishnevskiypro.retrofitpractice2.screens.second

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice2.R
import com.vishnevskiypro.retrofitpractice2.databinding.ItemMoneyLayoutBinding
import com.vishnevskiypro.retrofitpractice2.model.beznal.BeznalichkaItem

class SecondAdapter : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>(){

    var listSecond = emptyList<BeznalichkaItem>()

    class SecondViewHolder (view: View) : RecyclerView.ViewHolder(view){

        private val binding = ItemMoneyLayoutBinding.bind(view)

        fun bind(beznalichkaItem: BeznalichkaItem){
            binding.apply {
                itemName.text = beznalichkaItem.ccy
                itemBuy.text = beznalichkaItem.buy
                itemSale.text = beznalichkaItem.sale
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return SecondViewHolder(view)
    }


    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.bind(listSecond[position])
    }


    override fun getItemCount(): Int {
        return listSecond.size
    }

    fun setList(list: List<BeznalichkaItem>){
        listSecond = list
        notifyDataSetChanged()
    }


}