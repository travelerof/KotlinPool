package com.example.kotlinpool

import android.content.Intent
import android.net.http.SslError
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = findViewById<RecyclerView>(R.id.main_rv)
        val adapter = MainAdapter(this)
        rv.adapter = adapter
        adapter.setOnRecyclerViewItemClickListener(object : MainAdapter.OnRecyclerViewItemClickListener{
            override fun onItemClick(clazz: Class<*>) {
                startActivity(Intent(this@MainActivity,clazz))
            }

        })
    }
}