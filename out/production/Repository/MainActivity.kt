package com.example.simpleinterface

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var welcomeText: TextView
    private lateinit var nameInput: EditText
    private lateinit var submitButton: Button
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ініціалізація views
        welcomeText = findViewById(R.id.welcomeText)
        nameInput = findViewById(R.id.nameInput)
        submitButton = findViewById(R.id.submitButton)
        resultText = findViewById(R.id.resultText)

        // Налаштування слухача кліків
        submitButton.setOnClickListener {
            val name = nameInput.text.toString()
            if (name.isNotEmpty()) {
                resultText.text = "Привіт, $name! Раді вас бачити!"
                // Очищаємо поле вводу
                nameInput.text.clear()
                // Показуємо Toast повідомлення
                Toast.makeText(this, "Вітаємо!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Будь ласка, введіть ваше ім'я", Toast.LENGTH_SHORT).show()
            }
        }
    }
}