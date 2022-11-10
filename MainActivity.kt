package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {

    private lateinit var letterOne: EditText
    private lateinit var letterTwo: EditText
    private lateinit var threeNum: EditText
    private lateinit var techNum: EditText
    private lateinit var registerButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {

        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        letterOne = findViewById(R.id.TextNumber)
        letterTwo = findViewById(R.id.TextNumber2)
        threeNum = findViewById(R.id.TextLetter)
        techNum = findViewById(R.id.techNumber)
        registerButton = findViewById(R.id.button)


        registerButton.setOnClickListener {
            val letterOne1 = letterOne.text.toString().trim()
            val letterTwo1 = letterTwo.text.toString().trim()
            val threeNum1 = threeNum.text.toString().trim()
            val techNum1 = techNum.text.toString().trim()

            if (letterOne1.isEmpty() || !(letterOne1.length == 2)) {
                letterOne.error = "შეიყვანეთ მონაცემი სწორად"
                return@setOnClickListener
            } else if (letterTwo1.isEmpty() || !(letterTwo1.length == 2)) {
                letterTwo.error = "შეიყვანეთ მონაცემი სწორად"
                return@setOnClickListener
            } else if (threeNum1.isEmpty() || !(threeNum1.length.toInt() == 3)){
                threeNum.error = "შეიყვანეთ მონაცემი სწორად"
                return@setOnClickListener
            } else if (techNum1.isEmpty() || !(techNum1.length == 9)){
                techNum.error = "შეიყვანეთ მონაცემი სწორად"
                return@setOnClickListener
            } else {
                Toast.makeText(this , " რეგისტრაცია წარმატებით დასრულდა , გაუ, სუL... ", Toast.LENGTH_SHORT).show()
            }

        }

    }
}