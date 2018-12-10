package com.leodroidcoder.mvvmdagger.fragment1

import android.arch.lifecycle.ViewModel
import android.util.Log
import com.leodroidcoder.mvvmdagger.repository.IRepository
import javax.inject.Inject
import javax.inject.Named

class ViewModel1 @Inject constructor(repo: IRepository,
                                     @Named("something_1") something: String,
                                     @Named("activity_data") activityData: String
) : ViewModel() {

    init {
        repo.doSomething()
        Log.d("ViewModel1", "something=: $something")
        Log.d("ViewModel1", "activity_data=: $activityData")
    }

    fun sayHello() {
        Log.d("ViewModel1", "sayHello: ")
    }

}