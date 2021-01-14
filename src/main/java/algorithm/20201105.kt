package algorithm

import java.util.*


fun main() {
starMakingTwo()
}


private fun starMakingTwo() {
        val scan = Scanner(System.`in`)
        val num = scan.nextInt()
        for (i in 0 until num) {
            for (j in i + 1 until num) {
                print(" ")
            }
            for (k in num - i..num) {
                print("*")
            }
            println()
        }
    }


//기억해두자 괜찮네.
private fun starMaking(){
    val scanner = Scanner(System.`in`)
    val t = scanner.nextInt()
    for (i in 1..t) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}
private fun kotlinVersionTwo(){
    val `in` = Scanner(System.`in`)
    val t:Int = `in`.nextInt()
    for (i in 1..t){
        val a = `in`.nextInt()
        val b = `in`.nextInt()
        println("Case #$i: $a + $b = ${a + b}")
    }
}

private fun java() {
    val `in` = Scanner(System.`in`)
    val a: Int = `in`.nextInt()
    for (i in 1..a) {
        val c: Int = `in`.nextInt()
        val d: Int = `in`.nextInt()
        println("Case #" + i + ": " + (c + d))
    }
    `in`.close()
}
private fun kotlinVersion() {
    val t = readLine()!!.toInt()

    for (i in 1..t) {
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        println("Case # $i : ${a + b}")
    }
}




