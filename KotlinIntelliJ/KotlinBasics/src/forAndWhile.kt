fun main(args: Array<String>)
{
    val listaNumeros = intArrayOf(1,2,3,4,5,6)

    for (i in listaNumeros.indices)
    {
        print(listaNumeros[i])
    }

    val frutas = listOf<String>("Manzana", "Pera", "Uvas", "Banano")

    for (i in frutas)
    {
        println(i)
    }

    var x:Int = 3
    while(x > 0)
    {
        x--
        println(x)
    }

    var suma:Int = 0
    var input:String? = ""
    do
    {
        print("Ingresa un numero: ")
        input = readLine()
        suma += input?.toInt() ?:0//lo vamos a ver mas adelante
    }
    while(input != "0")
    println("La suma es: $suma")
}