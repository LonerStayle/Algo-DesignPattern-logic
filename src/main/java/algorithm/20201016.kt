package algorithm

fun main() {

//    val list = arrayListOf("1","1","1","111")
//  val newList = list.filter { it.length == 3 }.map { it.removeRange(0..1) }
//    newList.forEach { println(it)}


//    val totalCount = readLine()!!.toInt()
//    var jiMinRound = readLine()!!.toInt()
//    var hanSuRound = readLine()!!.toInt()
//    var currentRound = 0
//
//    if (totalCount < jiMinRound || totalCount < hanSuRound) {
//        currentRound = -1
//    } else {
//        while (jiMinRound != hanSuRound) {
//            jiMinRound = (jiMinRound + 1) /2
//            hanSuRound = (hanSuRound +1)/2
//            currentRound++
//        }
//    }
//    println(currentRound)

    /**
     * 홍님버전
    //     */
//    var kim = readLine()!!.toInt()
//    var im = readLine()!!.toInt()
//    var count = 0
//    var check = 0
//    while (kim != im) {
//            kim = kim / 2 + kim % 2
//            im = im / 2 + im % 2
//
//        check++
//        count++
//    }
//    print("$count")



    /**
     * 새롭게 만들어본 버전
     */
    val totalRound = readLine()!!.toInt()
    var jiMin = readLine()!!.toInt()
    var hanSu = readLine()!!.toInt()
    var currentRound = 0

    while (jiMin != hanSu && totalRound > jiMin && totalRound > hanSu) {
        jiMin = (jiMin + 1) / 2
        hanSu = (hanSu + 1) / 2
        currentRound++
    }

    println(currentRound)

}
