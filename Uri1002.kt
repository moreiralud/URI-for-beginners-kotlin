import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val r = scanner.next()
    calcArea(r.toDouble())
}

fun calcArea(r: Double) {
    val n: Double = 3.14159
    val r2 = r * r
    val A = n * r2
    println("A = $A")

}