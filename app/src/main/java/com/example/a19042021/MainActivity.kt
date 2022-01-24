package com.example.a19042021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.random
import java.util.*

class MainActivity : AppCompatActivity() {


    var tvNum1: TextView? = null
    var tvNum2: TextView? = null

    var javob = 0
    var radBtnJavob = 0

    var togriJavobSoni=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        random()
     radioButtonSet()

        btn_keyingi.setOnClickListener {
if (rad_a.isChecked){
    if (rad_a.text.toString().toInt()==javob) Toast.makeText(this,"Togri",Toast.LENGTH_SHORT).show()
    else Toast.makeText(this,"NoTogri",Toast.LENGTH_SHORT).show()
}
            if (rad_b.isChecked){
                if (rad_b.text.toString().toInt()==javob) Toast.makeText(this,"Togri",Toast.LENGTH_SHORT).show()
                else Toast.makeText(this,"NoTogri",Toast.LENGTH_SHORT).show()
            }
            if (rad_c.isChecked){
                if (rad_c.text.toString().toInt()==javob) Toast.makeText(this,"Togri",Toast.LENGTH_SHORT).show()
                else Toast.makeText(this,"NoTogri",Toast.LENGTH_SHORT).show()
            }
            if (rad_d.isChecked){
                if (rad_d.text.toString().toInt()==javob) Toast.makeText(this,"Togri",Toast.LENGTH_SHORT).show()
                else Toast.makeText(this,"NoTogri",Toast.LENGTH_SHORT).show()
            }
btn_group.clearCheck()
            random()
radioButtonSet()
        }

    }

  private fun random() {
    var number1 = Random().nextInt(20)
    var number2 = Random().nextInt(20)
    var amal = Random().nextInt(4)

    when (amal) {
        0 -> {
            javob = number1 + number2
            txt_misol.text = "$number1 +$number2"
        }
        1 -> {
            javob = number1 - number2
            txt_misol.text = "$number1 - $number2"
        }
        2 -> {
            javob = number1 * number2
            txt_misol.text = "$number1 * $number2"
        }
        3 -> {
            try {
                javob = number1 / number2
                if (number1 % number2 == 0) {
                    txt_misol.text = "$number1 / $number2"
                } else {
                    throw ArithmeticException()
                }
            } catch (e: ArithmeticException) {
                random()
                radioButtonSet()
            }
        }
    }

}




    fun radioButtonSet(){
        var a=Random().nextInt(100)
        var b=Random().nextInt(100)
        var c=Random().nextInt(100)

        println("radiobutton javob: $javob")

        radBtnJavob= Random().nextInt(4)

        if (javob != a && javob!=b && javob!=c) {
            when (radBtnJavob) {
                0 -> {
                    rad_a.text = javob.toString()
                    rad_b.text = a.toString()
                    rad_c.text = b.toString()
                    rad_d.text = c.toString()
                }
                1 -> {
                    rad_a.text = a.toString()
                    rad_b.text = javob.toString()
                    rad_c.text = b.toString()
                    rad_d.text = c.toString()
                }
                2 -> {
                    rad_b.text = a.toString()
                    rad_a.text = b.toString()
                    rad_c.text = javob.toString()
                    rad_d.text = c.toString()
                }
                3 -> {
                    rad_b.text = a.toString()
                    rad_c.text = b.toString()
                    rad_c.text = c.toString()
                    rad_d.text = javob.toString()
                }
            }
            println("radiobutton javobb: $javob")
        }else{
            radioButtonSet()
        }
        println("radiobutton javob: $javob")

    }




}
