package com.example.atividade5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText : EditText = findViewById(R.id.editText)
        val button : Button = findViewById(R.id.button)
        val listView : ListView = findViewById(R.id.listView)

        val list = ArrayList<String>()
        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, list)
        listView.adapter = adapter

        button.setOnClickListener {}
        val text : String = editText.text.toString()
        if(text != ""){
            list.add(text)
            adapter.notifyDataSetChanged()
            editText.setText("")
            editText.requestFocus()
        }

        listView.setOnItemClickListener { parent, view, position, id ->
            editText.setText(list[position])
        }

        listView.setOnItemLongClickListener { parent, view, position, id ->
            list.removeAt(position)
            adapter.notifyDataSetChanged()
            true
        }
    }



}