package com.techlad.memoryleakssample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.start_memory_leaks_btn).setOnClickListener {
            startActivity(Intent(this, MemoryLeakActivity::class.java))
        }
    }
}