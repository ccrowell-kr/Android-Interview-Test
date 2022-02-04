package com.kroger.start

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.junit.Test

/**
 * This is just a test to ensure that coroutines are on the classpath
 */
class CoroutinesTest {
    @Test
    fun testCoroutinesAvailability() {
        runBlocking {
            async {
                "Coroutines"
            }.join()
        }
    }
}
