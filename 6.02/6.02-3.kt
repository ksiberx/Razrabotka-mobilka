fun main() {
    print("Число: ")
    val number = readLine()!!.toInt()

    print("Система (2, 8, 16): ")
    val base = readLine()!!.toInt()

    var n = number
    var result = ""

    while (n > 0) {
        result = (n % base).toString() + result
        n /= base
    }

    println("Результат: $result")
}
