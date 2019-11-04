package com.tjoeun.a20191104_01_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        nameInputBtn.setOnClickListener {
            var intent=Intent(this,EditUserInfoActivity::class.java)
            startActivityForResult(intent,1000)



        }

    }
}
