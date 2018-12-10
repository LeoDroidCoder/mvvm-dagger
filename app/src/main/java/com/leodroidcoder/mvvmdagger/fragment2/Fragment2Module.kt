package com.leodroidcoder.mvvmdagger.fragment2

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class Fragment2Module {

    @Provides
    @Named("something_2")
    fun provideSomething(fragment: Fragment2): String =
            fragment::class.java.simpleName

}
