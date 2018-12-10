package com.leodroidcoder.mvvmdagger.fragment1

import android.arch.lifecycle.ViewModel
import android.util.Log
import com.leodroidcoder.mvvmdagger.repository.IRepository

class ViewModel1 (repo: IRepository, something: String, activityData: String
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