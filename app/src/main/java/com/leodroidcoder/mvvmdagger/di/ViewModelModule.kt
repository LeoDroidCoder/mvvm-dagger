package com.leodroidcoder.mvvmdagger.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.leodroidcoder.mvvmdagger.fragment1.ViewModel1
import com.leodroidcoder.mvvmdagger.fragment2.ViewModel2
import com.leodroidcoder.mvvmdagger.mvvm.ViewModelFactory
import com.leodroidcoder.mvvmdagger.mvvm.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Provider

@Module
abstract class ViewModelModule {



    @Binds
    abstract fun bindFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(ViewModel1::class)
    abstract fun bindVm1(viewModel: ViewModel1): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ViewModel2::class)
    abstract fun bindVm2(viewModel: ViewModel2): ViewModel

}
