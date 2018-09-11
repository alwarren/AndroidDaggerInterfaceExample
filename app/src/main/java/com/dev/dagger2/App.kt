package com.dev.dagger2

import com.dev.dagger2.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by Al Warren on 9/6/2018.
 */

class App: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out App> =
            DaggerAppComponent.builder().create(this)
}