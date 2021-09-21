package school

import kotlin.math.min

fun main() {
    dp1520()
}

fun sugar() {
    val n = readLine()!!.toInt()
    val arr = Array(n + 1) { -1 }
    when {
        n < 3 -> {
            println(-1)
            return
        }
        n < 5 && n != 3 -> {
            println(-1)
            return
        }
        n < 5 && n == 3 -> {
            println(1)
            return
        }
    }
    arr[3] = 1
    arr[5] = 1


    for (i in 6..n) {
        //6
        arr[i] = when {
            //둘다 값은 수 일때
            arr[i - 3] > 1 && arr[i - 5] > 1 -> min(arr[i - 3], arr[i - 5]) + 1
            arr[i - 3] > 0 -> arr[i - 3] + 1
            arr[i - 5] > 0 -> arr[i - 5] + 1
            else -> -1
        }
    }

    println(arr.last())


}

fun `9095`() {
    val n = readLine()!!.toInt()
    val arr = Array(11) { 0 }
    if (n == 1) {
        return println(1)
    }
    if (n == 2) {
        return println(2)
    }
    if (n == 3) {
        return println(4)
    }

    arr[0] = 1
    arr[1] = 2
    arr[2] = arr[0] + arr[1] + 1

    for (i in 3 until n) {
        arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3]
    }
    println(arr[n - 1])
}

fun onePlus() {
    val n = readLine()!!.toInt()
    val arr = Array(n + 4) { 0 }

    arr[1] = 1
    arr[2] = 1
    arr[3] = 1
    for (i in 4..n) {
        arr[i] = when {
            i % 3 == 0 && i % 2 == 0 -> min(arr[i / 3], min(arr[i / 2], arr[i - 1])) + 1
            i % 3 == 0 && i % 2 != 0 -> min(arr[i / 3], arr[i - 1]) + 1
            i % 3 != 0 && i % 2 == 0 -> min(arr[i / 2], arr[i - 1]) + 1
            else -> arr[i - 1] + 1
        }
    }
    println(arr[n])
}

fun dp1520() {
    val mn = readLine()!!.split(" ").map { it.toInt() }
    val arrArr = Array(mn[0]) { arrayOf<Int>() }
    val resultArr = Array(mn[0]) { Array(mn[1]) { 0 } }
    repeat(mn[0]) {
        val arr = readLine()!!.split(" ").map { it.toInt() }
        arrArr[it] = arr.toTypedArray()
    }
//    4 5
//    50 45 37 32 30
//    35 50 40 20 25
//    30 30 25 17 28
//    27 24 22 15 10

    arrArr[0][0] = 1

    for (m in 1..arrArr.size) {
        for (n in 1..m) {
            resultArr[m][n] = when {
                arrArr[m][n] > arrArr[m - 1][n] -> resultArr[m - 1][n] + resultArr[m][n - 1]
                arrArr[m][n] < arrArr[m - 1][n] -> resultArr[m - 1][n]
                arrArr[m][n] > arrArr[m][n - 1] -> resultArr[m - 1][n] + resultArr[m][n - 1]
                arrArr[m][n] < arrArr[m][n - 1] -> resultArr[m - 1][m]
                else -> 0
            }
        }
    }

    println(resultArr[mn[0]][mn[1]])


}
