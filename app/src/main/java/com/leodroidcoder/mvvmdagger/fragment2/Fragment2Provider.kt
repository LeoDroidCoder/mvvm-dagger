package com.leodroidcoder.mvvmdagger.fragment2

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class Fragment2Provider {

    @ContributesAndroidInjector(modules = [Fragment2Module::class])
    abstract fun provideFragment(): Fragment2

}