package com.example.toasterproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toastermodule.ToasterMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ToasterMessage().s(applicationContext, "test toaster message")


    }
}