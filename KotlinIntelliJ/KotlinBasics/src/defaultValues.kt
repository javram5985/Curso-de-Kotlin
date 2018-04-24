fun saluda(saludo:String = "Hola a todos")//default values en Kotlin
{
    println(saludo)
}

fun otraFuncion(edad:Int = 0, esAdulto:Boolean = false, tieneRopa:Boolean = true)
{

}

data class P1 constructor(val a:Int = 2)//data class con default values

fun main(args: Array<String>)
{
    saluda("Hola que paso")
    saluda()

    otraFuncion(esAdulto = true, edad = 39, tieneRopa = true)
    otraFuncion(esAdulto = true, tieneRopa = true)
    otraFuncion(esAdulto = true, edad = 39)
    otraFuncion(tieneRopa = true, edad = 39)
    otraFuncion()

    val objetoO = P1(3)

}