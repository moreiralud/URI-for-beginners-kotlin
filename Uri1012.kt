import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    val pi:Float = 3.14159F

    val A: Double = reader.nextDouble()
    val B: Double = reader.nextDouble()
    val C: Double = reader.nextDouble()


    val triangle = A * C/2
    val areaOfCircleC = pi * C * C
    val areaTrapezium = (A + B)* C/2
    val square = B*B
    val areaOfRectangle = A *B

    println("TRIANGULO: %.3f".format(Locale.ENGLISH,triangle))
    println("CIRCULO: %.3f".format(Locale.ENGLISH,areaOfCircleC))
    println("TRAPEZIO: %.3f".format(Locale.ENGLISH,areaTrapezium))
    println("QUADRADO: %.3f".format(Locale.ENGLISH,square))
    println("RETANGULO: %.3f".format(Locale.ENGLISH,areaOfRectangle))

}


