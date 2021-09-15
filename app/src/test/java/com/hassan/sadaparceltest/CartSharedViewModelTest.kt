package com.hassan.sadaparceltest

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.hassan.sadaparceltest.model.cart.Item
import com.hassan.sadaparceltest.model.cart.Product
import com.hassan.sadaparceltest.viewmodel.cart.CartSharedViewModel
import org.junit.Assert
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
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
        val expectedListLength = cartSharedViewModel.productsInCart.size + 1
        val mockItem = Product(3, Item("1","White square","12 pcs",12.00))
        cartSharedViewModel.addItemToCart(mockItem)
        val actualListLength = cartSharedViewModel.productsInCart.size
        assert(expectedListLength == actualListLength)
    }

    @Test
    fun viewModel_isPreventing_sameItemsToBeAdded(){
        val expectedListLength = cartSharedViewModel.productsInCart.size + 1
        val mockItemA = Product(3, Item("1","White square","12 pcs",12.00))
        val mockItemB = Product(3, Item("1","White square","12 pcs",12.00))
        cartSharedViewModel.addItemToCart(mockItemA)
        cartSharedViewModel.addItemToCart(mockItemB)
        val actualListLength = cartSharedViewModel.productsInCart.size
        assert(expectedListLength == actualListLength)


    }
}