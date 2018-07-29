package com.kat.bonarsimplelogin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email: String = intent.getStringExtra("email")
        val pass: String = intent.getStringExtra("pass")
        val login: String = intent.getStringExtra("login")

        if (login == "true"){
            tvemail.text = email
            tvpass.text = pass
        }

        btnLogout.setOnClickListener {

            val intent= Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }


    }

}