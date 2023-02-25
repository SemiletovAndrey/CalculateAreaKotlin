package com.example.calculate

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var textAreaCircle: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateCircleArea(view: View) {
        val editText = findViewById<EditText>(R.id.edit_text_number_circle)
        val text = editText.text.toString()
        var radius = text.toDouble()
        val pi = 3.14159
        var area = pi * radius * radius
        var areaCircle:String = area.toString()
        textAreaCircle?.setText(areaCircle)
        textAreaCircle = findViewById(R.id.textAreaCircle)
    }


}


