package com.leodroidcoder.mvvmdagger.mvvm

import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bind(factory: ViewModelFactory): ViewModelProvider.Factory

}