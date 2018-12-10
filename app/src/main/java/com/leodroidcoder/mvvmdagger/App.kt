package com.leodroidcoder.mvvmdagger

import com.leodroidcoder.mvvmdagger.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
            DaggerAppComponent
                    .builder()
                    .app(this)
                    .context(this)
                    .build()


}