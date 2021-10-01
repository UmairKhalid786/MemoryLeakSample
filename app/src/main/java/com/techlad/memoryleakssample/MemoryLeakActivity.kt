package com.techlad.memoryleakssample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MemoryLeakActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memory_leak)

        findViewById<View>(R.id.finish_btn).setOnClickListener { finish() }

        SingaltoneWithoutLeak.getInstance(this)
    }
}