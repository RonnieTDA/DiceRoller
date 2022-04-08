package com.example.diceroller

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button=findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val rollButton2:Button=findViewById(R.id.roll_Contar)
        rollButton2.setOnClickListener { rollDice2() }
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
      //  Toast.makeText(this, "button clicked",
        //    Toast.LENGTH_SHORT).show()

        val resultText:TextView=findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

    }

    private fun rollDice2(){

        val resultText:TextView=findViewById(R.id.result_text)

        if(resultText.text.toString().equals("Hello World!")){
            resultText.text ="1"
        }else{
            var dato:Int= resultText.text.toString().toInt();
            if(dato!=6){
                resultText.text = (dato+1).toString();
            }
        }
    }
}