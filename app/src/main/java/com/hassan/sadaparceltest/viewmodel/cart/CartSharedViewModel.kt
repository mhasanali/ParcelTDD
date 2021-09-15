package com.hassan.sadaparceltest.viewmodel.cart

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hassan.sadaparceltest.model.cart.Item
import com.hassan.sadaparceltest.model.cart.Product

class CartSharedViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Cart"
    }

    val productsInCart = mutableListOf<Product>()
    val text: LiveData<String> = _text

    fun addItemToCart(item: Product){
    productsInCart.add(item)
    }

    fun getItems(): List<Product> {
        val itemList = mutableListOf<Product>()
        val product = Product(3, Item("1","White square","12 pcs",12.00))
        for (i in 0..5){
            itemList.add(product)
        }
        return itemList
    }


}