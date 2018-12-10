package com.leodroidcoder.mvvmdagger.fragment2

import android.arch.lifecycle.ViewModel
import android.util.Log
import com.leodroidcoder.mvvmdagger.repository.IRepository
import javax.inject.Inject
import javax.inject.Named

class ViewModel2 @Inject constructor(repo: IRepository,
                                     @Named("something_2") something: String
) : ViewModel() {

    init {
        repo.doSomething()
        Log.d("ViewModel2", "something=: $something")
    }

    fun sayHello() {
        Log.d("ViewModel1", "sayHello: ")
    }
}