package com.example.dice_roller_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var btnRoll: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        clickButton()
    }

    fun castViews() {
        btnRoll = findViewById(R.id.btnRoll)
    }

    fun clickButton() {
        btnRoll.setOnClickListener {
            RollDice()
        }

    }

    private fun RollDice() {
        val randomInt=Random().nextInt(6)+1
       val drawables=when(randomInt) {
           1 -> R.drawable.dice1
           2 -> R.drawable.dice2
           3 -> R.drawable.dice3
           4 -> R.drawable.dice4
           5 -> R.drawable.dice5
           else -> R.drawable.dice6
       }
        val diceImage:ImageView=findViewById(R.id.diceImage)
        diceImage.setImageResource(drawables)
    }
}


