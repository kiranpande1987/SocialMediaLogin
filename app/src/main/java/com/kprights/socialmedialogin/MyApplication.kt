package com.kprights.socialmedialogin

import android.app.Application
import com.facebook.FacebookSdk
import com.facebook.appevents.AppEventsLogger


/**
 * Copyright (c) 2020 for KPrights
 *
 * User : Kiran Pande
 * Date : 11/07/20
 * Time : 9:52 AM
 */

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        FacebookSdk.sdkInitialize(applicationContext)
        AppEventsLogger.activateApp(this)
    }
}