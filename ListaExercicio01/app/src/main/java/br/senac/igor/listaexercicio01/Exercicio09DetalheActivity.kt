package br.senac.igor.listaexercicio01

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.igor.listaexercicio01.databinding.ActivityExercicio09DetalheBinding

class Exercicio09DetalheActivity : AppCompatActivity() {

    lateinit var b : ActivityExercicio09DetalheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        b = ActivityExercicio09DetalheBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.buttonMais.setOnClickListener {
            val resultI = Intent()
            resultI.putExtra("res", intent.getFloatExtra("val1", 0F)+intent.getFloatExtra("val2", 0F))
            setResult(Activity.RESULT_OK, resultI)
            finish()
        }

        b.buttonMenos.setOnClickListener {
            val resultI = Intent()
            resultI.putExtra("res", intent.getFloatExtra("val1", 0F) - intent.getFloatExtra("val2", 0F))
            setResult(Activity.RESULT_OK, resultI)
            finish()
        }

        b.buttonVezes.setOnClickListener {
            val resultI = Intent()
            resultI.putExtra("res", intent.getFloatExtra("val1", 1F)*intent.getFloatExtra("val2", 1F))
            setResult(Activity.RESULT_OK, resultI)
            finish()
        }

        b.buttonSobre.setOnClickListener {
            val resultI = Intent()
            resultI.putExtra("res", intent.getFloatExtra("val1", 1F)/intent.getFloatExtra("val2", 1F))
            setResult(Activity.RESULT_OK, resultI)
            finish()
        }
    }
}