package school

import kotlin.math.max


fun main() {
}



private fun dp9095A() {
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        val arrSize = readLine()!!.toInt()

        //arrSize에 3 이하로 넣으면 죽기 떄문에 예외처리 해줘야된다
        if (arrSize <=3) {
            println(
                when (arrSize) {
                    1 -> 1
                    2 -> 2
                    3 -> 4
                    else -> 0
                }
            )
            continue
        }
        val arr = Array(arrSize) { 0 }
        arr[0] = 1
        arr[1] = 2
        arr[2] = 4

        for (j in 3 until arr.size)
            arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3]
        println(arr[arr.size - 1])
    }
}


private fun dp1932() {
    val n = readLine()!!.toInt()
    val arr = Array(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        val tep = readLine()!!.split(" ").map { it.toInt() }
        for (j in 0..i) {
            arr[i][j] = tep[j]
        }
    }

    for (i in 1 until n) {
        for (j in 0..i) {
            arr[i][j] += when (j) {
                0 -> arr[i - 1][j]
                i -> arr[i - 1][j - 1]
                else -> max(arr[i - 1][j - 1], arr[i - 1][j])
            }
        }
    }
    println(arr[n - 1].maxOrNull())
}



private fun fiboArray(n: Int): Int {
    val arr = Array<Int>(n) { it }
    arr[0] = 1
    arr[1] = 1
    for (i in 2 until n) {
        arr[i] = arr[i - 1] + arr[i - 2]
    }
    return arr[n - 1]
}