package com.hassan.sadaparceltest.viewmodel.cart

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hassan.sadaparceltest.model.cart.Product

class CartViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Cart"
    }
    val text: LiveData<String> = _text

    fun getItems():List<Product>?{
        return null
    }
}