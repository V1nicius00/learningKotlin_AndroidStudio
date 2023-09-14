package com.example.atividade1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtData: TextView
    lateinit var txtHora: TextView
    lateinit var spinnerData: Spinner
    lateinit var spinnerHora: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtData = findViewById(R.id.txtData)
        txtHora = findViewById(R.id.txtHora)
        spinnerData = findViewById(R.id.spinnerData)
        spinnerHora = findViewById(R.id.spinnerHora)

        val adapterData = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            arrayOf("2023-07-20", "2023-07-21", "2023-07-22")
        )

        val adapterHora = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            arrayOf("08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00")
        )

        spinnerData.adapter = adapterData
        spinnerHora.adapter = adapterHora

        spinnerData.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                txtData.text = parent.getItemAtPosition(position) as String
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }

        spinnerHora.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                txtHora.text = parent.getItemAtPosition(position) as String
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
    }
}