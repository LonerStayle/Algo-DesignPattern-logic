package school


fun main() {


//    myGarbegeCode2()

    /** 백준 문자열 곱셈*/
//    MyTeacherCode()
    myGarbegeCode()

}

/** 백준 9498번*/
//O(1)
private fun myGarbegeCode2() {
    //when 안에서 의미를 알게하기위해 객체 네이밍 변수로 넘겨주는게좋음
    val score = readLine()!!.toInt()
    val result = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
    println(result)
}

// O(n)
private fun MyTeacherCode() {
    val a = readLine()!!.toInt()
    val b = readLine()!!
    for (el in b.reversed().map { "$it".toInt() }) {
        println(el * a)
    }
    println(a * b.toInt())
//    val a = readLine()!!.toInt()
//    val b = readLine()!!
//
//    for (el in b.reversed().map { "$it".toInt() }) {
//        println(el * a)
//    }
//    println(a * b.toInt())
}

//O(mn)
private fun myGarbegeCode() {
    val a = readLine()!!
    val b = readLine()!!
    val newA = a.reversed()
    val newB = b.reversed()

    var number = 1
    var result = 0

    for ((i, two) in newB.withIndex()) {
        for (one in newA) {
            result += two.toString().toInt() * one.toString().toInt() * number
            number *= 10
        }
        println(result)
        result = 0
        number = 1
        if (i == 2)
            println(a.toInt() * b.toInt())
    }
}

