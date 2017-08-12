package com.example.winkey.kotlindemo.Activity

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.winkey.kotlindemo.R
import com.example.winkey.kotlindemo.Utils.Logger
import java.util.*
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.imageResource

class SplashActivity : AppCompatActivity() {

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, SplashActivity::class.java)
            context.startActivity(intent)
        }
    }

    private val list = Arrays.asList("A", "3", "5", "6", "c", 3, 4, 5)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        iv_splash.imageResource = R.mipmap.ic_launcher
        Logger.debug(sum(3, 5).toString())
        show(1, 4)
        chooseLetter()
    }

    private fun sum(x: Int, y: Int) = x + y

    private fun show(x: Int, y: Int) {
        Logger.debug("x等于${x}；y等于${y}")
    }

    private fun chooseLetter() {
        list.filter { it is String }
                .forEach { Logger.debug(it.toString()) }
    }


}
