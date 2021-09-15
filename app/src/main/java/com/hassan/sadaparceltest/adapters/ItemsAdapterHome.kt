package com.hassan.sadaparceltest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.hassan.sadaparceltest.HomeItemListener
import com.hassan.sadaparceltest.databinding.ItemProductCarouselBinding
import com.hassan.sadaparceltest.model.cart.Product
import com.hassan.sadaparceltest.utilities.viewholders.ItemsViewHolderHome

class ItemsAdapterHome(private val listener: HomeItemListener):ListAdapter<Product,ItemsViewHolderHome>(ItemDiffUtilsHome()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolderHome {
        val binding = ItemProductCarouselBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemsViewHolderHome(binding)
    }

    override fun onBindViewHolder(holderHome: ItemsViewHolderHome, position: Int) {
        holderHome.bind(getItem(position),listener)
    }
}