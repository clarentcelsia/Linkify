package com.example.linkify

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    val urls = arrayOf(
        "https://www.facebook.com/",
        "https://www.youtube.com/",
        "https://www.twitter.com/",
        "https://www.gmail.com/",
        "https://www.google.com/"
    )

    val emails = arrayOf(
        "indo@gmail.com",
        "clarentic@gmail.com",
        "email_3@mail.com",
        "email_4@gmail.com",
        "email_5@mail.com"
    )

    val phoneNumber = arrayOf(
        "+(1234)-567",
        "+(1234)-567",
        "7563654321",
        "9475000000",
        "8575000000"
    )

    val imgid = arrayOf<Int>(
        R.drawable.ic_android_black_24dp,
        R.drawable.ic_android_black_24dp,
        R.drawable.ic_android_black_24dp,
        R.drawable.ic_android_black_24dp,
        R.drawable.ic_android_black_24dp
    )

    private lateinit var listAdapter: ListAdapter
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.list)

        listAdapter = ListAdapter(this, urls, emails, phoneNumber, imgid)
        listView.adapter = listAdapter

    }
}