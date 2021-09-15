package com.hassan.sadaparceltest

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.hassan.sadaparceltest.viewmodel.cart.CartSharedViewModel
import org.junit.Assert
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class CartSharedViewModelTest {
    private lateinit var cartSharedViewModel: CartSharedViewModel

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Before
    fun resolveDependencies(){
        cartSharedViewModel = CartSharedViewModel()
    }

    @Test
    fun viewModel_providesData(){
        assertNotNull(cartSharedViewModel.getItems())
    }

    @Test
    fun viewModel_providesDataList_greaterThanZero(){
        Assert.assertTrue(cartSharedViewModel.getItems().isNotEmpty())
    }

    @Test
    fun viewModel_isAddingProductToCart(){

    }
}