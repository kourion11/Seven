package com.example.seven

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : Activity() {
    var imCard: ImageView? = null
    var cards: IntArray = intArrayOf(R.drawable.six, R.drawable.seven, R.drawable.eight, R.drawable.nine, R.drawable.ten, R.drawable.valet,R.drawable.dama,R.drawable.korol, R.drawable.tuz)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imCard = findViewById(R.id.imCard)
        imCard?.setImageResource(cards[(0..8).random()])
    }

    fun onClickGetCard(view: View){
        view as ImageView
        runOnUiThread{
            imCard?.setImageResource(cards[(0..8).random()])
        }
    }

}