import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val number: Int = reader.nextInt()
    val hour: Int = reader.nextInt()

    val workedHour: Float = reader.nextFloat()

    val salary = hour * workedHour

    println("NUMBER = $number")
    println("SALARY = U$ %.2f".format(salary))
}