package com.leodroidcoder.mvvmdagger.fragment2

import android.arch.lifecycle.ViewModel
import com.leodroidcoder.mvvmdagger.mvvm.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class Fragment2Provider {

    @ContributesAndroidInjector(modules = [Fragment2Module::class])
    abstract fun provideFragment(): Fragment2

    @Binds
    @IntoMap
    @ViewModelKey(ViewModel2::class)
    abstract fun bind(viewModel: ViewModel2): ViewModel
}