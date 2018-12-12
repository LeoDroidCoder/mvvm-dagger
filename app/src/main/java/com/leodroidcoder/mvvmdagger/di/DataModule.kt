package com.leodroidcoder.mvvmdagger.di

import android.arch.lifecycle.ViewModel
import com.leodroidcoder.mvvmdagger.repository.IRepository
import com.leodroidcoder.mvvmdagger.repository.SomeRepository
import dagger.Module
import dagger.Provides
import javax.inject.Provider
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    @Singleton
    fun provideRepo(): IRepository = SomeRepository()

    @Provides
    @Singleton
    fun provideMap() = HashMap<Class<out ViewModel>, Provider<ViewModel>>()
}