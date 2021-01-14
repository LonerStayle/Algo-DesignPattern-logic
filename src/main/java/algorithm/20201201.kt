package algorithm

import java.util.*


fun main() {
    arrayMax()
}
//2562 백준
private fun arrayMax() {
    val scan = Scanner(System.`in`)
    val arr = IntArray(9){scan.nextInt()}

    scan.close()
    var index = 0
    var max = arr[0]
    for((i,element) in arr.withIndex()){
        if(max<element) {
            max = element
            index = i
        }
    }
    println(max)
    println(index+1)
}

//10818 백준
private fun arrayMinMax() {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = scan.nextInt()
    }
    scan.close()
    Arrays.sort(arr)
    print(arr[0].toString() + " " + arr[n - 1])
}
