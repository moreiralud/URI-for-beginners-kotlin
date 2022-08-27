import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    val num1: Double = reader.nextDouble()
    val num2: Double = reader.nextDouble()

    val med = (num1 * 3.5) + (num2 * 7.5)
    val medDiv = med / 11

    println("MEDIA = %.5f".format(medDiv))
}

