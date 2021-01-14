package algorithm
fun main() {
    val t = readLine()!!.toInt()
    for (i in 0 until t) {
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        println(a + b)
    }
}

private fun aplusb() {
    val t = readLine()!!.toInt()
    for (i in 0 until t) {
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        println(a + b)
    }


}

private fun gugudan() {
    val n = readLine()!!.toInt()
    for (i in 1..9)
        println("$n * $i = ${n * i}")
}

private fun fourQuadrant() {
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    if (x >= 0 && y >= 0)
        println(1)
    else if (x <= 0 && y >= 0)
        println(2)
    else if (x <= 0 && y <= 0)
        println(3)
    else if (x >= 0 && y <= 0)
        println(4)
}

private fun setString() {
    println("강한친구 대한육군")
    println("강한친구 대한육군")

}