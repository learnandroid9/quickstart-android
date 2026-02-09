package com.google.firebase.quickstart.ai

import android.app.Application
import android.graphics.Bitmap
import android.graphics.BitmapFactory

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
        catImage = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.cat)
    }

    companion object {
        lateinit var instance: MainApplication
            private set

        lateinit var catImage: Bitmap
    }
}
