package com.example.calculator_thing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculator_thing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun compare(view: View){
        val number1 = binding.editTextNumber.text
        val number2 = binding.editTextNumber2.text

        if(number1.isNullOrBlank() || number2.isNullOrBlank()){

        } else {

            val value = number1[0].toInt()
            val value2 = number2[0].toInt()
            val comparison = value / value2

            binding.textView4.text = comparison.toString()
        }

    }

}