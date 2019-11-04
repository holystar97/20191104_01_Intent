package com.tjoeun.a20191104_01_intent

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_user_info.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        nameInputBtn.setOnClickListener {
            var intent=Intent(this,EditUserInfoActivity::class.java)

            if(nameEdt.text.toString() !="이름 입력 필요"){
                intent.putExtra("userName",nameEdt.text.toString() )
            }
            setResult(Activity.RESULT_OK,intent)

            startActivityForResult(intent,1000)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode ==1000){
            if(resultCode== Activity.RESULT_OK){
                var inputNameData = data?.getStringExtra("inputName")?.toLowerCase()

                if(inputNameData !=null) {

                }

                inputNameData?.let {

                    nameTxt.text=it
                }
            }
        }


    }





}
