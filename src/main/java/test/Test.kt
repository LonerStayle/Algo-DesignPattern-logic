import kotlin.time.seconds

import java.util.*
import kotlin.math.min

fun main() {

}


private fun dp11727(){
    val n = readLine()!!.toInt()
    if(n<2){
        println(1)
        return
    }
    val result =  generateSequence(Pair(1,3),
        { Pair(it.second, (it.second + it.first*2)%10007) }).map { it.first }
    println(result.take(n).toList().last())
}

private fun dp2839(){
    val n = readLine()!!.toInt()
    val arr = Array(n + 1) { -1 }

    arr[3] = 1
    //
    if (n < 5) {
        println(when (n) {
            3, 5 -> 1
            else -> -1
        })
        return
    }

    arr[5] = 1
    for (i in 6..n) {
        arr[i] = when {
            arr[i - 3] > 0 && arr[i - 5] > 0 -> min(arr[i - 3], arr[i - 5]) + 1
            arr[i - 3] > 0 -> arr[i - 3] + 1
            arr[i - 5] > 0 -> arr[i - 5] + 1
            else -> -1
        }
    }
    println(arr[n])
}

private fun fibo1003():String {
    val dp = Array(41){IntArray(2)}
    var answer = ""
    with(System.`in`.bufferedReader()) {
        dp[0][0] = 1
        dp[1][1] = 1
        val case = readLine().toInt()
        repeat(case) {
            for (i in 2 until case + 1) {
                for (j in 0 until 2) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 2][j]
                }
            }
            answer = dp[case].joinToString(" ")
        }
    }
    return answer
}



