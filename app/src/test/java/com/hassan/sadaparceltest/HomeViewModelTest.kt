package com.hassan.sadaparceltest

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.hassan.sadaparceltest.viewmodel.home.HomeViewModel
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class HomeViewModelTest {
     private lateinit var homeViewModel: HomeViewModel
    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

     @Before
     fun resolveDependencies(){
         homeViewModel = HomeViewModel()
     }
    @Test
    fun viewModel_providesData(){
        assertNotNull(homeViewModel.getItems())
    }

}