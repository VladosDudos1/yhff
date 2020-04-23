package com.example.ktitsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_prof.*

class ProfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prof)
        btn_exitP.setOnClickListener(this::finish)
        btn_student.setOnClickListener(this::showMain)
        btn_about.setOnClickListener(this::openTec)
        btn_abit.setOnClickListener(this::openNew)
    }

    fun showMain(view: View){
        startActivity(Intent(this,MainActivity::class.java))
    }
    fun finish(view: View){
        finishAffinity()
    }

    fun openTec(view: View){
        startActivity(Intent(this, TecActivity::class.java))
    }
    fun openNew(view: View){
        startActivity(Intent(this, NewStudActivity::class.java))
    }
}
