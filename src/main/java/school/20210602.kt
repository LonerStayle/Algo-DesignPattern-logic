package school

import kotlin.math.max

fun main() {
    dp2156()
}

private fun dp2579() {
    val n = readLine()!!.toInt()
    val arr = Array(n) { 0 }
    val dp = Array(n) { 0 }

    for (i in 0 until n) {
        arr[i] = readLine()!!.toInt()
    }

    if (n <= 2) {
        println(arr.sum())
        return
    }
    dp[0] = arr[0]
    dp[1] = arr[0] + arr[1]
    dp[2] = max(arr[1] + arr[2], arr[0] + arr[2])


    for (i in 3 until n) {
        dp[i] = max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i])
    }
    println(dp[n - 1])

}

private fun dp2193() {
    val n = readLine()!!.toInt()
    val arr = Array(n) { Array(2) { 0L } }
    if (n < 3) {
        println(1)
        return
    }

    arr[0][0] = 0
    arr[0][1] = 1

    arr[1][0] = 1
    arr[1][1] = 0

    for (i in 2 until n) {
        arr[i][0] = arr[i - 1][0] + arr[i - 1][1]
        arr[i][1] = arr[i - 1][0]
    }

    println(arr[n - 1].sum())
}

private fun dp2156() {
    val n = readLine()!!.toInt()
    val arr = Array(n) { 0 }
    val dp = Array(n) { 0 }
    var result = 0
    for (i in 0 until n) {
        arr[i] = readLine()!!.toInt()
    }
    if (n < 3) {
        println(arr.sum())
        return
    }
    dp[0] = arr[0]
    dp[1] = arr[1] + arr[0]
    dp[2] = max(arr[1] + arr[2], arr[0] + arr[2])
    for (i in 3 until n) {
        dp[i] = max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i])
        dp[i] = max(dp[i - 1], dp[i]);
        result = dp[i]
    }
    println(result)
}



