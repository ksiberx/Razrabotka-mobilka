fun main() {
    for (i in 2..100) {
        var isPrime = true

        for (j in 2..Math.sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) {
                isPrime = false
                break
            }
        }

        if (isPrime) println(i)
    }
}
