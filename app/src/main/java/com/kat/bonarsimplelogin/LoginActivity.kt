package com.kat.bonarsimplelogin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    var email = ""
    var pass = ""
    var login = "false"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email = "bonaragung@gmail.com"
        pass = "163040156"


        btnLogin.setOnClickListener {

            login()

        }

    }


    private fun login() {

        if (etEmail.text.isEmpty()) {
            Toast.makeText(this@LoginActivity, "Email tidak boleh kosong", Toast.LENGTH_SHORT).show()

            return
        }
        if (etPassword.text.isEmpty()) {
            Toast.makeText(this@LoginActivity, "Password tidak boleh kosong", Toast.LENGTH_SHORT).show()

            return
        }

        if (etEmail.text.toString() != email && etPassword.text.toString() != pass) {
            Toast.makeText(this@LoginActivity, "Akun belum terdafar", Toast.LENGTH_SHORT).show()
        } else {

            Toast.makeText(this@LoginActivity, "Login berhasil!!!", Toast.LENGTH_SHORT).show()
            login = "true"
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
                intent.putExtra("email",email)
                intent.putExtra("pass",pass)
                intent.putExtra("login",login)
            startActivity(intent)


        }


    }
}
