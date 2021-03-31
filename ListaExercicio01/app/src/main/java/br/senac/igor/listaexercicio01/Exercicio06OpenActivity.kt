package br.senac.igor.listaexercicio01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.igor.listaexercicio01.databinding.ActivityExercicio06OpenBinding

class Exercicio06OpenActivity : AppCompatActivity() {
    lateinit var b : ActivityExercicio06OpenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityExercicio06OpenBinding.inflate(layoutInflater)
        setContentView(b.root)

        val id = intent.getStringExtra("Img")

        val name = id?.split("/")?.last()
        val defType = id?.split("/")?.first()

        val resID = resources.getIdentifier(name, defType, packageName)

        b.imageOpenImage.setImageResource(resID)
    }
}