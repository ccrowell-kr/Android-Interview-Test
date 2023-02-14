package com.kroger.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

/**
 * This is just a test that these classes are available on the classpath
 */
@ExtendWith(InstantExecutorExtension::class)
class LiveDataTest {

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
