package com.leodroidcoder.mvvmdagger.activity

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class SomeActivityModule {

    @Provides
    @Named("activity_data")
    fun provideActivityData(activity: MainActivity): String =
            activity::class.java.simpleName
}