package br.senac.igor.listaexercicio01

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.igor.listaexercicio01.databinding.ActivityExercicio08Binding
import java.lang.Exception

class Exercicio08Activity : AppCompatActivity() {

    lateinit var b : ActivityExercicio08Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        b = ActivityExercicio08Binding.inflate(layoutInflater)
        setContentView(b.root)

        b.buttonBuscar.setOnClickListener {

            var endereco = b.editTextEndereco.text.toString()

            if (!endereco.startsWith("http://") && !endereco.startsWith("https://")) {
                endereco = "https://" + endereco
            }
            val uri = Uri.parse(endereco)


            val i = Intent(Intent.ACTION_VIEW, uri)
            startActivity(i)


        }
    }
}