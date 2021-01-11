package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        /*
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener {
            resetDice()
        }
        */
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
/*
        val countUpButton: Button = findViewById(R.id.countup_button)
        countUpButton.setOnClickListener {
            countUp()
        }
*/
    }
/*
    private fun resetDice() {
        val resultText: TextView = findViewById((R.id.result_text))
        resultText.text = "0"
    }
*/
    private fun rollDice() {
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

        //Toast.makeText(this, "button clicked",
        //    Toast.LENGTH_SHORT).show()
    }
/*
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val currentNumber: Int? = resultText.text.toString().toIntOrNull()

        if (currentNumber == null) {
            resultText.text = "1"
        } else {
            if (currentNumber < 6) {
                resultText.text = (currentNumber + 1).toString()
            }
        }
    }
 */
}