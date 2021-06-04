package com.example.linkify

import android.content.Context
import android.text.util.Linkify
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(
    private val contexts: Context,
    private val url: Array<String>,
    private val email: Array<String>,
    private val phone: Array<String>,
    private val img: Array<Int>
    ) : ArrayAdapter<String>(contexts, R.layout.link_attribute, url) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(contexts)
        val rowView = inflater.inflate(R.layout.link_attribute, null, true)

        val tvUrl = rowView.findViewById<TextView>(R.id.url)

        val tvEmail = rowView.findViewById<TextView>(R.id.email)

        val tvPhone = rowView.findViewById<TextView>(R.id.phonenumber)

        val image = rowView.findViewById<ImageView>(R.id.icon)
        image.setImageResource(img[position])

        tvUrl.text = url[position]
        tvEmail.text = email[position]
        tvPhone.text = phone[position]

        Linkify.addLinks(tvPhone, Linkify.PHONE_NUMBERS)

        return rowView

    }

}