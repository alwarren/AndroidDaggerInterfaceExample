package com.dev.dagger2.data

import com.dev.dagger2.GREETING_GOODBYE
import com.dev.dagger2.domain.Greeting

/**
 * Created by Al Warren on 9/6/2018.
 */

class Goodbye(private val text: String = GREETING_GOODBYE): Greeting {
    override fun getData() = text
}
