package school

import kotlin.math.min

fun main() {
    dp11726()
}


private fun dp2839() {
    //18
    val n = readLine()!!.toInt()
    //n == 19
    val arr = Array(n + 1) { -1 }

    if (n < 5) {
        println(
            when (n) {
                3, 5 -> 1
                else -> -1
            }
        )
        return
    }
    arr[3] = 1
    arr[5] = 1
    //18
    for (i in 6..n) {
        //6
        arr[i] = when {
            //둘다 값은 수 일때
            arr[i - 3] > 0 && arr[i - 5] > 0 -> min(arr[i - 3], arr[i - 5]) + 1
            arr[i - 3] > 0 -> arr[i - 3] + 1
            arr[i - 5] > 0 -> arr[i - 5] + 1
            else -> -1
        }
    }
    println(arr[n])
}


fun dp9095() {
    val testcase = readLine()!!.toInt()

    for (i in 1..testcase) {
        val n = readLine()!!.toInt()
        val arr = Array(n + 1) { 0 }
        if (n < 3) {
            when (n) {
                1 -> println(1)
                2 -> println(2)
                3 -> println(4)
            }
            continue
        }
        //1
        arr[0] = 1
        //2
        arr[1] = 2
        //4
        arr[2] = arr[0] + arr[1] + 1
        for (j in 3 until n) {
            arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3]
        }


        println(arr[n - 1])
    }
}

private fun dp11726() {
    val n = readLine()!!.toInt()
    val arr = Array(n + 1) { 0 }
    arr[0] = 1
    arr[1] = 3
    println(arr[0] * 2 + arr[1])
    for (i in 2..n) {
        arr[i] = (arr[i - 1] + arr[i - 2] * 2) % 10007
    }
    println(arr[n])
}