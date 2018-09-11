package com.dev.dagger2

import com.dev.dagger2.data.Goodbye
import com.dev.dagger2.domain.Greeting
import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Al Warren on 9/8/2018.
 */

class GoodbyeTest {
    lateinit var goodbye: Greeting

    @Test
    fun givenEmptyConstructor_whenGetData_thenShouldBeEqual() {
        goodbye = Goodbye()

        val test = goodbye.getData()

        assertEquals(GREETING_GOODBYE, test)
    }

    @Test
    fun givenConstructorArgument_whenGetData_thenShouldBeEqual() {
        goodbye = Goodbye(TEST_VALUE)

        val test = goodbye.getData()

        assertEquals(TEST_VALUE, test)
    }

    @Test
    fun givenEmptyConstructor_whenGetData_thenShouldNotBeEqual() {
        goodbye = Goodbye()

        val test = goodbye.getData()

        assertNotEquals(TEST_VALUE, test)
    }

    @Test
    fun givenConstructorArgument_whenGetData_thenShouldNotBeEqual() {
        goodbye = Goodbye(GREETING_GOODBYE)

        val test = goodbye.getData()

        assertNotEquals(TEST_VALUE, test)
    }

}