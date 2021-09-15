package com.hassan.sadaparceltest.view.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.navGraphViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hassan.sadaparceltest.HomeItemListener
import com.hassan.sadaparceltest.R
import com.hassan.sadaparceltest.adapters.ItemsAdapterHome
import com.hassan.sadaparceltest.databinding.FragmentHomeBinding
import com.hassan.sadaparceltest.model.cart.Product
import com.hassan.sadaparceltest.viewmodel.cart.CartSharedViewModel
import com.hassan.sadaparceltest.viewmodel.home.HomeViewModel

class HomeFragment : Fragment(),HomeItemListener {

    //region Global Variables
    private val homeViewModel by viewModels<HomeViewModel>()
    private val cartViewModel by navGraphViewModels<CartSharedViewModel>(R.id.mobile_navigation)
    private lateinit var binding: FragmentHomeBinding
    //endregion

    //region Lifecycle Methods
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

         binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)
        binding.homeViewModel = homeViewModel
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecycler()
    }
    //endregion

    //region Class Level Methods
    private fun setupRecycler(){
        val adapter = ItemsAdapterHome(this)
        binding.recyclerHomeProducts.adapter = adapter
        binding.recyclerHomeProducts.layoutManager = GridLayoutManager(requireContext(),2,RecyclerView.VERTICAL,false)
        adapter.submitList(homeViewModel.getItems())
    }
    //endregion

    //region External Methods
    override fun itemOnClick(item: Product) {
        cartViewModel.addItemToCart(item)
    }
    //endregion
}