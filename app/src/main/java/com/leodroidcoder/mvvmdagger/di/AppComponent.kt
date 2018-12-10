package com.leodroidcoder.mvvmdagger.di

import android.app.Application
import android.content.Context
import com.leodroidcoder.mvvmdagger.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(modules = [
    AndroidSupportInjectionModule::class,
    DataModule::class,
    ViewModelModule::class,
    ActivityBuilder::class
])
@Singleton
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun app(app: Application): Builder

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }

}