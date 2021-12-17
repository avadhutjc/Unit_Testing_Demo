package com.ajc.unit_testing

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(5, 3 + 2)
    }

    @Test
    fun subtraction_isCorrect() {
        val calculator = Calculator()
        assertEquals(3, calculator.sub(5,2))
    }

    @Test
    fun divisionCheck() {
        val  calculator = Calculator()
        assertEquals(4, calculator.division(8, 2))
    }

}