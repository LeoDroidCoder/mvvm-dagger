package com.leodroidcoder.mvvmdagger.repository

import android.util.Log

class SomeRepository : IRepository {

    override fun doSomething() {
        Log.d("SomeRepository", "doSomething: ")
    }
}