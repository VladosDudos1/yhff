package com.example.ktitsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_new_stud.*

class NewStudActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_stud)

        btn_exitN.setOnClickListener(this::exit)
        btn_obshaga.setOnClickListener(this::openObshaga)
        btn_prikaz.setOnClickListener(this::openPricaz)
        btn_docs.setOnClickListener(this::openDocs)

    }

    fun exit(view: View){
        startActivity(Intent(this, ProfActivity::class.java))
    }

    fun openPricaz(view: View){
        startActivity(Intent(this, PricazActivity::class.java))
    }

    fun openObshaga(view: View){
        startActivity(Intent(this, ObshagaActivity::class.java))
    }

    fun openDocs(view: View){
        startActivity(Intent(this, DocsActivity::class.java))
    }
}
