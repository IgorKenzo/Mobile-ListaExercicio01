package br.senac.igor.listaexercicio01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.igor.listaexercicio01.databinding.ActivityExercicio10HUBBinding

class Exercicio10HUBActivity : AppCompatActivity() {

    lateinit var b : ActivityExercicio10HUBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        b = ActivityExercicio10HUBBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.buttonExe1.setOnClickListener {
            val i = Intent(this, Exercicio01Activity::class.java)
            startActivity(i)
        }

        b.buttonExe2.setOnClickListener {
            val i = Intent(this, Exercicio02Activity::class.java)
            startActivity(i)
        }

        b.buttonExe3.setOnClickListener {
            val i = Intent(this, Exercicio03Activity::class.java)
            startActivity(i)
        }

        b.buttonExe4.setOnClickListener {
            val i = Intent(this, Exercicio04Activity::class.java)
            startActivity(i)
        }

        b.buttonExe5.setOnClickListener {
            val i = Intent(this, Exercicio05Activity::class.java)
            startActivity(i)
        }

        b.buttonExe6.setOnClickListener {
            val i = Intent(this, Exercicio06Activity::class.java)
            startActivity(i)
        }

        b.buttonExe7.setOnClickListener {
            val i = Intent(this, Exercicio07Activity::class.java)
            startActivity(i)
        }

        b.buttonExe8.setOnClickListener {
            val i = Intent(this, Exercicio08Activity::class.java)
            startActivity(i)
        }

        b.buttonExe9.setOnClickListener {
            val i = Intent(this, Exercicio09Activity::class.java)
            startActivity(i)
        }
    }
}