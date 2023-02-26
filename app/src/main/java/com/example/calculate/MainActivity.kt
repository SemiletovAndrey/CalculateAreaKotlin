package com.example.calculate

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var textAreaRectangle: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculateRectangleArea(view: View) {
        val editText = findViewById<EditText>(R.id.edit_text_number_rectangle)
        val text = editText.text.toString()
        val sideRectangle = text.toDouble()
        val editText2 = findViewById<EditText>(R.id.edit_text_number_rectangle2)
        val text2 = editText2.text.toString()
        val sideRectangle2 = text2.toDouble()
        val area =  sideRectangle * sideRectangle2
        val areaRectangle:String = area.toString()
        textAreaRectangle?.setText(areaRectangle)
        textAreaRectangle = findViewById(R.id.textAreaRectangle)
    }


}


