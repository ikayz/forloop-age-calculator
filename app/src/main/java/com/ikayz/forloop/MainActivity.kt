package com.ikayz.forloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_findAge.setOnClickListener() {
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val getYear = txt_getAge.text.toString().toInt()
            val displayAge = currentYear - getYear
            tv_showAge.text = displayAge.toString()
        }
    }
}
