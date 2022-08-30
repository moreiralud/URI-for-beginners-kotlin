import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val x1:Double = reader.nextDouble()
    val y1:Double = reader.nextDouble()

    val x2:Double = reader.nextDouble()
    val y2:Double = reader.nextDouble()

    val resultado = Math.pow(x2-x1,2.0) + Math.pow(y2-y1, 2.0)
    val resultadoRaiz = Math.sqrt(resultado)

    println("%.4f".format(Locale.US,resultadoRaiz))
}
