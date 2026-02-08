import kotlin.math.PI

fun calculateArea(radius: Double): Double {
    return PI * radius * radius
}

fun calculateArea(width: Double, height: Double): Double {
    return width * height
}

fun calculateArea(base: Double, height: Double, isTriangle: Boolean): Double {
    return (base * height) / 2
}
