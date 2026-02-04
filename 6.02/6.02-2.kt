import kotlin.random.Random

fun main() {
    val arr = IntArray(10) { Random.nextInt(1, 101) }

    println(arr.joinToString())

    println("Максимум: ${arr.maxOrNull()}")
    println("Минимум: ${arr.minOrNull()}")
    println("Среднее: ${arr.average()}")
    println("Чётных: ${arr.count { it % 2 == 0 }}")
}
