package com.leodroidcoder.mvvmdagger.fragment1

import android.arch.lifecycle.ViewModel
import com.leodroidcoder.mvvmdagger.mvvm.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class Fragment1Provider {

    @ContributesAndroidInjector(modules = [Fragment1Module::class])
    abstract fun provideFragment(): Fragment1

    @Binds
    @IntoMap
    @ViewModelKey(ViewModel1::class)
    abstract fun bind(viewModel: ViewModel1): ViewModel
}