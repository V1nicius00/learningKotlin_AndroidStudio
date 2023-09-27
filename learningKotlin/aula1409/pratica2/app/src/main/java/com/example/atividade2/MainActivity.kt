package com.example.atividade2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var editText1: EditText
    private lateinit var edirText2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.txtvw1)
        editText1 = findViewById(R.id.editText1)
        edirText2 = findViewById(R.id.editText2)
    }
}