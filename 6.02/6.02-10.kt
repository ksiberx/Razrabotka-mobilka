fun main() {
    val pass = readLine()!!

    if (pass.length < 8) println("Мало символов")
    if (!pass.any { it.isDigit() }) println("Нет цифры")
    if (!pass.any { it.isUpperCase() }) println("Нет заглавной буквы")
    if (!pass.any { it in "!@#$%^&*" }) println("Нет спецсимвола")
}
