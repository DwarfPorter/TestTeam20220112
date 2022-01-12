package ru.geekbrains.testteam20220112

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Изменения
        val text = findViewById<TextView>(R.id.textview)
        text.text = "Hello Team of dreams!"
    }
}