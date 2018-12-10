package com.leodroidcoder.mvvmdagger.activity

import android.os.Bundle

import android.support.v4.app.Fragment

import com.leodroidcoder.mvvmdagger.R
import com.leodroidcoder.mvvmdagger.fragment1.Fragment1
import com.leodroidcoder.mvvmdagger.fragment2.Fragment2
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(Fragment1.newInstance(), false)
    }

    fun goToFragment2() {
        replaceFragment(Fragment2.newInstance())
    }

    private fun replaceFragment(fragment: Fragment, addToBackStack: Boolean = true) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_container, fragment)
        if (addToBackStack) {
            transaction.addToBackStack(null)
        }
        transaction.commit()
    }
}
