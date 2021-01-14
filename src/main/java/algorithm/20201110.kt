package algorithm

import java.util.*


fun main() {

}

private fun plusCycle() {
    val scanner = Scanner(System.`in`)
    var N = scanner.nextInt()
    val copy = N
    var cycle = 0
    while (true) {
        cycle++
        N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10)
        if (copy == N)
            break
    }
    println(cycle)
}

private fun endOfFileExample() {
    val scanner = Scanner(System.`in`)

    while (scanner.hasNextInt()) {
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        println(a + b)
    }
}