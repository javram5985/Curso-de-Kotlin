//En Kotlin podemos hacer el manejo de errores en nuestros programas haciendo uso de Try, catch.
fun esNumero(dato:Any?) = dato is Int || dato is Int?

fun fail(mensaje:String):Nothing
{
    throw IllegalArgumentException(mensaje)//throw regresa un objeto Nothing
}

fun main(args: Array<String>)
{
    println("Ingresa tu contrasena: ")

    val num:Any? = try {
        readLine()?.toInt()
    }catch(error1:NumberFormatException){
        "No Int"
    }

    println("Variable: ")
    println(num)
    println("Funcion: ")
    println(esNumero(num))

    var name = ""
    val persona:Persona2? = null
    try{
        name = persona?.name ?: throw fail("Nombre requerido")//este name no es el mismo del name de arriba, es otro
    }catch(error1:IllegalArgumentException){
        println(error1)
        println(name)
    }
}