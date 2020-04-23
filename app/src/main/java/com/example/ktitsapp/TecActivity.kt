package com.example.ktitsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_tec.*

class TecActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tec)
        btn_history.setOnClickListener(this::openInfo)
        btn_exitT.setOnClickListener(this::showProf)
        btn_admin.setOnClickListener(this::openAdm)
    }
    fun openInfo(view: View){
        startActivity(Intent(this, InfoActivity::class.java))
    }
    fun showProf(view: View){
        startActivity(Intent(this,ProfActivity::class.java))
    }
    fun openAdm(view: View){
        startActivity(Intent(this, TeachActivity::class.java))
    }
}
