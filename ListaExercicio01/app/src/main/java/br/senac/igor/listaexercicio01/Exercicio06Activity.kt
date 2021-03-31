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

//        for (element in b.root.children) {
//            if (element is ImageView) {
//                element.setOnClickListener {
//                    val intent = Intent(this, Exercicio06OpenActivity::class.java)
//
//                    val extra = Bundle()
//                    extra.putParcelable("Bitmap", element.drawable.toBitmap())
//
//                    intent.putExtra("Img",extra)
//                    startActivity(intent)
//                }
//            }
//        }



                b.imageView6.setOnClickListener {
                    val intent = Intent(this, Exercicio06OpenActivity::class.java)

                    //val extra = Bundle()
                    //extra.putParcelable("f", )

                    intent.putExtra("Img", b.imageView6.getTag()as String)
                    startActivity(intent)
                }


    }
}