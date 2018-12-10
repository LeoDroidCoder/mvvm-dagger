package com.leodroidcoder.mvvmdagger.di

import com.leodroidcoder.mvvmdagger.activity.MainActivity
import com.leodroidcoder.mvvmdagger.activity.SomeActivityModule
import com.leodroidcoder.mvvmdagger.fragment1.Fragment1Provider
import com.leodroidcoder.mvvmdagger.fragment2.Fragment2Provider
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [
        SomeActivityModule::class,
        Fragment1Provider::class,
        Fragment2Provider::class
    ])
    abstract fun privideActivity(): MainActivity
}