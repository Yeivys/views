package com.example.views

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val imageView: ImageView = findViewById(R.id.imageView)

        button.setOnClickListener {
            val editText1: EditText = findViewById(R.id.editText1)
            val editText2: EditText = findViewById(R.id.editText2)
            val editText3: EditText = findViewById(R.id.editText3)
            val editText4: EditText = findViewById(R.id.editText4)

            val isEmpty1 = editText1.text.isBlank()
            val isEmpty2 = editText2.text.isBlank()
            val isEmpty3 = editText3.text.isBlank()
            val isEmpty4 = editText4.text.isBlank()

            if (isEmpty1 || isEmpty2 || isEmpty3 || isEmpty4) {
                // Mostrar la paloma roja en caso de campos vacíos
                imageView.setImageResource(R.drawable.uncheck)
            } else {
                // Mostrar la palomita verde en caso de todos los campos llenos
                imageView.setImageResource(R.drawable.check)
            }

            // Hacer la imagen visible
            imageView.visibility = View.VISIBLE
        }
    }
}

