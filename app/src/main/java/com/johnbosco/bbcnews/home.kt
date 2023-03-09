package com.johnbosco.bbcnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class home : AppCompatActivity() {
    private val webView: WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //Giving a tittle
        title = "BBC"
        val webView = findViewById<WebView>(R.id.kom)
        webView.webViewClient = WebViewClient()
        //webViewclient is the object responsible for most the actions inside
        val webSettings = webView.settings
        webSettings.javaScriptEnabled
        webView.loadUrl("https://www.bbc.com/news")
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()) {
            webView.goBack()
            //conGoBack()
            //this method specifies the WebView has a back history item.
        } else {
            super.onBackPressed()
        }
    }
    }