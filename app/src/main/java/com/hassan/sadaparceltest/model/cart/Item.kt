package com.hassan.sadaparceltest.model.cart

data class Product(val quantity: Int, val item: Item)
data class Item(val id: String, val name: String, val description: String, val price: Double)
