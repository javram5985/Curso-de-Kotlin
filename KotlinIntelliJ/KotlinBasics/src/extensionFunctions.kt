//Con las extension functions puedes agregar mas capacidades y características a los objetos.
fun main(args: Array<String>)
{
    "Hola mi nombre es Javier".print()
    println(4.multiply(2))
    println(4 multiply 5)//Lo que hace el infix

    val listaNombres:MutableList<String> = mutableListOf("Zelt", "Rodrigo", "Talon", "Angel")
    listaNombres.swap(0,2)
    println(listaNombres)

    //substring
    val myString = "Hello everyone"
    val result = myString.removeFirstLastChar()
    println("First character is: $result")

}

fun String.print()
{
    println(this) //this hara referencia al String
}

 infix fun Int.multiply(numM:Int):Int
{
    return this * numM //this hace referencia al Int
}

fun <T> MutableList<T>.swap(index1:Int, index2:Int)//genericos
{
    val tmp:T = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

//Substring: A substring of a string S is a string S'
// that occurs "in" S. For example, "the best of" is
// a substring of "It was the best of times".
//startIndex: the start Index, endIndex: the end Index

fun String.removeFirstLastChar():String
{
    return this.substring(1, (this.length - 1))
}
