package com.kopikode.viewdanviewgroup

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBuy = findViewById<Button>(R.id.button_buy)
        btnBuy.setOnClickListener(this)

        val btnDial = findViewById<Button>(R.id.button_call)
        btnDial.setOnClickListener(this)

        val imgPhone = findViewById<ImageView>(R.id.image_phone)
        imgPhone.setOnClickListener(this)

        val txtPrice = findViewById<TextView>(R.id.text_price)
        txtPrice.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button_buy -> {
                val intentBuy = Intent(this@MainActivity, BuyActivity::class.java)
                startActivity(intentBuy)
            }

            R.id.button_call -> {
                val phoneNumber = "0823474849494"
                val dialNumber = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialNumber)
            }

            R.id.image_phone ->{
                val url = "https://shopee.co.id/"
                val web = Intent(Intent.ACTION_VIEW)
                web.setData(Uri.parse(url))
                startActivity(web)
            }

            R.id.text_price -> {
                val url = "https://www.tokopedia.com/"
                val web = Intent(Intent.ACTION_VIEW)
                web.setData(Uri.parse(url))
                startActivity(web)
            }
            }
        }
    }
