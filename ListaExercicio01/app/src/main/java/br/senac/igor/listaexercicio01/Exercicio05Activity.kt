package br.senac.igor.listaexercicio01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.senac.igor.listaexercicio01.databinding.ActivityExercicio05Binding
import java.lang.NumberFormatException

class Exercicio05Activity : AppCompatActivity() {
    lateinit var b : ActivityExercicio05Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityExercicio05Binding.inflate(layoutInflater)
        setContentView(b.root)

        val listBtn = listOf<Button>(b.button0,b.button1,b.button2,b.button3,b.button4,b.button5,b.button6,b.button7,b.button8,b.button9,b.buttonMult,b.buttonSoma,b.buttonDiv,b.buttonDif,b.buttonPonto)

        for (btn in listBtn) {
            btn.setOnClickListener {
                buttonClicked(btn)
            }
        }

        b.buttonDel.setOnClickListener {
            b.textConta.text = b.textConta.text.toString().dropLast(1)
        }

        b.buttonIgual.setOnClickListener {
            val res = realizarConta()
            b.textResult.text = if (!res.isNaN()) res.toString() else "Entrada Inválida"
        }
    }

    fun buttonClicked(btn :Button) {
        b.textConta.text = b.textConta.text.toString() + btn.text.toString()
    }

    fun stringToMutableList(txt : String) : MutableList<String> {
        val txt = b.textConta.text.toString()
        val op = listOf<Char>('+','-','/','*')
        val arrayString: MutableList<String> = ArrayList()
        var str = ""

        for (c in txt) {
            if (c !in op) {
                str = str.plus(c)
            }
            else{
                arrayString.add(str)
                arrayString.add("".plus(c))
                str = ""
            }
        }
        arrayString.add(str)

        return arrayString
    }

    fun realizarConta() : Float {
        var arrayConta: MutableList<String> = stringToMutableList(b.textConta.text.toString())
        var i = 0
        val md = listOf<String>("/","*")
        val ss = listOf<String>("+","-")
        try {
            while (arrayConta.contains(md[0]) || arrayConta.contains(md[1])) {
                if (arrayConta[i] in md) {
                    val v1 = arrayConta[i-1].toFloat()
                    val v2 = arrayConta[i+1].toFloat()
                    val res = if (arrayConta[i] == "*") v1 * v2 else v1 / v2
                    var esq = arrayConta.subList(0, i-1).toMutableList()
                    var dir = arrayConta.subList(i+1, arrayConta.size).toMutableList()

                    dir.removeAt(0)

                    esq.add(res.toString())
                    esq.addAll(dir)

                    arrayConta = esq
                }else {
                    i++
                }
            }

            i = 0
            while (arrayConta.contains(ss[0]) || arrayConta.contains(ss[1])) {
                if (arrayConta[i] in ss) {
                    val v1 = arrayConta[i - 1].toFloat()
                    val v2 = arrayConta[i + 1].toFloat()
                    val res = if (arrayConta[i] == "+") v1 + v2 else v1 - v2
                    var esq = arrayConta.subList(0, i - 1).toMutableList()
                    var dir = arrayConta.subList(i + 1, arrayConta.size).toMutableList()

                    dir.removeAt(0)

                    esq.add(res.toString())
                    esq.addAll(dir)

                    arrayConta = esq
                } else {
                    i++
                }
            }
            return arrayConta[0].toFloat()
        } catch (e: Exception){
            return Float.NaN
        }
    }
}