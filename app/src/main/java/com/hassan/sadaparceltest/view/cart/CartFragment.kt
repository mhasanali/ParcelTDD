package com.hassan.sadaparceltest.view.cart

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
import com.hassan.sadaparceltest.databinding.FragmentCartBinding
import com.hassan.sadaparceltest.viewmodel.cart.CartViewModel

class CartFragment : Fragment() {

    private val cartViewModel by viewModels<CartViewModel>()
    private lateinit var binding: FragmentCartBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_cart,container,false)
        binding.cartViewModel = cartViewModel
        binding.lifecycleOwner = this
//        cartViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return binding.root
    }
}