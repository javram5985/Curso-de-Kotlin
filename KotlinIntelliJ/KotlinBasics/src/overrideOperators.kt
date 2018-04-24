import javax.print.attribute.standard.MediaSize

data class Tiempo constructor(val years:Int, val days:Int)

operator fun Tiempo.plus(other:Tiempo):Tiempo//sobrecarga de operador plus
{
    return Tiempo(this.years + other.years, this.days + other.days)//other
}

data class Contador constructor(var index:Int)
{
    operator fun inc():Contador//inc: ++
    {
        return Contador(index +1)
    }
}

fun main(args: Array<String>)
{
    val tiempo1 = Tiempo(2000, 30)
    val tiempo2 = Tiempo(100,2)

    val sumaDelTiempo = tiempo1 + tiempo2
    println(sumaDelTiempo)

    var contador = Contador(5)
    println(contador.inc())
}