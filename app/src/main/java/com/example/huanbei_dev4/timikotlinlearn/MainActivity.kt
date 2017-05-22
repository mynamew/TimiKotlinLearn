package com.example.huanbei_dev4.timikotlinlearn

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = "我是 kotlin"
        bt.text = "点击按钮"
        bt.setOnClickListener {
            toast("点击了按钮")
        }
    }
}
