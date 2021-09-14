package com.hassan.sadaparceltest.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hassan.sadaparceltest.R
import com.hassan.sadaparceltest.adapters.ItemsAdapterHome
import com.hassan.sadaparceltest.databinding.FragmentHomeBinding
import com.hassan.sadaparceltest.viewmodel.home.HomeViewModel

class HomeFragment : Fragment() {

    private val homeViewModel by viewModels<HomeViewModel>()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

         binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)
        binding.homeViewModel = homeViewModel
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecycler()
    }

    fun setupRecycler(){
        val adapter = ItemsAdapterHome()
        binding.recyclerHomeProducts.adapter = adapter
        binding.recyclerHomeProducts.layoutManager = GridLayoutManager(requireContext(),2,RecyclerView.VERTICAL,false)
        adapter.submitList(homeViewModel.getItems())
    }
}