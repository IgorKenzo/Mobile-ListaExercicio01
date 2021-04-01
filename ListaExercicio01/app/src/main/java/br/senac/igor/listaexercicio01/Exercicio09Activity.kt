package br.senac.igor.listaexercicio01

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.igor.listaexercicio01.databinding.ActivityExercicio09Binding
import java.lang.Exception

class Exercicio09Activity : AppCompatActivity() {

    lateinit var b : ActivityExercicio09Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        b = ActivityExercicio09Binding.inflate(layoutInflater)
        setContentView(b.root)

        b.buttonCalc.setOnClickListener {
            val i = Intent(this, Exercicio09DetalheActivity::class.java)
            try {
                i.putExtra("val1", b.editTextNumber1.text.toString().toFloat())
                i.putExtra("val2", b.editTextNumber2.text.toString().toFloat())
            }
            catch (e: Exception){
                b.editTextRes.setText("Entrada Inválida")
            }
            startActivityForResult(i, 1)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1 && resultCode == Activity.RESULT_OK && data != null) {
            b.editTextRes.setText(data.getFloatExtra("res", 0F).toString())
        }
    }
}