package br.senac.igor.listaexercicio01

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.core.graphics.drawable.toBitmap
import androidx.core.view.children
import br.senac.igor.listaexercicio01.databinding.ActivityExercicio06Binding

class Exercicio06Activity : AppCompatActivity() {
    lateinit var b : ActivityExercicio06Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityExercicio06Binding.inflate(layoutInflater)
        setContentView(b.root)
        val arrayImageView = arrayOf(b.imageView,b.imageView2,b.imageView3,b.imageView4,b.imageView5,b.imageView6)
        //println(b.root.children)
        for (iv in arrayImageView) {
            iv.setOnClickListener {
                val intent = Intent(this, Exercicio06OpenActivity::class.java)
                intent.putExtra("Img", iv.tag as String)
                startActivity(intent)
            }
        }
    }
}