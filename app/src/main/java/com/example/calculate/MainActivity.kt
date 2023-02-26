package com.example.calculate

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var textAreaSquare: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateSquareArea(view: View) {
        val editText = findViewById<EditText>(R.id.edit_text_number_square)
        val text = editText.text.toString()
        val sideSquare = text.toDouble()
        val area =  sideSquare * sideSquare
        val areaSquare:String = area.toString()
        textAreaSquare?.setText(areaSquare)
        textAreaSquare = findViewById(R.id.textAreaSquare)
    }


}


