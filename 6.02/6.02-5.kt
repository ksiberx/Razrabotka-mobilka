fun main() {
    val text = readLine()!!
    var result = ""

    for (c in text) {
        if (c in 'a'..'z') {
            result += ((c - 'a' + 3) % 26 + 'a'.code).toChar()
        } else {
            result += c
        }
    }

    println(result)
}
