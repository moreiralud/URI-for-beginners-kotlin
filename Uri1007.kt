import java.util.Scanner

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val int1: Int = reader.nextInt()
    val int2: Int = reader.nextInt()
    val int3: Int = reader.nextInt()
    val int4: Int = reader.nextInt()

    val soma = (int1*int2) - (int3*int4)

    println("DIFERENCA = $soma")

}