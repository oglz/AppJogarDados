package com.oglz.dicethrower

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val faces = intent.getIntExtra("FACES", 0)

        val painel = findViewById<TextView>(R.id.painel)
        val botaoJogar = findViewById<Button>(R.id.jogar)
        val botaoVoltar = findViewById<Button>(R.id.back)
        val identificador = intent.getIntExtra("FACES", 0)

        when (identificador) {
            6 -> {
                painel.text = "D6"
                jogarDados(identificador)
            }
            12 -> {
                painel.text = "D12"
                jogarDados(identificador)
            }
            20 -> {
                painel.text = "D20"
                jogarDados(identificador)
            }
            else -> {
                Toast.makeText(this, "ERRO", Toast.LENGTH_LONG).show()
            }
        }

        botaoJogar.setOnClickListener {
            jogarDados(identificador)
        }

        botaoVoltar.setOnClickListener {
            finish()
        }
    }

    fun jogarDados(faces: Int) {
        val valor = (1..faces).random()
        val resultado = findViewById<TextView>(R.id.painel)
        resultado.text = valor.toString()
    }
}








