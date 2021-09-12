package com.hassan.sadaparceltest.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hassan.sadaparceltest.R
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
}