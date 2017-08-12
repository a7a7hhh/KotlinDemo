package com.example.winkey.kotlindemo.Utils

import android.util.Log

/**
 * Created by Winkey on 2017/8/11.
 */
object Logger {
    val IS_DEBUG = true

    fun debug(msg: String) {
        if (IS_DEBUG)
            Log.i("debug", msg)
    }
}