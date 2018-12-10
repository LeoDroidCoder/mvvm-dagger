package com.leodroidcoder.mvvmdagger.di

import com.leodroidcoder.mvvmdagger.repository.IRepository
import com.leodroidcoder.mvvmdagger.repository.SomeRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    @Singleton
    fun provideRepo(): IRepository = SomeRepository()
}