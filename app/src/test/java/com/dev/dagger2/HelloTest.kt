package com.dev.dagger2

import com.dev.dagger2.data.Hello
import com.dev.dagger2.domain.Greeting
import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Al Warren on 9/8/2018.
 */

class HelloTest {
    lateinit var hello: Greeting

    @Test
    fun givenEmptyConstructor_whenGetData_thenShouldBeEqual() {
        hello = Hello()

        val test = hello.getData()

        assertEquals(GREETING_HELLO, test)
    }

    @Test
    fun givenConstructorArgument_whenGetData_thenShouldBeEqual() {
        hello = Hello(TEST_VALUE)

        val test = hello.getData()

        assertEquals(TEST_VALUE, test)
    }

    @Test
    fun givenEmptyConstructor_whenGetData_thenShouldNotBeEqual() {
        hello = Hello()

        val test = hello.getData()

        assertNotEquals(TEST_VALUE, test)
    }

    @Test
    fun givenConstructorArgument_whenGetData_thenShouldNotBeEqual() {
        hello = Hello(GREETING_HELLO)

        val test = hello.getData()

        assertNotEquals(TEST_VALUE, test)
    }

}