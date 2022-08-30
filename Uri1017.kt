import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val spentTime: Int = reader.nextInt()
    val kmHour: Int = reader.nextInt()

    val resultado: Float = (spentTime * kmHour).toFloat()
    val resultadoFinal = (resultado / 12)

    println("%.3f".format(resultadoFinal))
}