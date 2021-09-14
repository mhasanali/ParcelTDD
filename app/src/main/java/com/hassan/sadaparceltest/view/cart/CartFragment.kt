package com.hassan.sadaparceltest.view.cart

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
import com.hassan.sadaparceltest.adapters.ItemsAdapterCart
import com.hassan.sadaparceltest.adapters.ItemsAdapterHome
import com.hassan.sadaparceltest.databinding.FragmentCartBinding
import com.hassan.sadaparceltest.viewmodel.cart.CartViewModel

class CartFragment : Fragment() {

    private val cartViewModel by viewModels<CartViewModel>()
    private lateinit var binding: FragmentCartBinding

    //region Lifecycle Methods
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_cart,container,false)
        binding.cartViewModel = cartViewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecycler()
    }
    //endregion

    fun setupRecycler(){
        val adapter = ItemsAdapterCart()
        binding.recyclerCartProducts.adapter = adapter
        binding.recyclerCartProducts.layoutManager = GridLayoutManager(requireContext(),1,
            RecyclerView.VERTICAL,false)
        adapter.submitList(cartViewModel.getItems())
    }
}