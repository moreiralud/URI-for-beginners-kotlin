import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    val cod:Int = reader.nextInt()
    val quant:Int = reader.nextInt()
    val valor:Double = reader.nextDouble()

    val cod2:Int = reader.nextInt()
    val quant2:Int = reader.nextInt()
    val valor2:Double = reader.nextDouble()


    val valorDosProDOS: Double
    valorDosProDOS = (quant * valor) + (quant2 * valor2 )

    print("VALOR A PAGAR: R$ %.2f".format(valorDosProDOS))

}