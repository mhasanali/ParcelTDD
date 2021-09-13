package com.hassan.sadaparceltest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.hassan.sadaparceltest.databinding.ItemProductCarouselBinding
import com.hassan.sadaparceltest.model.cart.Product
import com.hassan.sadaparceltest.utilities.viewholders.ItemsViewHolder

class ItemsAdapter:ListAdapter<Product,ItemsViewHolder>(ItemDiffUtils()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        val binding = ItemProductCarouselBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}