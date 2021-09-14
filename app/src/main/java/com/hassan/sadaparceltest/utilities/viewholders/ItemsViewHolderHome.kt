package com.hassan.sadaparceltest.utilities.viewholders

import androidx.recyclerview.widget.RecyclerView
import com.hassan.sadaparceltest.databinding.ItemProductCarouselBinding
import com.hassan.sadaparceltest.model.cart.Product

class ItemsViewHolderHome(private val binding: ItemProductCarouselBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Product){
        binding.textItemName.text = item.item.name
        binding.textItemPrice.text = "$ " + item.item.price.toString()
        binding.textItemDescription.text = item.item.description

    }
}