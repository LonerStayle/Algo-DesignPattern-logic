package school

fun main() {

//    gugu()
//    star1()
//    star2()
//    star3()
//    star4()
    myTeacher2()
}

private fun star4() {

    val n = readLine()!!.toInt()

    for (i in 0 until n) {
        for (j in 0 until i) {
            print(' ')
        }
        for (j in 0 until (n - i)) {
            print('*')
        }
        println()
    }

}

private fun star3() {
    val N = readLine()!!.toInt() // 1
    var star = ""

    for (i in 1..N) {
        for (j in 0..N - i) {
            star += "*"
        }
        println(star)
        star = ""
    }

}


//O(N2)
private fun star2() {
    val N = readLine()!!.toInt() // 1
    var star = ""  //1

    for (i in 1..N) { //n
        for (j in 1..N - i) { //n - i
            star += " " //1
        }
        for (k in 1..i) {  // i
            star += "*"//1
        }
        println(star)//1
        star = ""//1
    }
}


//O(N)
private fun star1() {
    val N = readLine()!!.toInt() // 1
    val star = StringBuffer()
    for (i in 1..N) {
        star.append("*")
        println(star)
    }
}


//O(1)
private fun gugu() {
    val N = readLine()!!.toInt() // 1
    for (i in 1..9) { // 9 * 1
        println("$N * $i = ${N * i}") // 1
    }
}

//fun myTeacher() {
//    val n = readLine()!!.toInt()
//
//    for (i in 1..n) {
//        for (j in 1..(n - i)) {
//            print(' ')
//        }
//        for (j in 1..i) {
//            print('*')
//        }
//        println()
//    }
//}

fun myTeacher2() {
    val n = readLine()!!.toInt()

    for (i in 0 until n) {
        for (j in 0 until i) {
            print(' ')
        }
        for (j in 0 until (n - i)) {
            print('*')
        }
        println()
    }
}

