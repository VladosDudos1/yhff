package com.example.ktitsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_pricaz.*

class PricazActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pricaz)

        money_txt.setOnClickListener(this::openMoney)
        stray_txt.setOnClickListener(this::openStray)
    }

    fun openMoney(view: View){
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse("https://mck-ktits.ru/tmp/prokaz2019.pdf")
        startActivity(openURL)
    }

    fun openStray(view: View){
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse("https://www.mck-ktits.ru/media/97694555.pdf")
        startActivity(openURL)
    }
}
