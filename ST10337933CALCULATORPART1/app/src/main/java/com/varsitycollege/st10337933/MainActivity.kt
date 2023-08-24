package com.varsitycollege.st10337933

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var display: TextView
    private lateinit var edit1: EditText
    private lateinit var edit2: EditText
    private lateinit var add: Button
    private lateinit var subtract: Button
    private lateinit var multiply: Button
    private lateinit var divide: Button
//The above code is declaring the Ui elements

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.answer)
        edit1 = findViewById(R.id.editTextNumber1)
        edit2 = findViewById(R.id.editTextNumber2)
        add = findViewById(R.id.addition)
        subtract = findViewById(R.id.subtraction)
        multiply = findViewById(R.id.multiplication)
        divide = findViewById(R.id.division)
//The above code is used to initialize the Ui elements with the use of findViewById

        add.setOnClickListener {
            val num1 = edit1.text.toString().toInt()
            val num2 = edit2.text.toString().toInt()
            val operator = "+"
            //The above code is to gather the values from both editText fields

            val result = num1 + num2
            //The code in use here is for adding both the numbers and displaying the result
            display.text = "$num1 $operator $num2 = $result"
        }
        subtract.setOnClickListener {
            val num1 = edit1.text.toString().toInt()
            val num2 = edit2.text.toString().toInt()
            val operator = "-"
            //The above code is to gather the values from both editText fields

            val result = num1 - num2
            //The code in use here is for subtracting both the numbers and displaying the result
            display.text = "$num1 $operator $num2 = $result"
        }
        multiply.setOnClickListener {
            val num1 = edit1.text.toString().toInt()
            val num2 = edit2.text.toString().toInt()
            val operator = "x"
            //The above code is to gather the values from both editText fields

            val result = num1 * num2
            //The code in use here is for multiply both the numbers and displaying the result
            display.text = "$num1 $operator $num2 = $result"
        }
        divide.setOnClickListener{
            val num1 = edit1.text.toString().toInt()
            val num2 = edit2.text.toString().toInt()
            val operator = "÷"
            //The above code is to gather the values from both editText fields

            val result = num1 / num2
            //The code in use here is for divide both the numbers and displaying the result
            display.text = "$num1 $operator $num2 = $result"
        }

    }

}