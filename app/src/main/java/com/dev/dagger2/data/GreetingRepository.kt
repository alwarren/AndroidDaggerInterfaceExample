package com.dev.dagger2.data

import com.dev.dagger2.GOODBYE
import com.dev.dagger2.HELLO
import com.dev.dagger2.domain.Greeting
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Al Warren on 9/6/2018.
 */

class GreetingRepository
    @Inject
    constructor(
            @Named(HELLO) private val hello: Greeting,
            @Named(GOODBYE) private val goodbye: Greeting
    ) {

    fun getHello() = hello.getData()
    fun getGoodbye() = goodbye.getData()
}