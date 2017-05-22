package com.example.huanbei_dev4.timikotlinlearn

import android.content.Context
import android.widget.Toast

/**
 * kotlint toast
 * @autor timi
 * create at 2017/5/22 11:51
 */
fun Context.toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, length).show()
}
