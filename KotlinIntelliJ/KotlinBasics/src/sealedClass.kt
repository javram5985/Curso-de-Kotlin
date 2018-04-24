sealed class Intencion
{
//    class Refrescar:Intencion()
//    class RecargarMas: Intencion()

    object Recargar2:Intencion()
    {
        override fun log(){
            println("Refrescando")
        }
    }

    object CargarMasDatos:Intencion()
    {
        override  fun log()
        {
            println("Cargar Mas datos")
        }
    }

    data class Error(val razon:String) :Intencion()
    {
        override fun log()
        {
            println("$razon")
        }
    }
    abstract fun log()
}

fun main(args: Array<String>)
{
//    val intencion:Intencion = Intencion.RecargarMas()
//
//    val output = when(intencion)
//    {
//        is Intencion.Refrescar -> "refresh"
//        is Intencion.RecargarMas -> "cargar mas data"
//    }
//
//    println(output)

    val intencion:Intencion = Intencion.Error("Me quede sin internet")
    val output = when(intencion)
    {
        is Intencion.CargarMasDatos -> "Carga mas Datos"
        is Intencion.Recargar2 -> "Recargar mas datos"
        is Intencion.Error -> "Error"
    }

    intencion.log()

    println(output)
}