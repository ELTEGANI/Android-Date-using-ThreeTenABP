package com.learning.androiddateandtime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jakewharton.threetenabp.AndroidThreeTen
import kotlinx.android.synthetic.main.activity_main.*
import org.threeten.bp.LocalDate

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AndroidThreeTen.init(this)


        val date = LocalDate.now()


        today_textView.text = date.toString()


        weekend_textView.text = date.plusDays(7).toString()


        monthend_textView.text = date.plusMonths(1).toString()


    }
}
