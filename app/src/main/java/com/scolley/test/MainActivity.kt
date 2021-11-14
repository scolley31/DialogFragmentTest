package com.scolley.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {

    lateinit var dialogFragment: Dialogment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialogFragment = Dialogment()

        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            dialogFragment.show(supportFragmentManager, null)
        }

    }
}