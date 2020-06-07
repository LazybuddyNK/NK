package com.example.colormyviews

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setlisteners()

    }
    private fun setlisteners() {
        val clickableViews: List<View> =
            listOf( blue_button, yellow_button, red_text, green_text, purple_text
            , red_button, green_button, purple_button, blue_text, yellow_text, bold, italic, normal)

        for (item in clickableViews) {
            item.setOnClickListener{ makeColored(it) }
        }
    }

    private
    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.bg_color -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
//            R.id.box_3_text -> view.setBackgroundResource(android.R.color.holo_green_light)
//            R.id.box_4_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
//            R.id.box_5_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> bg_color.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> bg_color.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> bg_color.setBackgroundResource(R.color.my_green)
            R.id.blue_button -> bg_color.setBackgroundResource(R.color.my_blue)
            R.id.purple_button -> bg_color.setBackgroundResource(R.color.my_purple)
            R.id.red_text -> bg_color.setTextColor(Color.parseColor("#E54304"))
            R.id.yellow_text -> bg_color.setTextColor(Color.parseColor("#ffff00"))
            R.id.green_text -> bg_color.setTextColor(Color.parseColor("#12C700"))
            R.id.blue_text -> bg_color.setTextColor(Color.parseColor("#2196F3"))
            R.id.purple_text -> bg_color.setTextColor(Color.parseColor("#673AB7"))

            R.id.bold -> bg_color.setTypeface(Typeface.DEFAULT_BOLD)
            R.id.italic -> bg_color.setTypeface(bg_color.getTypeface(),Typeface.ITALIC)
            R.id.normal -> bg_color.setTypeface(Typeface.DEFAULT)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}
