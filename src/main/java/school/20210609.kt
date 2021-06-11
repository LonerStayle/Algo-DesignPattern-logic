package school

import kotlin.math.max

fun main() {
    dp11057()
}

fun dp10844() {
    val n = readLine()!!.toInt()
    val arr = Array(101) { Array(11) { 0 } }

    if (n <2) {
        println(9)
        return
    }

    for (i in 1..9) {
        arr[1][i] = 1
    }

    for(i in 2..n){
        arr[i][0] = arr[i-1][1]
        for (j in 1..9){
            arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1])%1000000000
        }
    }

    var sum = 0L

    for (i in 0 until 10){
        sum += arr[n][i]
    }
    println(sum%1000000000)
}

fun dp11057(){

    val n = readLine()!!.toInt()
    val arr = Array(n+1){ Array(11){0L} }

    for (i in 0..9){
        arr[1][i] = 1L
    }
    if(n<2) {
        println(10)
        return
    }

    for (i in 2..n){
        for (j in 0..9){
            for (k in 0 .. j) {
                arr[i][j] += arr[i - 1][k]
            }
            arr[i][j] = arr[i][j]%10007
        }
    }
    println(arr[n].sum()%10007)
}