fun main(args: Array<String>)
{
    val arrA:IntArray = intArrayOf(1,25,245,54,124,9)//intArrayOf nos crea un arreglo de numeros enteros
    val listA:ArrayList<String> = arrayListOf<String>("Hola", "Kotlin", "Java", "Android")//lista de Strings

    //acceder a datos del arreglo
    val num:Int = arrA[0]
    //reasignar valores del arreglo
    arrA.set(2, 500)
    arrA[3] = 60

    //agregar mas valores al arreglo, las de arriba no se pueden agregar mas numeros porque no son mutable
    val mutableList = mutableListOf(2,3,4,5,6,7)
    mutableList.add(9)
    mutableList.add(2,10)
    mutableList[0] = 1

    //mapas
    val map:MutableMap<String,Int> = mutableMapOf<String, Int>(Pair("Key",30))
    map.put("key2", 40)
}

