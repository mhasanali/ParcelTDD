package com.hassan.sadaparceltest.model.cart

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Product(val quantity: Int, val item: Item)
data class Item(@PrimaryKey(autoGenerate = true)val id: String, val name: String, val description: String, val price: Double)
