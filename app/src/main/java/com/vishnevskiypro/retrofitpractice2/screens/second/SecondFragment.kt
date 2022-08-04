package com.vishnevskiypro.retrofitpractice2.screens.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice2.R
import com.vishnevskiypro.retrofitpractice2.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: SecondAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        val viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)
        binding = FragmentSecondBinding.inflate(layoutInflater, container, false)
        recyclerView = binding.rvSecond
        adapter = SecondAdapter()
        recyclerView.adapter = adapter
        viewModel.getBeznalMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner, { list ->
            list.body()?.let { adapter.setList(it) }
        })




        return binding.root
    }

}