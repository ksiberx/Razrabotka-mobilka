fun printPersonInfo(name: String, age: Int = 18, city: String = "Неизвестно") {
    println("Имя: $name, Возраст: $age, Город: $city")
}

fun main() {
    printPersonInfo(
        city = "Казань",
        name = "Дима",
        age = 30
    )
}
