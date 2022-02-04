package com.kroger.start

import io.reactivex.rxjava3.core.Observable
import org.junit.Test

/**
 * This is just a test that these classes are available on the classpath
 */
class RxTest {
    @Test
    fun testRxAvailability() {
        Observable.just("one", "two", "three")
            .subscribe {
                it.length
            }
    }
}
