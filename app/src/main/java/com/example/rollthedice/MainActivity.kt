package com.example.rollthedice

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonListener()
    }

    var currentValue = -1
    @SuppressLint("SetTextI18n")
    fun buttonListener() {
        val button = findViewById<View>(R.id.button2) as Button
        button.setOnClickListener { view: View? ->
            val rand = Random()
            var result: Int
            do result = rand.nextInt(6) + 1 while (result == currentValue)
            currentValue = result
            val img =
                findViewById<View>(R.id.imageView) as ImageView
            img.visibility = View.VISIBLE
            findViewById<View>(R.id.animationView).visibility = View.GONE
            when (result) {
                1 -> img.setImageResource(R.drawable.dice_1)
                2 -> img.setImageResource(R.drawable.dice_2)
                3 -> img.setImageResource(R.drawable.dice_3)
                4 -> img.setImageResource(R.drawable.dice_4)
                5 -> img.setImageResource(R.drawable.dice_5)
                6 -> img.setImageResource(R.drawable.dice_6)
            }
        }
    }
}