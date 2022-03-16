package com.example.lmia_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lmia_project.databinding.ActivityMainBinding

// DiegoTheSwimBoi/Android_Calculator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // По Id нашего textView
        binding.textContent.text="0";

        // По Id нашей кнопки
        val buttonSum = binding.buttonSum
        val buttonMinus=binding.buttonMinus
        val buttonMulti=binding.buttonMulti
        val buttonDiv=binding.buttonDiv

        val numA = binding.editTextNumberA
        val numB = binding.editTextNumberB


        buttonSum.setOnClickListener{
            var number: Int = binding.textContent.text.toString().toInt();
            var A: Int = numA.text.toString().toInt()
            var B: Int = numB.text.toString().toInt()
            binding.textContent.text= (A+B).toString()
        }

        buttonMinus.setOnClickListener{
            var number: Int = binding.textContent.text.toString().toInt();
            var A: Int = numA.text.toString().toInt()
            var B: Int = numB.text.toString().toInt()
            binding.textContent.text= (A-B).toString()
        }

        buttonMulti.setOnClickListener{
            var number: Int = binding.textContent.text.toString().toInt();
            var A: Int = numA.text.toString().toInt()
            var B: Int = numB.text.toString().toInt()
            binding.textContent.text= (A*B).toString()
        }

        buttonDiv.setOnClickListener {
            var number: Int = binding.textContent.text.toString().toInt();
            var A: Int = numA.text.toString().toInt()
            var B: Int = numB.text.toString().toInt()
            binding.textContent.text= (A/B).toString()
        }
    }
}