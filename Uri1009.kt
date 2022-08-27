import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    val firstName:String = reader.nextLine()
    var salary:Double = reader.nextDouble()
    val bonus:Double = reader.nextDouble()

    salary += (bonus * 0.15)

    println("TOTAL = R$ %.2f".format(salary))

}