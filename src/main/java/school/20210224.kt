package school

fun main() {
    plusCycle()
}

//티쳐 코드
private fun oneFor() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }

    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE

    arr.forEach {
        max = Math.max(max, it)
        min = Math.min(min, it)
    }

    println("$min $max")
}

private fun myGarberge() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }
    println("${arr.sorted()[0]} ${arr.sortedDescending()[0]}")
}

//티쳐코드
private fun plusCycle() {
//    val input = readLine()!!.toInt()
//    var cycle = 0
//    var number = input
//
//    do {
//        val first = number / 10
//        val second = number % 10
//        val sum = first + second
//        number = "$second${sum % 10}".toInt()
//        cycle++
//    } while (input != number)
//
//    println(cycle)
}

private fun star13() {
    val input = readLine()!!.toInt()
    for (i in 0 until input) {
        for (j in 0..i) {
            print("*")
        }
        println("")
    }
    for (i in input - 2 downTo 0) {
        for (j in 0..i) {
            print("*")
        }
        println("")
    }
}

private fun star12() {
    val input = readLine()!!.toInt()
    for (i in input - 1 downTo 0) {
        for (j in 0 until i) {
            print(" ")
        }
        for (k in i until input) {
            print("*")
        }
        println("")
    }
    for (i in 1 until input) {
        for (j in 0 until i) {
            print(" ")
        }
        for (k in i until input) {
            print("*")
        }
        println("")
    }
}