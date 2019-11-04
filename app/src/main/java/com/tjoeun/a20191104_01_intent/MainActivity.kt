package com.tjoeun.a20191104_01_intent

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_user_info.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phoneNumInputBtn.setOnClickListener {
            var intent=Intent(this,EditPhoneNumActivity::class.java)
            startActivityForResult(intent,1001)
        }


        nameInputBtn.setOnClickListener {
            var intent=Intent(this,EditUserInfoActivity::class.java)

//            if(nameEdt.text.toString() !="이름 입력 필요"){
//                intent.putExtra("userName",nameEdt.text.toString() )
//            }
            setResult(Activity.RESULT_OK,intent)

            startActivityForResult(intent,1000)

        }


        phoneDialBtn.setOnClickListener {

            var uri =Uri.parse("tel:01075782970") // 띄어쓰기 하면 안됨
            var intent =Intent(Intent.ACTION_DIAL,uri)
            startActivity(intent)
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

        else if (requestCode ==1001){

            if(resultCode==Activity.RESULT_OK){
                var phoneNumStr=data?.getStringExtra("inputPhoneNum")
                phoneNumStr?.let{
                    phoneNumTxt.text=phoneNumStr
                }
            }

        }


    }





}
