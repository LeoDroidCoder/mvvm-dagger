package com.leodroidcoder.mvvmdagger.fragment1

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class Fragment1Module {

    @Provides
    @Named("something_1")
    fun provideSomething(fragment: Fragment1): String = fragment::class.java.simpleName

}
