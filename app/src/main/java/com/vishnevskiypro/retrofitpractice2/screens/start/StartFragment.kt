package com.vishnevskiypro.retrofitpractice2.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice2.R
import com.vishnevskiypro.retrofitpractice2.databinding.FragmentStartBinding


class StartFragment : Fragment() {
    private lateinit var binding: FragmentStartBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: StartAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        val viewModel = ViewModelProvider(this).get(StartViewModel::class.java)
        binding = FragmentStartBinding.inflate(layoutInflater, container, false)
        recyclerView = binding.rvStart
        adapter = StartAdapter()
        recyclerView.adapter = adapter
        viewModel.getNalMoney()
        viewModel.myMoneyList.observe(viewLifecycleOwner, { list ->
            list.body()?.let { adapter.setList(it) }
        })

        return binding.root
    }

}