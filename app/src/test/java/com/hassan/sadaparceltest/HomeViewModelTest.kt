package com.hassan.sadaparceltest

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.hassan.sadaparceltest.viewmodel.home.HomeViewModel
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.Assert.*
import org.hamcrest.CoreMatchers.*


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

    @Test
    fun viewModel_providesDataList_greaterThanZero(){
       assertTrue(homeViewModel.getItems().isNotEmpty())
    }

    @Test
    fun viewModel_providesAtleastTwentyItems(){
        assertTrue(homeViewModel.getItems().size >= 20)
    }
}