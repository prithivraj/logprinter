package com.intercom.logprinter_lib

import android.content.Context
import android.util.Log
import androidx.appcompat.app.AlertDialog

class CustomLogPrinter {
    fun printLog() {
        Log.d("logprinter", "Printing from library")
    }

    fun showDialog(context: Context) {
        AlertDialog.Builder(context).setView(R.layout.custom_fragment_layout).show()
    }
}