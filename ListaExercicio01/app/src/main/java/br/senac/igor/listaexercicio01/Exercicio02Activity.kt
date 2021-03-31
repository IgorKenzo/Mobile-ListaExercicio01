package br.senac.igor.listaexercicio01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import br.senac.igor.listaexercicio01.databinding.ActivityExercicio01Binding

class Exercicio02Activity : AppCompatActivity() {
    lateinit var b : ActivityExercicio01Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Como o layout é o mesmo, reutilizando o do Exercício 01
        b = ActivityExercicio01Binding.inflate(layoutInflater)
        setContentView(b.root)

        b.editPhone.isEnabled = false
        b.editEmail.isEnabled = false
        b.editWhats.isEnabled = false

        changeEnableWithCheck(b.checkPhone, b.editPhone)
        changeEnableWithCheck(b.checkEmail, b.editEmail)
        changeEnableWithCheck(b.checkWhats, b.editWhats)

        b.buttonFinish.setOnClickListener {
            if((b.checkPhone.isChecked && b.editPhone.text.isEmpty()) || (b.checkEmail.isChecked && b.editEmail.text.isEmpty()) || (b.checkWhats.isChecked && b.editWhats.text.isEmpty())) {
                alert(this, "Erro", "Campo de contato selecionado está vazio")
            } else {
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

    fun changeEnableWithCheck(checkBox : CheckBox, editText: EditText){
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            editText.isEnabled = isChecked
        }
    }
}