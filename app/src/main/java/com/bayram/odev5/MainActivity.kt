package com.bayram.odev5

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bayram.odev5.R

class MainActivity : AppCompatActivity() {

    private lateinit var textResult: TextView
    private var currentInput: String = ""
    private var total: Int = 0
    private var isAdding: Boolean = false  // '+' basıldıktan sonra sayı girildiğinde true olur

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textResult = findViewById(R.id.textResult)

        val buttons = listOf(
            R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
            R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9
        )

        for (id in buttons) {
            findViewById<Button>(id).setOnClickListener {
                val number = (it as Button).text.toString()
                currentInput += number
                textResult.text = currentInput
            }
        }

        findViewById<Button>(R.id.btnAdd).setOnClickListener {
            if (currentInput.isNotEmpty()) {
                total += currentInput.toInt()
                currentInput = ""
                textResult.text = total.toString()
                isAdding = true
            }
        }

        findViewById<Button>(R.id.btnEquals).setOnClickListener {
            if (currentInput.isNotEmpty()) {
                total += currentInput.toInt()
                textResult.text = total.toString()
                currentInput = ""
            }
        }

        findViewById<Button>(R.id.btnClear).setOnClickListener {
            total = 0
            currentInput = ""
            textResult.text = "0"
        }
    }
}
