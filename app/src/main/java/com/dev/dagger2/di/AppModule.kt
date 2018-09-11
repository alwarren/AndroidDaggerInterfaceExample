package com.dev.dagger2.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Al Warren on 9/6/2018.
 */

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application
    }
}