fun main() {
    val parts = readLine()!!.split(" ")

    var result = parts[0].toDouble()

    var i = 1
    while (i < parts.size) {
        val op = parts[i]
        val num = parts[i + 1].toDouble()

        result = when (op) {
            "+" -> result + num
            "-" -> result - num
            "*" -> result * num
            "/" -> result / num
            else -> result
        }

        println("Шаг: $result")
        i += 2
    }

    println("Ответ: $result")
}
