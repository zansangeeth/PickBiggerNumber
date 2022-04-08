package com.zasa.pickbiggernumber

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            checkAnswer(true)
            assignedNumber()
        }

        button2.setOnClickListener {

            checkAnswer(false)
            assignedNumber()
        }



//        var randomNumber = 1..9
//        button1.setOnClickListener {
//            button1.text = randomNumber.random().toString()
//            val button1Number = button1.text.toString().toInt()
//            val button2Number = button2.text.toString().toInt()
//
//            if (button1Number>button2Number){
//                layoutId.setBackgroundColor(Color.GREEN)
//            }else if (button1Number == button2Number){
//                layoutId.setBackgroundColor(Color.YELLOW)
//            }
//            else
//                layoutId.setBackgroundColor(Color.RED)
//        }
//
//        button2.setOnClickListener {
//            button2.text = randomNumber.random().toString()
//            val button1Number = button1.text.toString().toInt()
//            val button2Number = button2.text.toString().toInt()
//
//            if (button2Number>button1Number){
//                layoutId.setBackgroundColor(Color.GREEN)
//            }else if (button2Number == button1Number){
//                layoutId.setBackgroundColor(Color.YELLOW)
//            }else
//                layoutId.setBackgroundColor(Color.RED)
//
//        }

    }

    private fun checkAnswer(isLeftButtonSelected : Boolean){
        val leftNum : Int = button1.text.toString().toInt()
        val rightNum : Int = button2.text.toString().toInt()

        val isAnswerCorrect = if (isLeftButtonSelected) leftNum >rightNum else rightNum>leftNum
        if (isAnswerCorrect){
            layoutId.setBackgroundColor(Color.GREEN)
        }else
            layoutId.setBackgroundColor(Color.RED)
    }

    private fun assignedNumber() {
        var r : IntRange = 1..9
        var leftNum = r.random()
        var rightNum = r.random()
        while (leftNum == rightNum){
            rightNum = r.random()
        }
        button1.text = leftNum.toString()
        button2.text = rightNum.toString()

    }

}