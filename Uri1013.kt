import java.lang.StrictMath.abs
import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val a: Int = reader.nextInt()
    var b: Int = reader.nextInt()
    val c: Int = reader.nextInt()

    val maior = (a + b + abs(a - b)) / 2
    val resultado = (maior + c + abs(maior - c)) / 2

    println("$resultado eh o maior")

}