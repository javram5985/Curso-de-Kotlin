//singleton es un patrón de software que nos permite tener una instancia de un objeto que
//puede ser consultada y modificada desde cualquier parte del código.
object Validaciones //singleton
{
    fun passowrdValida(psw:String):Boolean
    {
//        if(psw.length > 0 && psw.length > 10)
//            return true
//        else
//            return false
        return psw.isNotEmpty() && psw.length > 10 //es lo mismo que arriba, is notEmpty() = psw.lenght > 0
    }

    fun esNumero(dato:Any):Boolean
    {
        return dato is Int
    }
}
class ClaseUniversal
{
    companion object
    {
        fun create():ClaseUniversal = ClaseUniversal()
    }
}

//llamar los singleton
fun main(args: Array<String>)
{
    println("Ingresa tu contrasena: ")
    val passw:String = readLine()?.toString() ?:""
    println(Validaciones.passowrdValida(passw))

    println("Ingresa cualquier cosa")
    try//https://beginnersbook.com/2013/04/try-catch-in-java/ definicion de try y catch
    {
        val numero: Any = readLine()?.toInt() ?: ""
        println(numero)
        println(Validaciones.esNumero(numero))
    }
    catch (error1:NumberFormatException)
    {
        println(error1)
    }

    val claseUniversalEnMain = ClaseUniversal.create()
}

// the NumberFormatException is thrown when code attempts to convert an invalid
// String into one of the other generic numeric
// wrapper classes, such as Integer, Byte, Long, and so forth.