import kotlin.random.Random

fun main() {
    val a = Array(3) { IntArray(3) }

    for (i in 0..2) {
        for (j in 0..2) {
            a[i][j] = Random.nextInt(1, 10)
            print("${a[i][j]} ")
        }
        println()
    }

    for (i in 0..2) {
        var sumRow = 0
        for (j in 0..2) sumRow += a[i][j]
        println("Сумма строки $i = $sumRow")
    }

    for (j in 0..2) {
        var sumCol = 0
        for (i in 0..2) sumCol += a[i][j]
        println("Сумма столбца $j = $sumCol")
    }

    var diag = 0
    for (i in 0..2) diag += a[i][i]
    println("Сумма диагонали = $diag")
}
