import kotlin.math.PI

fun calculateCircleArea(radius: Double): Double {
    return PI * radius * radius
}

fun main() {
    println(calculateCircleArea(5.0))
    println(calculateCircleArea(10.0))
    println(calculateCircleArea(2.5))
}
