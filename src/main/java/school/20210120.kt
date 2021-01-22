package school

fun main() {
//    myGarbegeCode()
    myTeacherCode()
}


//O(1)
private fun myGarbegeCode() {
    val time = readLine()
    val newTime = time!!.split(" ")
    var H = newTime[0].toString().toInt()
    var M = newTime[1].toString().toInt()

    if (M in 0..60 || H in 0..24) {

        if (M < 45) {
            M = (M - 45 + 60) % 60
            H = (H - 1 + 24) % 24
        } else
            M = (M - 45 + 60) % 60

        println("$H $M")
    }


}

fun myTeacherCode() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    var hour = input[0]
    var minute = input[1]

    // 분이 45분 미만의 경우
    if (minute < 45) {
        // 시에서 -1 을 차감
        hour = (hour - 1 + 24) % 24
    }

    minute = (minute - 45 + 60) % 60

    println("$hour $minute")
}

