fun filterList(list: List<Int>, predicate: (Int) -> Boolean): List<Int> {
    return list.filter(predicate)
}

fun main() {
    val numbers = listOf(3, 6, 9, 12, 15, 18)

    println(filterList(numbers) { it % 2 == 0 })
    println(filterList(numbers) { it > 10 })
    println(filterList(numbers) { it in 5..15 })
}
