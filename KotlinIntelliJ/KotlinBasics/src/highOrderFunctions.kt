fun suma(num1:Int, num2:Int, func:() -> Unit)//func() -> lambda, siempre le tenemos que decir que va a retornar
{
    func()
    println("Suma de $num1 y $num2 es igual a ${num1 + num2}")
}

fun String.funcion(func:(String) -> Unit)
{
    func(this)
    println(this.length)
}

fun main(args: Array<String>)
{
    suma(6,8)
    {//todo lo que esta en estos brackets es una funcion que se va a ejecutar inmediatamente despues del println
        6 + 9
        if("".isBlank())
            println("True")
        println("Funcion de orden mayor")
    }

    "Hola".funcion {
        println(it)
    }

    with("hola")
    {
        println(length)
    }
}