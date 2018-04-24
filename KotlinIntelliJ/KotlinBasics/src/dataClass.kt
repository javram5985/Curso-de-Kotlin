data class Auto constructor(var marca:String, private var puertas:Int)
{
    var numPuertas = puertas
    get()
    {
        return if(field > 0) field else 1
    }//field hace referencia al numPuertas
}

data class Persona2 constructor(var name:String, val age:Int, val colorOjos:String)

fun main(args: Array<String>)
{
    val auto = Auto("Ford", 0)
    var marca:String = auto.marca
    auto.marca = "BMW"
    auto.numPuertas = 3
    auto.hashCode()
    println(auto.toString())
    println(auto.numPuertas)


    val mabel = Persona2("Mabel", 24, "verdes")
    println(mabel)
    //copy, lo va a copiar y podremos sobreescribir sobre el:
    val marala:Persona2  = mabel.copy("Marala")
    println(marala)
    println("--------------")
    val darla:Persona2 = mabel
    darla.name = "Darla"
    println(mabel)
    println(marala)
    println(darla)
}