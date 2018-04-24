//Una de las características mas importantes de Kotlin es el Null Safety.
//Kotlin esta construido para evitar los Null pointer exception.
//https://kotlinlang.org/docs/reference/null-safety.html ver documentacion
fun main(args: Array<String>)
{
    var a:String = "abc"

    var  b:String? = "abc"//con el ? podemos definir una variable como null
    b = null

    //val l = if (b != null) b.length else -1

    val lA = a.length
    val lB = b?.length ?:0//? es un entero que tambien es nulleable, ?:0 el dato ya no es nulleable
    val lB1 = b?.length ?: "Hola" //Elvis Operator,If the expression to the left of ?: is not null, the elvis operator returns it, otherwise it returns the expression to the right.
    println(lA)
    println(lB)
    println(lB1)

    val persona:Persona2? = Persona2("Javier", 22, "Cafes")
    val nombre = persona?.name
    println(nombre)

    if(persona != null){}
    persona?.let{}//Persona Inicializada
    persona.let{}//null
}