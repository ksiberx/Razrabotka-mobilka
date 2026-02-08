fun createCounter(start: Int): () -> Int {
    var count = start
    return {
        count++
    }
}

fun main() {
    val counter = createCounter(5)
    println(counter()) // 6
    println(counter()) // 7
    println(counter()) // 8
}
