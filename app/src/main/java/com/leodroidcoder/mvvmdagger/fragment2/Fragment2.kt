package com.leodroidcoder.mvvmdagger.fragment2

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.leodroidcoder.mvvmdagger.R
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class Fragment2 : DaggerFragment() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: ViewModel2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[ViewModel2::class.java]
        viewModel.sayHello()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    companion object {
        fun newInstance() = Fragment2()
    }
}
