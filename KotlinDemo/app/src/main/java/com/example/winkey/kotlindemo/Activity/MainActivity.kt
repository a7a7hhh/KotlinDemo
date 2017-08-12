package com.example.winkey.kotlindemo.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.winkey.kotlindemo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_splash.setOnClickListener {
            SplashActivity.start(this)
        }
        tv_recylcleview.setOnClickListener {  }
    }
}
