package com.hassan.sadaparceltest

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.hassan.sadaparceltest.viewmodel.cart.CartViewModel
import com.hassan.sadaparceltest.viewmodel.home.HomeViewModel
import org.junit.Assert
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class CartViewModelTest {
    private lateinit var cartViewModel: CartViewModel

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Before
    fun resolveDependencies(){
        cartViewModel = CartViewModel()
    }

    @Test
    fun viewModel_providesData(){
        assertNotNull(cartViewModel.getItems())
    }

//    @Test
//    fun viewModel_providesDataList_greaterThanZero(){
//        Assert.assertTrue(cartViewModel.getItems().isNotEmpty())
//    }
}