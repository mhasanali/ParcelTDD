package com.hassan.sadaparceltest.viewmodel.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hassan.sadaparceltest.model.cart.Item
import com.hassan.sadaparceltest.model.cart.Product

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "SadaParcel"
    }
    val text: LiveData<String> = _text

    fun getItems(): List<Product>{
        val itemList = mutableListOf<Product>()

            return itemList

    }
}