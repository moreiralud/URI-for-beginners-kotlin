import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    val pi = 3.14159
    val radius: Float = reader.nextFloat()
    val radius3: Float = radius * radius * radius

    val calcVolume:Double = (4.0/3) * pi * radius3

    print("VOLUME = %.3f".format(Locale.ENGLISH, calcVolume))

}