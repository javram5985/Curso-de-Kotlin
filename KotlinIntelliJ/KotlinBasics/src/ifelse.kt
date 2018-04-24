fun main(args: Array<String>)
{
    val a:Boolean = esMayor(6)
    defineTipo("HEY")
    defineTipo(10)
    defineTipo(Persona2("Javier", 23, "negros"))
}

fun esMayor(data:Int): Boolean
{
    return if(data > 0)
    {
        println("$data verdadero")
        true
    } else
    {
        println("$data falso")
        false
    }
}

fun defineTipo(data: Any)//any es cualquier tipo de dato
{
    if(data is String)
    {
        println(data.length)
    }
    else if (data is Int)
    {
        println("${data * 2}")
    }
    else if(data is Persona2)
    {
        println(data.name)
    }
}