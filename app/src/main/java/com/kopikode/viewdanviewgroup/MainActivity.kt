package com.kopikode.viewdanviewgroup

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBuy = findViewById<Button>(R.id.button_buy)
        btnBuy.setOnClickListener(this)

        val btnDial = findViewById<Button>(R.id.button_call)
        btnDial.setOnClickListener(this)
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
        }
    }
}