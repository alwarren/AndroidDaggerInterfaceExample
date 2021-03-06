package com.dev.dagger2.data

import com.dev.dagger2.GREETING_HELLO
import com.dev.dagger2.domain.Greeting

/**
 * Created by Al Warren on 9/6/2018.
 */

class Hello(private val text: String = GREETING_HELLO): Greeting {
    override fun getData() = text
}
