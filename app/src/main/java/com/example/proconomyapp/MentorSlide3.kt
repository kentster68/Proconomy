package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MentorSlide3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_slide3)
    }
    fun backClick(view: View) {
        val myIntent = Intent(this, mentorscr::class.java)
        startActivity(myIntent)
    }
    fun toMentorRegister(view: View) {
        val reg = Intent(this, mentor_3signin::class.java)
        startActivity(reg)
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_inl,R.anim.slide_outr)
    }


}