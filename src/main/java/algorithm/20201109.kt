package algorithm

import java.util.*


fun main() {

}

private fun aplustbzero() {
    val scanner = Scanner(System.`in`)
    while (true) {
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        if (a == 0 && b == 0) break
        println(a + b)
    }
}

private fun xFind() {
    val `in` = Scanner(System.`in`)
    val N = `in`.nextInt()
    val X = `in`.nextInt()
    val A: MutableList<Int> = mutableListOf()

    for (i in 0 until N) {
        A.add(`in`.nextInt())
    }

    `in`.close()

    for (i in A.indices) {
        if (A[i] < X)
            print(A[i].toString() + " ")
    }
}
