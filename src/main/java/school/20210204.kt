package school

fun main() {
    //별찍기 5
//    teacher()
    //별찍기 6
//    reverse()
    //별찍기7
//    seven()
//    teacherSever()

    star8()
}

//포문안에 포문은 최대한 없애버리기
private fun star8() {
    val n = readLine()!!.toInt()

    //상단 별
    for (i in 1..n - 1) {
        for (j in 0 until i) {
            print('*')
        }
        for (k in 0 until (n * 2) - (i * 2)) {
            print(' ')
        }
        for (kk in i downTo 1)
            print("*")
        println()
    }
    for (i in 1..n * 2)
        print("*")
    println()

    for (i in (n - 1) downTo 1) {
        for (j in 0 until i) {
            print('*')
        }
        for (k in 0 until (n * 2) - (i * 2)) {
            print(' ')
        }
        for (kk in i downTo 1)
            print("*")
        println()
    }
}

private fun teacherSever() {
    val n = readLine()!!.toInt()
    //상단 별
    for (i in 1 until n) {
        for (j in 0 until n - i) {
            print(' ')
        }
        for (k in 0 until 2 * i - 1) {
            print("*")
        }
        println()
    }
    //중간별
    for (i in 1 until (n * 2))
        print("*")
    println()

    //하단별
    for (i in n - 1 downTo 1) {
        for (j in 0 until n - i) {
            print(' ')
        }
        for (k in 0 until 2 * i - 1)
            print("*")
        println()
    }

}

//O(n^4)
//my coding
private fun seven() {
    val n = readLine()!!.toInt() //1

    for (i in 1..n) {//n
        for (j in 0 until n - i) {//n
            print(' ')
        }
        for (k in 0 until 2 * i - 1) {//1
            print('*')
        }
        println() //1
        if (i == n) {
            for (i in (n - 1) downTo 1) { //n
                for (j in 0 until n - i) { //n
                    print(' ')
                }
                for (j in 0 until 2 * i - 1) {
                    print('*')
                }
                println() //1
            }
        }
    }
}

//O(n^2)
private fun reverse() {
    val n = readLine()!!.toInt() //1

    for (i in n downTo 1) { //n
        for (j in 0 until n - i) { //n
            print(' ')
        }
        for (j in 0 until 2 * i - 1) {
            print('*')
        }
        println() //1
    }

}

private fun teacher() {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        for (j in 0 until n - i) {
            print(' ')
        }
        for (j in 0 until 2 * i - 1) {
            print('*')
        }
        println()
    }
}
