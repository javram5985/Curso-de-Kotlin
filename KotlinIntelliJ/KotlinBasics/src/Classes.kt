//Las clases se utilizan para representar entidades o conceptos, como los sustantivos en el lenguaje. Cada clase es un modelo que define un conjunto de variables -el estado,
// y métodos apropiados para operar con dichos datos -el comportamiento. Cada objeto creado a partir de la clase se denomina instancia de la clase.
class Ejemplo
{
    fun hola()
    {
        println("Hola Kotlin")
    }
}

class Persona constructor(val nombre:String)//el constructor se puede quitar
{
    init//init representa el cuerpo del constructor
    {
        println("Nombre: $nombre")
    }

    constructor(name:String, edad:Int) : this(name)
    {
        println("Nombre: $nombre, edad: $edad")
    }
}

open class Base constructor(val inicial:Int)//open es para que la clase General pueda extenderse y usar esta clase Base
{//Esta seria la clase padre de General
    open fun imprimeAlgo()//open para poder sobreescribirla en General
    {
        println("Algo $inicial")
    }
}

class General constructor(val d:Int) : Base(d)//extendiendo la clase
{
    override fun imprimeAlgo()
    {
        super.imprimeAlgo()
        val suma:Int = 4 + d
        println(suma)
    }
}

fun main(args: Array<String>)
{
    val persona = Persona("Javier", 23)
    val persona2 = Persona("Javer")
    println(persona)
    println(persona2)
    val general = General(9)
    general.imprimeAlgo()
}


//un objeto es una unidad dentro de un programa de computadora que consta de un estado y de un comportamiento,
//que a su vez constan respectivamente de datos almacenados y de tareas realizables durante el tiempo de ejecución.

//un constructor es una subrutina cuya misión es inicializar un objeto de una clase. En el constructor se asignan los valores iniciales del nuevo objeto.