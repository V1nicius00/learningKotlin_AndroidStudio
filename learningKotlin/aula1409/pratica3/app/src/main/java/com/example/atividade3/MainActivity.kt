package com.example.atividade3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fromEditText = findViewById<EditText>(R.id.fromEditText)
        val toEditText = findViewById<EditText>(R.id.toEditText)
        val subjectEditText = findViewById<EditText>(R.id.subjectEditText)
        val sendButton = findViewById<Button>(R.id.sendButton)

        sendButton.setOnClickListener{

            val from = fromEditText.text.toString()
            val to = toEditText.text.toString()
            val subject = subjectEditText.text.toString()

            val message = String.format("Enviando email de %s para %s, com assunto %s", from, to, subject)
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }


    }
}