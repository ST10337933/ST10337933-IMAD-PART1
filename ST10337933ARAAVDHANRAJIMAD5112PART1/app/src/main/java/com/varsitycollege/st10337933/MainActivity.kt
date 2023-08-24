package com.varsitycollege.st10337933

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var num1EditText: EditText
    private lateinit var num2EditText: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1EditText = findViewById(R.id.num1EditText)
        num2EditText = findViewById(R.id.num2EditText)
        resultTextView = findViewById(R.id.resultTextView)

        val addButton: Button = findViewById(R.id.addbutton)
        val subtractButton: Button = findViewById(R.id.subtractbutton)
        val multiplyButton: Button = findViewById(R.id.multiplybutton)
        val divideButton: Button = findViewById(R.id.dividebutton)

        addButton.setOnClickListener { performOperation(Operation.ADD) }
        subtractButton.setOnClickListener { performOperation(Operation.SUBTRACT) }
        multiplyButton.setOnClickListener { performOperation(Operation.MULTIPLY) }
        divideButton.setOnClickListener { performOperation(Operation.DIVIDE) }
    }

    private fun performOperation(operation: Operation) {
        val num1 = num1EditText.text.toString().toDouble()
        val num2 = num2EditText.text.toString().toDouble()

        val result = when (operation) {
            Operation.ADD -> num1 + num2
            Operation.SUBTRACT -> num1 - num2
            Operation.MULTIPLY -> num1 * num2
            Operation.DIVIDE -> num1 / num2
        }

        resultTextView.text = "Result: $result"
    }
}
    enum class Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }