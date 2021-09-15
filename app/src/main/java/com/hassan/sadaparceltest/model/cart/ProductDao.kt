package com.hassan.sadaparceltest.model.cart

import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface ProductDao {
    @Query("Select * from product")
    fun getProducts(): List<Product>

    @Insert
    fun addProduct(product: Product)

    @Update
    fun updateProduct(product: Product)
    //Just remembered that persistence was out of scope for this test, sorry
    //TODO complete if required later
}