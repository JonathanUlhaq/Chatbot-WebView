package com.example.testweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    private lateinit var webViiew:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        webChat()
    }

    fun init() {
        webViiew = findViewById<WebView>(R.id.webView)
    }

    fun webChat() {
        webViiew.loadUrl("https://cloud-object-storage-cos-standard-10m.s3.jp-tok.cloud-object-storage.appdomain.cloud/bot-assistant-mobile.html")
        webViiew.settings.javaScriptEnabled = true
    }
}