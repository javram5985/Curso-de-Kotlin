import kotlin.math.min

data class Auto1 constructor(val color:String, val llantas:Int, val puertas:Int)

fun main(args: Array<String>) {
    val miAuto = Auto1("rojo", 4, 4)

    miAuto?.let{
        //miAuto.puertas = it.puertas
        it.puertas
        with(it)
        {
            puertas
            color
            llantas
        }
    }

    val resultado = sum(4, 7)
    println(resultado)

    val resultadoMinCuatro = minCuatro("Holas")
    println(resultadoMinCuatro)
}

val sum:(Int, Int) -> Int = {x, y -> x + y}//Lambda

val minCuatro:(String) -> Boolean = {it.length > 4}//it hace referencia al string que estamos metiendo en nuestra funcion