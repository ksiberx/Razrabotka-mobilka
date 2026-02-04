import kotlin.random.Random

fun main() {
    val secret = Random.nextInt(1, 101)
    var tries = 0
    var guess: Int

    do {
        guess = readLine()!!.toInt()
        tries++

        when {
            guess > secret -> println("Меньше")
            guess < secret -> println("Больше")
        }
    } while (guess != secret)

    println("Угадал за $tries попыток")
}
