// Se utiliza el tipo de dato Unit cuando una función no retorna valor, por lo que podemos decir que Unit es similar a Void en Java
fun hello():Unit
{
    println("Hola a todos")
}

fun suma(a:Int, b:Int)
{
    println("La suma de $a y $b es igual a ${a + b}")
}

//fun max(a:Int, b:Int):Int
//{
//    if(a > b)//Kotlin marca el if, eso quiere decir que estas lineas de codigo se pueden mejorar, alt enter, primera opcion
//    {
//        return a
//    } else {
//        return b
//    }
//}

//fun max(a:Int, b:Int):Int
//{
//    return if(a > b)
//    {
//        a //gracias a la mejora el return lo puso antes del if y no antes del a
//    } else {
//        b
//    }
//}//Esto se puede mejorar aun mas:

fun max(a:Int, b:Int) = if(a > b) a else b


fun main(args: Array<String>)
{
    println(max(4, 1))
}

