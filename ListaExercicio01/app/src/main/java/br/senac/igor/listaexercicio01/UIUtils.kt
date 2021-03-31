package br.senac.igor.listaexercicio01


import android.content.Context
import androidx.appcompat.app.AlertDialog

fun alert(context: Context, title: String, msg: String){
    AlertDialog.Builder(context)
        .setTitle(title)
        .setMessage(msg)
        .setPositiveButton("OK", null)
        .create()
        .show()
}