package com.example.devportfolio

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = DevPagerAdapter(supportFragmentManager)
        tabLayoutId.setupWithViewPager(viewPager)

        tabLayoutId.setTabTextColors(Color.GRAY, Color.parseColor("white"))

        getIntouch.setOnClickListener(){
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "08081115234")
            startActivity(dialIntent)
        }

    }


}