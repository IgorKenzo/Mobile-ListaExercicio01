package br.senac.igor.listaexercicio01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.igor.listaexercicio01.databinding.ActivityExercicio07Binding

class Exercicio07Activity : AppCompatActivity() {

    lateinit var b : ActivityExercicio07Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        b = ActivityExercicio07Binding.inflate(layoutInflater)
        setContentView(b.root)

        b.buttonUnir.setOnClickListener {
            val i = Intent(this, Exercicio07DetalheActivity::class.java)
            i.putExtra("val1", b.editTextVal1.text.toString())
            i.putExtra("val2", b.editTextVal2.text.toString())
            startActivity(i)
        }
    }
}