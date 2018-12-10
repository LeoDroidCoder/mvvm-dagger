package com.leodroidcoder.mvvmdagger.fragment2

import android.arch.lifecycle.ViewModel
import android.util.Log
import com.leodroidcoder.mvvmdagger.repository.IRepository

class ViewModel2 (repo: IRepository, something: String) : ViewModel() {

    init {
        repo.doSomething()
        Log.d("ViewModel2", "something=$something")
    }

    fun sayHello() {
        Log.d("ViewModel1", "sayHello: ")
    }
}