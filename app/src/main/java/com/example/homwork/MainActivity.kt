package com.example.homwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val math = com.kg.testCalc.Math()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
    }

    private fun initListeners() {
        binding.apply {
            btnAdd.setOnClickListener {
                tvResult.text = math.add(etFirstNum.text.toString(), etSecondNum.text.toString())
            }
            btnDivide.setOnClickListener {
                tvResult.text = math.divide(etFirstNum.text.toString(), etSecondNum.text.toString())
            }
        }
    }
}