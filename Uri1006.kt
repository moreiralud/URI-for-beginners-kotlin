import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    val num1: Double = reader.nextDouble()
    val num2: Double = reader.nextDouble()
    val num3: Double = reader.nextDouble()

    val med = num1 + num2 + num3
    val medDiv = med / 3

    println("MEDIA = %.1f".format(medDiv))
}

