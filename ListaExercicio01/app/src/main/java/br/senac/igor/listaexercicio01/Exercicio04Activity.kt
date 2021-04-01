package br.senac.igor.listaexercicio01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import br.senac.igor.listaexercicio01.databinding.ActivityExercicio04Binding

class Exercicio04Activity : AppCompatActivity() {
    lateinit var b : ActivityExercicio04Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityExercicio04Binding.inflate(layoutInflater)
        setContentView(b.root)

        title = "Exercício 4"

        val opcoes = arrayOf<String>("Selecione","Filme", "Música", "Livro", "Jogo")
        val generos = arrayOf<Array<String>>(
            arrayOf<String>("Selecione"),
            arrayOf<String>("Ação", "Animação", "Drama", "Espacial"),
            arrayOf<String>("Pop", "Rock", "Eletronica", "Forró", "Sertanejo"),
            arrayOf<String>("Ação", "Aventura", "Drama", "Suspense"),
            arrayOf<String>("Ação", "Aventura", "Drama", "Turnos", "Souls-like")
        )

        val adapterOpcoes = ArrayAdapter(this, android.R.layout.simple_spinner_item, opcoes)
        adapterOpcoes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val adapterGeneros = ArrayAdapter(this, android.R.layout.simple_spinner_item, generos[0])
        adapterGeneros.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        b.spinnerOpcao.adapter = adapterOpcoes
        b.spinnerGen.adapter = adapterGeneros

        b.spinnerOpcao.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val adapter = ArrayAdapter(applicationContext, android.R.layout.simple_spinner_item, generos[position])
                adapterOpcoes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                b.spinnerGen.adapter = adapter
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}