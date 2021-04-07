package school


fun main() {
    val n = readLine()!!.toInt()
//    println(fibo(n))
    println(fiboArray(n))
}

private fun fibo(n:Int):Int{
    if(n <= 2) return 1
    return fibo(n-1) + fibo(n-2)
}

private fun fiboArray(n:Int):Int{
    val arr = Array<Int> (n) {it}
    arr[0] = 1
    arr[1] = 1
    for(i in 2 until n){
        arr[i] = arr[i-1] + arr[i-2]
    }
    return arr[n-1]
}

private fun star8() {
    val read = readLine()!!.toInt()
    for (i in read downTo 1) {
        for (j in 1 until i) {
            print(" ")
        }
        for (k in i..read) {
            print("*")
        }
        for (kk in i + 1..read) {
            print("*")

        }
        println()
    }
    for (i in 2..read) {
        for (j in 1 until i) {
            print(" ")
        }
        for (k in i..read) {
            print("*")
        }
        for (kk in i + 1..read) {
            print("*")

        }
        if (i != read)
            println()
    }
}

private fun star6() {
    val read = readLine()!!.toInt()
    for (i in 1..read) {
        for (j in 1 until i) {
            print(" ")
        }
        for (k in i..read) {
            print("*")
        }
        for (kk in i + 1..read) {
            print("*")

        }
        if (i != read)
            println()
    }
}

private fun star5() {
    val read = readLine()!!.toInt()
    for (i in read downTo 1) {
        for (j in 1 until i) {
            print(" ")
        }
        for (k in i..read) {
            print("*")
        }
        for (kk in i + 1..read) {
            print("*")

        }
        if (i != 1)
            println()
    }
}

private fun star4() {
    val read = readLine()!!.toInt()
    for (i in 1..read) {
        for (j in 1 until i) {
            print(" ")
        }
        for (k in i..read) {
            print("*")
        }
        if (i != read)
            println()
    }
}

private fun star3() {
    val read = readLine()!!.toInt()
    for (i in read downTo 1) {
        for (j in 1..i) {
            print("*")
        }
        if (i != 1)
            println()
    }
}

private fun star2() {
    val read = readLine()!!.toInt()
    for (i in read downTo 1) {
        for (j in 1 until i) {
            print(" ")
        }
        for (k in i..read) {
            print("*")
        }
        if (i != 1)
            println()
    }
}

private fun star1() {
    val read = readLine()!!.toInt()
    for (i in 1..read) {
        for (j in 1..i) {
            print("*")
        }
        if (i != read)
            println()
    }
}