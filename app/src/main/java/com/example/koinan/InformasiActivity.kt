 package com.example.koinan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class InformasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi)

        val actionBar = supportActionBar

        actionBar!!.title = "Halaman Informasi"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}