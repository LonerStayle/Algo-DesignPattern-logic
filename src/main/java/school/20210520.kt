package school

import kotlin.math.min

fun main() {
    dp11727()
}

private fun dp11727(){
    val n = readLine()!!.toInt()
    val arr = Array(n){0}
    if(n <2){
        println(1)
        return
    }
    arr[0]= 1
    arr[1]= 3

    for (i in 2 until arr.size){
        arr[i] = (arr[i - 1 ] +arr[i-2] *2)%10007
    }
    println(arr[arr.size-1])

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