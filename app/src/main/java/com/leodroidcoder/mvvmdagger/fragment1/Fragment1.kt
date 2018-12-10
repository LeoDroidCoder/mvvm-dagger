package com.leodroidcoder.mvvmdagger.fragment1

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.leodroidcoder.mvvmdagger.R
import com.leodroidcoder.mvvmdagger.activity.MainActivity
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_1.*
import javax.inject.Inject
import android.arch.lifecycle.ViewModelProvider


class Fragment1 : DaggerFragment() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: ViewModel1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[ViewModel1::class.java]
        viewModel.sayHello()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            (activity as MainActivity).goToFragment2()
        }
    }

    companion object {
        fun newInstance() = Fragment1()
    }
}
