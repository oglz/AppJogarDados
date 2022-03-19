package com.oglz.dicethrower

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val botaoD6 = findViewById<Button>(R.id.D6)
        val botaoD12 = findViewById<Button>(R.id.D12)
        val botaoD20 = findViewById<Button>(R.id.D20)

        val  intentDados = Intent(this, SecondActivity::class.java)

        botaoD6.setOnClickListener{
            intentDados.putExtra("FACES",6)
            startActivity(intentDados)
        }
        botaoD12.setOnClickListener{
            intentDados.putExtra("FACES",12)
            startActivity(intentDados)
        }
        botaoD20.setOnClickListener{
            intentDados.putExtra("FACES",20)
            startActivity(intentDados)
        }
    }
}