package com.hassan.sadaparceltest.view.orders

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.hassan.sadaparceltest.R
import com.hassan.sadaparceltest.databinding.FragmentOrdersBinding
import com.hassan.sadaparceltest.viewmodel.orders.OrdersViewModel

class OrdersFragment : Fragment() {

    private val ordersViewModel by viewModels<OrdersViewModel>()
    private lateinit var binding: FragmentOrdersBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_orders, container, false)
        binding.ordersViewModel = ordersViewModel
        binding.lifecycleOwner = this
        return binding.root
    }
}