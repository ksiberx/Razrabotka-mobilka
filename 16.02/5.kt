fun calculateAverage(vararg numbers: Int): Double {
    return numbers.average()
}

fun main() {
    println(calculateAverage(1, 2, 3))
    println(calculateAverage(10, 20, 30, 40, 50))
    println(calculateAverage(5, 5, 5, 5))
}
