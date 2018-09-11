package com.dev.dagger2.di

import com.dev.dagger2.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Al Warren on 9/6/2018.
 */

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [(GreetingModule::class)])
    internal abstract fun bindMainActivity(): MainActivity
}