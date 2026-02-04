fun main() {
    val text = generateSequence { readLine() }
        .takeWhile { it.isNotEmpty() }
        .joinToString(" ")

    println("Символов: ${text.length}")
    println("Слов: ${text.split(" ").size}")
    println("Предложений: ${text.count { it == '.' || it == '!' || it == '?' }}")
}
