package com.vishnevskiypro.retrofitpractice2.screens.start

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice2.R
import com.vishnevskiypro.retrofitpractice2.databinding.ItemMoneyLayoutBinding
import com.vishnevskiypro.retrofitpractice2.model.nal.NalichkaItem

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    var listStart = emptyList<NalichkaItem>()


    class StartViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val binding = ItemMoneyLayoutBinding.bind(view)

        fun bind(nalichkaItem: NalichkaItem){
            binding.apply {
                itemName.text = nalichkaItem.ccy
                itemBuy.text = nalichkaItem.buy
                itemSale.text = nalichkaItem.sale
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)
    }


    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.bind(listStart[position])
    }


    override fun getItemCount(): Int {
        return listStart.size
    }

    fun setList(list: List<NalichkaItem>){
        listStart = list
        notifyDataSetChanged()
    }
}