package com.example.kotlinpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Sample_Example : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.explicitintent)

        val etId: EditText = findViewById(R.id.etId)
        val etName: EditText = findViewById(R.id.etName)
        val btnSend: Button = findViewById(R.id.btnSend)

        btnSend.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("id", etId.text.toString())
            bundle.putString("name", etName.text.toString())

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}



