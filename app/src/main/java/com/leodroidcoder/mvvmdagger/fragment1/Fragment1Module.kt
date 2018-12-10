package com.leodroidcoder.mvvmdagger.fragment1

import android.arch.lifecycle.ViewModel
import com.leodroidcoder.mvvmdagger.repository.IRepository
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class Fragment1Module {

    @Provides
    fun provideViewModel(repo: IRepository, @Named("something_1") something: String, @Named("activity_data") activityData: String): ViewModel {
        return ViewModel1(repo, something, activityData)
    }

    @Provides
    @Named("something_1")
    fun provideSomething(fragment: Fragment1): String = fragment::class.java.simpleName
}
