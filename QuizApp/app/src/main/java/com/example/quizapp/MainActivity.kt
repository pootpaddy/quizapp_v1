package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
//comentarios

/* Investigar un código de ejemplo
* investigar como se escriben las estructuras if, when, else if, when y ciclos en kotlin
* */
    private lateinit var falseButton: Button
    private lateinit var trueButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        falseButton=findViewById(R.id.false_button)
        trueButton=findViewById(R.id.true_button)

        falseButton.setOnClickListener{_->
            Toast.makeText(
                 this,
                "FALSE",
            Toast.LENGTH_SHORT
            ).show()
        }

        trueButton.setOnClickListener{_->
            Toast.makeText(
                this,
                "TRUE",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}
