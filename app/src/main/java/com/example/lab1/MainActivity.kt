package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn: Button = findViewById(R.id.btn1) as Button;
        var textview: TextView = findViewById(R.id.textview) as TextView;

        btn.setOnClickListener{
            var newtext: EditText = findViewById(R.id.txt1) as EditText;
            textview.setText(newtext.text.toString());
        }

    }
}