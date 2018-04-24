package com.example.javier5895.kotlinyjava

import android.widget.EditText

//object Validaciones//Singleton
//{
//    @JvmStatic //esta etiqueta le dira a java que este funcion es estatica, con esto podemos quitar el .INSTANCE en el MainActivity.java
//    fun EditText.passwordValida():Boolean
//    {
//        return this.text.toString().isNotEmpty() && this.text.toString().length.compareTo(6) == 1
//    }
//}esto se uso cuando teniamos el MainAktivity.java

fun EditText.passwordValida():Boolean
{
    return this.text.toString().isNotEmpty() && this.text.toString().length.compareTo(6) == 1
}

//compareTo -> compara el .lenght con el parametro, es decir lo que tiene dentro de
//los parentesis en este caso es 6. Como minimo la password debe de ser mayor o igual
//que 6. compareTo puede regresar 3 valores, 0 si el valor que estamos comparando es igual,
//1 si es un valor mayor que el valor que estamos comparando y (-1) si el dato es menor

//fun EditText.passwordValida():Boolean
//{
//    if(this.text.toString().isNotEmpty() && this.text.toString().length.compareTo(6) == 1
//        return true
//    else
//        return false
//}