package com.example.birthday_candle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCakeView.setOnClickListener{
            viewInputGuide.text = "hello kotlin";
        }
        // Button action
        //val moveButton = (Button) findViewById(R.id.activeButton)
        /*(
        R.id.btnCakeView.setOnClickListener({
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        })
         */

        /*
        Log -> 메서드 d(tag: "Tag"(안드로이드 로그), msg: "메시지")
         */
    }



    //Intent.putExtra(key, data)
}