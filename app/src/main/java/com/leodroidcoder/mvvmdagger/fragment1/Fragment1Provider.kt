package com.leodroidcoder.mvvmdagger.fragment1

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class Fragment1Provider {

    @ContributesAndroidInjector(modules = [Fragment1Module::class])
    abstract fun provideFragment(): Fragment1

}