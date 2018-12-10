package com.leodroidcoder.mvvmdagger.fragment2

import com.leodroidcoder.mvvmdagger.repository.IRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class Fragment2Module {

    @Provides
    fun provideViewModel(repo: IRepository, @Named("something_2") something: String): ViewModel2 {
        return ViewModel2(repo, something)
    }

    @Provides
    @Named("something_2")
    fun provideSomething(fragment: Fragment2): String =
            fragment::class.java.simpleName

}
