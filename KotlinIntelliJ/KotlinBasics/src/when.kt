fun type(dato:Any)
{
    when(dato)
    {
        is String ->
        {
            println(dato.length)
        }
        is Int ->
        {
            println("${dato * 2}")
        }
        is Boolean ->
        {
            println("Es un booleano")
            println(dato)
        }
        is Persona2 -> println("${dato.name} ${dato.age}")
        else -> println("No se que objeto es.")
    }
}

fun whoIs(personas: Persona2) =

    when(personas.name)
    {
        "Mabel" -> "Puedes abrir la puerta"
        "Darla" -> "Puedes abrir la puerta"
        "Raul"  -> "Puedes abrir la puerta"
        else -> "No abras la puerta, es un desconocido"
    }

fun rango(numero:Int)
{
    when(numero)
    {
        in 1..10 -> println("este es un numero que esta dentro del rango de 1 a 10")
        in 10..100 -> println("este es un numero que esta dentro del rango de 10 a 100")
        else -> println("este es un numero fuera del rango definido")
    }
}

fun main(args: Array<String>)
{
    val javier = Persona2("Javier", 23, "Azules")
    type(javier)
    val mabel = Persona2("Mabel", 40, "Cafes")
    val desconocido = Persona2("Asesino", 50, "Verdes")
    println(whoIs(mabel))
    println(whoIs(desconocido))
    rango(99)
}