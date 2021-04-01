package br.senac.igor.listaexercicio01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.igor.listaexercicio01.databinding.ActivityExercicio07DetalheBinding

class Exercicio07DetalheActivity : AppCompatActivity() {

    lateinit var b : ActivityExercicio07DetalheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        b = ActivityExercicio07DetalheBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.buttonShow.setOnClickListener {
            val val1 = intent.getStringExtra("val1")
            val val2 = intent.getStringExtra("val2")

            alert(this, "União", val1+val2)
        }
    }
}