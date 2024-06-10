package com.han.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var ImageView : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    fun changeImage(view: View) {
      ImageView  = findViewById(R.id.doga_resmi)
        ImageView.setImageResource(R.drawable.elon_musk)

  }


}