fun main() {
    println("1 — секунды в часы")
    println("2 — часы в секунды")

    when (readLine()!!.toInt()) {
        1 -> {
            val s = readLine()!!.toInt()
            println("${s / 3600}:${(s % 3600) / 60}:${s % 60}")
        }
        2 -> {
            val h = readLine()!!.toInt()
            val m = readLine()!!.toInt()
            val s = readLine()!!.toInt()
            println(h * 3600 + m * 60 + s)
        }
    }
}
