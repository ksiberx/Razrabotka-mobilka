fun printPersonInfo(name: String, age: Int = 18, city: String = "Неизвестно") {
    println("Имя: $name, Возраст: $age, Город: $city")
}

fun main() {
    printPersonInfo("Алексей", 25, "Москва")
    printPersonInfo("Мария", 20)
    printPersonInfo("Олег")
}
