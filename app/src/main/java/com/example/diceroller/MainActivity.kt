package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Creating instance of the Button
        val rollButton: Button = findViewById(R.id.button)
        rollDice()
        rollButton.setOnClickListener {
            rollDice()
            //resultTextView.text = "6"
            //Toast.makeText(this,"Dice  Rolled!",Toast.LENGTH_SHORT).show()
        }
    }

    //Random number is displayed
    private fun rollDice() {
        val dice = Dice(6)        //instance of Dice class
        val diceRoll = dice.roll()          //roll() is called

        val dice1 = Dice(6)
        val diceRoll1 = dice1.roll()

        val diceImage : ImageView = findViewById(R.id.imageView)

        val diceImage1 : ImageView = findViewById(R.id.imageView2)

        when(diceRoll)
        {
            1->diceImage.setImageResource(R.drawable.dice1)
            2->diceImage.setImageResource(R.drawable.dice2)
            3->diceImage.setImageResource(R.drawable.dice3)
            4->diceImage.setImageResource(R.drawable.dice4)
            5->diceImage.setImageResource(R.drawable.dice5)
            else->diceImage.setImageResource(R.drawable.dice6)
        }
        when(diceRoll1)
        {
            1->diceImage1.setImageResource(R.drawable.dice1)
            2->diceImage1.setImageResource(R.drawable.dice2)
            3->diceImage1.setImageResource(R.drawable.dice3)
            4->diceImage1.setImageResource(R.drawable.dice4)
            5->diceImage1.setImageResource(R.drawable.dice5)
            else->diceImage1.setImageResource(R.drawable.dice6)
        }
        diceImage.contentDescription = diceRoll.toString()

        diceImage1.contentDescription = diceRoll1.toString()

        //val resultTextView: TextView = findViewById(R.id.textView)      //instance of text view
        //resultTextView.text = diceRoll.toString()                       //using .text Random Number is displayed

    }
    //Random number b/w 1-6 is returned
    class Dice(val numsides: Int) {
        fun roll(): Int {
            return (1..numsides).random()
        }

    }

}