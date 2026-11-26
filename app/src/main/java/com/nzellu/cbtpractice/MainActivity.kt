package com.nzellu.cbtpractice

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(24, 29, 40))
        }

        val title = TextView(this).apply {
            text = "NZELLU CBT PRACTICE"
            textSize = 24f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val info = TextView(this).apply {
            text = "\nSIMULASI UJIAN\n\nMode latihan aktif\nPerangkat tidak dikunci."
            textSize = 18f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
        }

        val exitButton = Button(this).apply {
            text = "KELUAR"
            setOnClickListener {
                finish()
            }
        }

        layout.addView(title)
        layout.addView(info)
        layout.addView(exitButton)

        setContentView(layout)
    }
}
