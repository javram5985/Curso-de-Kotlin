fun main(args: Array<String>)
{

    val srt = "Una cadena de String normal"

    val nombre = "Manbel"
    val edad = 25
    val sentencia = "Ella es" + nombre + "y tiene" + edad//mala practica en kotlin
    val sentencia2 = "Ella es ${nombre} y tiene $edad"//buena practica, alt enter (convert concatenation to template)
    println(sentencia2)

    val cumpl = "$nombre cumple ${edad + 1}"//operaciones adentro de {}
    println(cumpl)

    val text = """
        Este es un string que quiero imprimir que es demasiado largo
        y tiene varios
        renglones
    """ //de esta manera el texto no esta alineado, para alinearlo hacer lo siguiente:
    println(text)

    val text2 = """
        |Este es un string que quiero imprimir
        |que es demasiado largo
        |y tiene varios renglones
    """.trimMargin()
    println(text2)

    val text3 = """
        >Este es un string que quiero imprimir
        >que es demasiado largo
        >y tiene varios renglones
    """.trimMargin(marginPrefix = ">")
    println(text3)//si en dado caso no quiero usar el pipe | y quiero usar otro simbolo hacer lo que esta arriba
}