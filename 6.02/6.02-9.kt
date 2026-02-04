fun main() {
    val n = readLine()!!.toInt()

    var a = 0
    var b = 1

    for (i in 1..n) {
        val c = a + b
        a = b
        b = c

        if (c % 2 != 0) continue
        if (c <= 50 || c >= 200) continue

        println(c)
    }
}
