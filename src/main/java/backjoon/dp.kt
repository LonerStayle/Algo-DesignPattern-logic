import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max
import kotlin.math.min


fun main() {
dp10844()
}


private fun dp11726() {
    val n = readLine()!!.toInt()
    val arr = Array(n + 1) { 0 }

    if (n < 3) {
        println(n)
        return
    }
    arr[1] = 1
    arr[2] = 2

    for (i in 3..n) {
        arr[i] = (arr[i - 1] + arr[i - 2]) % 10007
    }
    println(arr[n])
}

//0일때 0이 +1 1일때 1이 +1
private fun dp1003Kotlin() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val arr = Array(41) { 0 to 0 }.also {
        it[0] = 1 to 0
        it[1] = 0 to 1
    }
    repeat(arr.size) { pos ->
        if (pos > 1)
            arr[pos] = arr[pos - 1].first + arr[pos - 2].first to arr[pos - 1].second + arr[pos - 2].second
    }
    repeat(this.readLine().toInt()) {
        val n = this.readLine().toInt()
        println("${arr[n].first} ${arr[n].second}")
    }
}

//메모제이션 관련 문제
private fun dp9184() {
    val arr = Array(21) { Array(21) { IntArray(21) } }
    fun w(a: Int, b: Int, c: Int): Int {

        return when {
            a <= 0 || b <= 0 || c <= 0 -> 1
            a > 20 || b > 20 || c > 20 -> w(a, b, c)
            b in (a + 1) until c -> w(20, 20, 20)
            else -> {
                if (arr[a][b][c] != 0) {
                    arr[a][b][c]
                }
                arr[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1)
                arr[a][b][c]
            }
        }

    }

    while (true) {
        val n = readLine()
        if (n == "-1 -1 -1") break
        val input = n!!.split(" ").map { it.toInt() }.toTypedArray()
        println("w(${input[0]} ,${input[1]} ,${input[2]} ) = ${w(input[0], input[1], input[2])}")
    }
}


private fun dp11727() {
    val n = readLine()!!.toInt()
    if (n < 2) {
        println(1)
        return
    }

    val result = generateSequence(Pair(1, 3),
        { Pair(it.second, (it.second + it.first * 2) % 10007) }).map { it.first }
    println(result.take(n).toList().last())
}

private fun dp2839() {
    val n = readLine()!!.toInt()
    val arr = Array(n + 1) { -1 }
    arr[3] = 1
    if (n < 5) {
        println(
            when (n) {
                3, 5 -> 1
                else -> 0
            }
        )
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

private fun dp1003(): String {
    val dp = Array(41) { IntArray(2) }
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

private fun dp1904() {
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

private fun dp1149() {
    val n = readLine()!!.toInt()
    val arr = Array(1001) { Array(3) { 0 } }
    val result = Array(1001) { Array(3) { 0 } }
    val sc = Scanner(System.`in`)
    for (i in 1..n) {
        for (j in 0..2) {
            arr[i][j] = sc.nextInt()
        }
    }

    for (i in 1..n) {
        result[i][0] = min(result[i - 1][1], result[i - 1][2]) + arr[i][0]
        result[i][1] = min(result[i - 1][0], result[i - 1][2]) + arr[i][1]
        result[i][2] = min(result[i - 1][0], result[i - 1][1]) + arr[i][2]
    }
    println(result[n][0].coerceAtMost(result[n][1].coerceAtMost(result[n][2])))
}

private fun dp2579() {
    val n = readLine()!!.toInt()
    val arr = Array(301) { 0 }
    val result = Array(301) { 0 }
    for (i in 1..n) {
        arr[i] = readLine()!!.toInt()
    }
    result[1] = arr[1]
    result[2] = max(arr[1] + arr[2], arr[2])
    result[3] = max(arr[1] + arr[3], arr[2] + arr[3])

    for (i in 4..n) {
        //result[i-3]+arr[i-1]는 마지막 이전 계단
        //result[i-2]는 마지막의 이전 이전 계단
        result[i] = arr[i] + max(result[i - 3] + arr[i - 1], result[i - 2])
    }
    println(result[n])
}

private fun dp10870() {
    val arr = Array(21) { 0 }
    val n = readLine()!!.toInt()
    arr[1] = 1
    arr[2] = 1
    for (i in 3..n) {
        arr[i] = arr[i - 1] + arr[i - 2]
    }
    println(arr[n])
}

private fun dp11053() {
    val n = readLine()!!.toInt()
    val arr = Array(n + 1) { 0 }
    val result = IntArray(n + 1) { 1 }
    val valueList = readLine()!!.split(" ").map { it.toInt() }

    for (i in 0 until n) {
        arr[i] = valueList[i]
    }

    for (i in 0 until n) {
        for (j in 0 until i) {
            if (arr[i] > arr[j] && result[i] < result[j] + 1)
                result[i] = result[j] + 1
        }
    }
    println(result.maxOf { it })
}

private fun dp1912() {
    val n = readLine()!!.toInt()
    val arr = Array(n + 1) { 0 }
    val valueList = readLine()!!.split(" ").map { it.toInt() }
    val result = IntArray(n + 1) { 0 }
    for (i in 0 until n) {
        arr[i] = valueList[i]
    }
    result[0] = arr[0]
    var max = arr[0]
    for (i in 1 until n) {
        // (이전 dp + 현재 arr값) 과 현재 arr값 중 큰 것을 dp에 저장
        result[i] = max(result[i - 1] + arr[i], arr[i])
        max = max(max, result[i])
    }
    println(max)

}

private fun dp10844() {
    val n = readLine()!!.toInt()
    val dp = Array(101) { LongArray(11) { 0 } }

    // dp[N][L] = dp[N - 1][L - 1] + dp[N - 1][L + 1]
    // 길이 N, 마지막 숫자가 L일 경우
    for (i in 1..9) {
        dp[1][i] = 1
    }
    if(n == 1) {
        println(9)
        return
    }
    for (i in 2..n) {
        dp[i][0] = dp[i - 1][1];
        for (j in 1..9) {
            dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
        }
    }

    var sum = 0L
    for (i in 0 until 10) {
        sum += dp[n][i];
    }
    println(sum % 1000000000);
}


