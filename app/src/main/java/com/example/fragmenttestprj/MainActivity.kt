package com.example.fragmenttestprj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val blankFragment = BlankFragment()
        val transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.fragment_blank, blankFragment)
        transaction.commit()
    }
}