fun main() {
    print("Начало: ")
    val start = readLine()!!.toInt()

    print("Конец: ")
    val end = readLine()!!.toInt()

    for (i in start..end step 2) {
        if (i % 3 == 0) {
            println(i)
        }
    }
}
