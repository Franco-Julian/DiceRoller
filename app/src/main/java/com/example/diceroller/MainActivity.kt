package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.graphics.alpha
import androidx.core.graphics.drawable.toBitmap
import androidx.core.graphics.drawable.toDrawable
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {

    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countUp: Button = findViewById(R.id.count_up)
        val reset: Button = findViewById(R.id.reset)

        if (savedInstanceState != null) {
            diceImage1.tag = savedInstanceState.getString("Dice1","0")
            diceImage2.tag = savedInstanceState.getString("Dice2","0")

            var drawableResource = when(diceImage1.tag) {
                "1" -> R.drawable.dice_1
                "2" -> R.drawable.dice_2
                "3" -> R.drawable.dice_3
                "4" -> R.drawable.dice_4
                "5" -> R.drawable.dice_5
                "6" -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }
            diceImage1.setImageResource(drawableResource)

             drawableResource = when(diceImage2.tag) {
                "1" -> R.drawable.dice_1
                "2" -> R.drawable.dice_2
                "3" -> R.drawable.dice_3
                "4" -> R.drawable.dice_4
                "5" -> R.drawable.dice_5
                "6" -> R.drawable.dice_6
                else -> R.drawable.empty_dice
            }
            diceImage2.setImageResource(drawableResource)
        }

        rollButton.setOnClickListener { rollDice() }
        countUp.setOnClickListener { countUp() }
        reset.setOnClickListener { reset() }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("Dice1", diceImage1.tag.toString())
        outState.putString("Dice2", diceImage2.tag.toString())

    }

    private fun rollDice1(){
        val randomNum: Int = (1..6).random()
         when(randomNum) {
            1 -> {
                diceImage1.setImageResource(R.drawable.dice_1)
                diceImage1.tag = "1"
            }
            2 -> {
                diceImage1.setImageResource(R.drawable.dice_2)
                diceImage1.tag = "2"
            }
            3 -> {
                diceImage1.setImageResource(R.drawable.dice_3)
                diceImage1.tag = "3"
            }
            4 -> {
                diceImage1.setImageResource(R.drawable.dice_4)
                diceImage1.tag = "4"
            }
            5 -> {
                diceImage1.setImageResource(R.drawable.dice_5)
                diceImage1.tag = "5"
            }
            6 -> {
                diceImage1.setImageResource(R.drawable.dice_6)
                diceImage1.tag = "6"
            }
            else -> {
                diceImage1.setImageResource(R.drawable.empty_dice)
                diceImage1.tag = "0"
            }
        }
        //Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
    }

    private fun rollDice2() {
        val randomNum: Int = (1..6).random()
        when (randomNum) {
            1 -> {
                diceImage2.setImageResource(R.drawable.dice_1)
                diceImage2.tag = "1"
            }
            2 -> {
                diceImage2.setImageResource(R.drawable.dice_2)
                diceImage2.tag = "2"
            }
            3 -> {
                diceImage2.setImageResource(R.drawable.dice_3)
                diceImage2.tag = "3"
            }
            4 -> {
                diceImage2.setImageResource(R.drawable.dice_4)
                diceImage2.tag = "4"
            }
            5 -> {
                diceImage2.setImageResource(R.drawable.dice_5)
                diceImage2.tag = "5"
            }
            6 -> {
                diceImage2.setImageResource(R.drawable.dice_6)
                diceImage2.tag = "6"
            }
            else -> {
                diceImage2.setImageResource(R.drawable.empty_dice)
                diceImage2.tag = "0"
            }
            //Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
        }
    }

    private fun rollDice(){
        rollDice1()
        rollDice2()
    }

    private fun countUp() {
        if(diceImage1.tag == "0") {
            diceImage1.setImageResource(R.drawable.dice_1)
            diceImage1.tag = "1"
        }
        if(diceImage2.tag == "6"){
            diceImage2.setImageResource(R.drawable.dice_1)
            diceImage2.tag = "1"

             when(diceImage1.tag) {
                "0" -> {
                    diceImage1.setImageResource(R.drawable.dice_1)
                    diceImage1.tag = "1"
                }
                "1" -> {
                    diceImage1.setImageResource(R.drawable.dice_2)
                    diceImage1.tag = "2"
                }
                "2" -> {
                    diceImage1.setImageResource(R.drawable.dice_3)
                    diceImage1.tag = "3"
                }
                "3" -> {
                    diceImage1.setImageResource(R.drawable.dice_4)
                    diceImage1.tag = "4"
                }
                "4" -> {
                    diceImage1.setImageResource(R.drawable.dice_5)
                    diceImage1.tag = "5"
                }
                "5" -> {
                    diceImage1.setImageResource(R.drawable.dice_6)
                    diceImage1.tag = "6"
                }
                else -> {
                    diceImage1.setImageResource(R.drawable.dice_1)
                    diceImage1.tag = "1"
                }
            }

        } else {
            when(diceImage2.tag) {
                "0" -> {
                    diceImage2.setImageResource(R.drawable.dice_1)
                    diceImage2.tag = "1"
                }
                "1" -> {
                    diceImage2.setImageResource(R.drawable.dice_2)
                    diceImage2.tag = "2"
                }
                "2" -> {
                    diceImage2.setImageResource(R.drawable.dice_3)
                    diceImage2.tag = "3"
                }
                "3" -> {
                    diceImage2.setImageResource(R.drawable.dice_4)
                    diceImage2.tag = "4"
                }
                "4" -> {
                    diceImage2.setImageResource(R.drawable.dice_5)
                    diceImage2.tag = "5"
                }
                "5" -> {
                    diceImage2.setImageResource(R.drawable.dice_6)
                    diceImage2.tag = "6"
                }
                else -> {
                    diceImage2.setImageResource(R.drawable.dice_1)
                    diceImage2.tag = "1"
                }
            }
        }


    }

    private fun reset() {
        diceImage1.setImageResource(R.drawable.empty_dice)
        diceImage1.tag = "0"
        diceImage2.setImageResource(R.drawable.empty_dice)
        diceImage2.tag = "0"
    }
}