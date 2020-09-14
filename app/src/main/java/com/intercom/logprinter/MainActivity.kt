package com.intercom.logprinter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.intercom.logprinter_lib.CustomLogPrinter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CustomLogPrinter().showDialog(this)
    }
}