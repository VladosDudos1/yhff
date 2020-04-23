package com.example.ktitsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_item.setOnClickListener(this::showItem)
        btn_reference.setOnClickListener(this::showReference)
        btn_ring.setOnClickListener(this::showRing)
        btn_exit.setOnClickListener(this::finish)
    }
    fun showRing(view:View){
        startActivity(Intent(this,ActivityRing::class.java))
    }
    fun showItem(view:View){
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse("http://www.mck-ktits.ru/raspisanie-zanyatiy")
        startActivity(openURL)
    }
    fun showReference(view:View){
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfq2BSxb01m5qUEN_yu86wn2NhVYk7TBfiuHnDNrubDeEumSw/viewform")
        startActivity(openURL)
    }
    fun finish(view:View){
        startActivity(Intent(this, ProfActivity::class.java))
    }
}
