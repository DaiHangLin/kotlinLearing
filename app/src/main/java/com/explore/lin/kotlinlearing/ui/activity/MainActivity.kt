package com.explore.lin.kotlinlearing.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.explore.lin.kotlinlearing.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kotlin_textview.text = "hello kotlin aha"
    }
}
