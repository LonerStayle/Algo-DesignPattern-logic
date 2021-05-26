import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.min

object Main {
    /*
	 * 함수 w에서 a, b, c 중 20이 넘어가게 되면 w(20, 20, 20)을 호출하고,
	 * 0 이하일 경우는 1을 반환하기 때문에
	 * 각 배열의 크기가 21 (0~20)을 넘기지 않는다.
	 */
    var dp = Array(21) { Array(21) { IntArray(21) } }

    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        while (true) {
            val a = `in`.nextInt()
            val b = `in`.nextInt()
            val c = `in`.nextInt()

            // -1 -1 -1 이 나오면 종료
            if (a == -1 && b == -1 && c == -1) {
                break
            }
            System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c))
        }
    }

    fun w(a: Int, b: Int, c: Int): Int {

        // a, b, c가 범위를 벗어나지 않으면서 메모이제이션이 되어있는 경우
        if (inRange(a, b, c) && dp[a][b][c] != 0) {
            return dp[a][b][c]
        }
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1
        }
        if (a > 20 || b > 20 || c > 20) {
            return w(20, 20, 20).also { dp[20][20][20] = it }
        }
        return if (b in (a + 1) until c) {
            w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c).also {
                dp[a][b][c] = it
            }
        } else w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c- 1).also {
            dp[a][b][c] = it
        }
    }
    fun inRange(a: Int, b: Int, c: Int): Boolean {
        return a in 0..20 && 0 <= b && b <= 20 && 0 <= c && c <= 20
    }
}
fun main() {
dp9184()
}

private fun dp1003() = with(BufferedReader(InputStreamReader(System.`in`))) {
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


private fun dp9184(){
    val arr  = Array(21) { Array(21) { IntArray(21) } }
    fun w(a:Int,b:Int,c:Int):Int{

        return when{
            a<=0 || b<=0 || c<=0->  1
            a>20 || b>20 || c>20 -> w(a,b,c)
            b in (a + 1) until c -> w(20,20,20)
            else ->{
                if (arr[a][b][c] != 0) {
                     arr[a][b][c]
                }
                arr[a][b][c] = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1)
                 arr[a][b][c]
            }
        }


    }

    while (true){
        val n = readLine()
        if(n == "-1 -1 -1") break
        val input = n!!.split(" ").map { it.toInt() }.toTypedArray()
        println("w(${input[0]} ,${input[1]} ,${input[2]} ) = ${w(input[0],input[1],input[2])}")
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

//    val arr = Array(n + 1) { -1 }
//
//    arr[3] = 1
//    //
//    if (n < 5) {
//        println(when (n) {
//            3, 5 -> 1
//            else -> -1
//        })
//        return
//    }
//
//    arr[5] = 1
//    for (i in 6..n) {
//        arr[i] = when {
//            arr[i - 3] > 0 && arr[i - 5] > 0 -> min(arr[i - 3], arr[i - 5]) + 1
//            arr[i - 3] > 0 -> arr[i - 3] + 1
//            arr[i - 5] > 0 -> arr[i - 5] + 1
//            else -> -1
//        }
//    }
//    println(arr[n])
}

private fun fibo1003(): String {
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




