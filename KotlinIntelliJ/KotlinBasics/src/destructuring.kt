//destructuring: tomar un objeto y desmembrarlo en pedazos en una sola linea
//para tenerlas ya listas para utilizarlas

data class Familiar constructor(val name:String = "Javier", val age:Int = 24, val colorCabello:String = "Cafe" )//data class con default values

data class Result constructor(val result:Int, val status:Boolean)

fun calcular(a:Int, b:Int):Result
{
    if (a * 2 > b)
    {
        return Result(a * 2, true)
    }
    else
    {
        return Result(a, false)
    }
}

fun main(args: Array<String>)
{
    val (name, age, color) = Familiar()//destructuring
//    val nombre = javier.name
//    val edad = javier.age
//    val color = javier.colorCabello ---> en lugar de escribir todo esto, podemos hacer lo siguiente, ver arriba
//    val (name, _, color) = Familiar()//si no quiero que este familiar tenga el age poner _
    println(name)
    println(color)

    val (resultado, status) = calcular(4,9)//destructuring
    println(resultado)
    println(status)
}