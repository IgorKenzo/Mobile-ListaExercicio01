package br.senac.igor.listaexercicio01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import br.senac.igor.listaexercicio01.databinding.ActivityExercicio03Binding

class Exercicio03Activity : AppCompatActivity() {
    lateinit var b : ActivityExercicio03Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityExercicio03Binding.inflate(layoutInflater)
        setContentView(b.root)

        val tipoEmail = arrayOf<String>("Selicione","Pessoal","Profissional","Outro")
        val adapterTipo = ArrayAdapter(this, android.R.layout.simple_spinner_item, tipoEmail)
        adapterTipo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        val msgApp = arrayOf<String>("Selecione", "WhatsApp", "Telegram",
            "Signal", "Discord", "Skype")
        val adapterMsg = ArrayAdapter(this, android.R.layout.simple_spinner_item, msgApp)
        adapterMsg.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        b.spinnerEmail.adapter = adapterTipo
        b.spinnerAppMsg.adapter = adapterMsg
    }
}