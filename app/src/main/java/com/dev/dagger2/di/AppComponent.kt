package com.dev.dagger2.di

/**
 * Created by Al Warren on 9/6/2018.
 */

import com.dev.dagger2.App
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [(AndroidSupportInjectionModule::class),
    (AppModule::class),
    (ActivityBuilder::class)]
)
internal interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}