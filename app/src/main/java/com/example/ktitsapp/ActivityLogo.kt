package com.example.ktitsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_logo.*

class ActivityLogo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)
        btn_card.setOnClickListener(this::showProf)
    }
    fun showProf(view: View){
        startActivity(Intent(this,ProfActivity::class.java))
    }
}
