package com.dev.dagger2

import com.dev.dagger2.data.Goodbye
import com.dev.dagger2.data.GreetingRepository
import com.dev.dagger2.data.Hello
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Created by Al Warren on 9/8/2018.
 */

class GreetingRepositoryTest {
    private lateinit var repository: GreetingRepository

    @Before
    fun setup() {
        repository = GreetingRepository(Hello(), Goodbye())
    }

    @Test
    fun givenDefaults_whenGetHello_thenShouldBeEqual() {
        val test = repository.getHello()

        assertEquals(GREETING_HELLO, test)
    }

    @Test
    fun givenDefaults_whenGetGoodbye_thenShouldBeEqual() {
        val test = repository.getGoodbye()

        assertEquals(GREETING_GOODBYE, test)
    }

    @Test
    fun givenDefaults_whenGetHello_thenShouldNotBeEqual() {
        val test = repository.getHello()

        assertNotEquals(test, TEST_VALUE)
    }

    @Test
    fun givenDefaults_whenGetGoodbye_thenShouldNotBeEqual() {
        val test = repository.getGoodbye()

        assertNotEquals(test, TEST_VALUE)
    }
}