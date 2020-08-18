package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll);

        rollButton.setOnClickListener { rollDice() }

    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        val randomImage: ImageView = findViewById(R.id.diceImage)
        var dice = Dice(6);
        when(dice.roll()){
            1->  randomImage.setImageResource(R.drawable.dice_1)
            2->  randomImage.setImageResource(R.drawable.dice_2)
            3->  randomImage.setImageResource(R.drawable.dice_3)
            4->  randomImage.setImageResource(R.drawable.dice_4)
            5->  randomImage.setImageResource(R.drawable.dice_5)
            else->  randomImage.setImageResource(R.drawable.dice_6)
        }
        Toast.makeText(this, "Dice Rolled !", Toast.LENGTH_SHORT).show()
    }
}