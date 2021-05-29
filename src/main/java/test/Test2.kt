package test

fun main() {
    dp1003()
}

private fun dp1003() {
    val n = readLine()!!.toInt()
    val arr = Array(n + 1) { 0 }
    if (n < 3) {
        println(n)
        return
    }
    arr[1] = 1
    arr[2] = 2

    for (i in 3..n) {
        arr[i] = (arr[i - 2] + arr[i - 1]) % 15746
    }
    println(arr[n])
}