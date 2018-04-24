fun main(args: Array<String>)
{
    for(i in 1..4)
    {
        println(i)
    }
    println()
    for(i in 4 downTo 1)//para forma descendente
    {
        println(i)
    }
    println()
    for (i in 1..4 step 2)//de dos en dos 1 y 3
    {
        println(i)
    }
    println()
    for(i in 4 downTo 1 step 2)
    {
        println(i)
    }
    println()
    for (i in 1 until 10)//123456789, el 10 no cuenta
    {
        println(i)
    }
    val esOnce = (1..12 step 2).last == 11//.last, ve el ultimo numero del rango
    println(esOnce)

}