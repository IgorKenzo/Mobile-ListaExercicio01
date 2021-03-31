package br.senac.igor.listaexercicio01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.igor.listaexercicio01.databinding.ActivityExercicio01Binding

class Exercicio01Activity : AppCompatActivity() {
    lateinit var b : ActivityExercicio01Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityExercicio01Binding.inflate(layoutInflater)
        setContentView(b.root)

        b.buttonFinish.setOnClickListener {
            val msg = """
                |Nome: ${b.editName.text}
                |Telefone: ${b.editPhone.text}
                |Email: ${b.editEmail.text}
                |WhatsApp: ${b.editWhats.text}
                |
                |Tipo de contato selecionado: 
                |- Telefone: ${b.checkPhone.isChecked}
                |- WhatsApp: ${b.checkWhats.isChecked}
                |- Email: ${b.checkEmail.isChecked}
            """.trimMargin()

            alert(this, "Concluido", msg)
        }
    }
}