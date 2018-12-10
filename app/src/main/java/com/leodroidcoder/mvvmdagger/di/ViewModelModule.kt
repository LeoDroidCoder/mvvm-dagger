package com.leodroidcoder.mvvmdagger.di

import android.arch.lifecycle.ViewModelProvider
import com.leodroidcoder.mvvmdagger.mvvm.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bind(factory: ViewModelFactory): ViewModelProvider.Factory

}
