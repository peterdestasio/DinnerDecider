package com.peterdestasio.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "Munnezz")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedFoodtxt.text = "Burg"

        decideButton.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodtxt.text = foodList[randomFood]
        }

        addFoodBtn.setOnClickListener{
            val newFood = addFoodText.text.toString()
            foodList.add(newFood)

            addFoodText.text.clear()
        }
    }
}
