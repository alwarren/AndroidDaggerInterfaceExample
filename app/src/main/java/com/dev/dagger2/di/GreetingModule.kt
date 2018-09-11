package com.dev.dagger2.di

import com.dev.dagger2.DAGGER_GOODBYE
import com.dev.dagger2.DAGGER_HELLO
import com.dev.dagger2.GOODBYE
import com.dev.dagger2.HELLO
import com.dev.dagger2.data.Goodbye
import com.dev.dagger2.data.GreetingRepository
import com.dev.dagger2.data.Hello
import com.dev.dagger2.domain.Greeting
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by Al Warren on 9/6/2018.
 */

@Module
class GreetingModule {
    @Provides
    @Named(HELLO)
    fun provideHello(): Greeting = Hello(DAGGER_HELLO)

    @Provides
    @Named(GOODBYE)
    fun provideGoodbye(): Greeting = Goodbye(DAGGER_GOODBYE)

    @Provides
    fun provideGreetingRepository(
            @Named(HELLO) hello: Greeting,
            @Named(GOODBYE) goodbye: Greeting) = GreetingRepository(hello, goodbye)
}