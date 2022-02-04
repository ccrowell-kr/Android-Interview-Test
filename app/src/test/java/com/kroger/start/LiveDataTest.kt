package com.kroger.start

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.junit.Rule
import org.junit.Test

/**
 * This is just a test that these classes are available on the classpath
 */
class LiveDataTest {
    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun testLiveDataAvailability() {
        val vm = object : ViewModel() {
            val data = MutableLiveData("LiveData")
        }
        vm.data.observeForever {
            it.length
        }
    }
}
