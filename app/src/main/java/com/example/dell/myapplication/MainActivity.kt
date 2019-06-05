package com.example.dell.myapplication

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dell.myapplication.View.OnItemListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mContext: Context? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mContext = this
        initEvent()
        initRequest()
    }

    fun initRequest(){
        astv_content.setOnClickCallBack {
            when(it){
                0->{
                    Toast.makeText(mContext,"购买须知",Toast.LENGTH_SHORT).show()
                }
                1->{
                    Toast.makeText(mContext,"用户条款",Toast.LENGTH_SHORT).show()
                }
            }
        }
        tv_one.setStartImageText(tv_one.text.toString())

    }    fun initEvent() {
        val item = OnItem()
        item.OnItemListener("22")
    }


}


