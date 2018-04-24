package com.example.javier5895.kotlinyjava

data class PojoBasico @JvmOverloads constructor(val titulo:String, val desc:String = "")

//@JvmOverloads me permite quitar un parametro del data class de arriba,
//Ver MainActivity pojoBasico2