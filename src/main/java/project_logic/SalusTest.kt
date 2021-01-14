package project_logic

import kotlin.math.pow

fun main() {
//val list = mutableListOf<Int>(-1,-2,-3,-4,-5,-6,-7)
//    list.sortBy{it}
//    list.forEach { println(it) }

//    val list = mutableListOf(1,2,3,4,5,6,7,8,9,10)
//     val b  =  list.find { it == 5 }
//    val c  = list.indexOf(b)
//    val hhi = list.subList(c,list.lastIndex)
    
}



fun calculateDistance(txPower: Int, rssi: Double): Double {
    if (rssi == 0.0) {
        return -1.0 // if we cannot determine distance, return -1.
    }
    val ratio = rssi * 1.0 / txPower
    return if (ratio < 1.0) {
        Math.pow(ratio, 10.0)
    } else {
        0.89976 * Math.pow(ratio, 7.7095) + 0.111
    }
}

fun getDistance(txPower: Int, rssi: Double):Double {
    if (rssi > 0.0) {
        return -1.0; // if we cannot determine accuracy, return -1.
    }

    val ratio = rssi * 1 / txPower;
    return if (ratio < 1.0) {
        ratio.pow(10.0);
    } else {
        (0.89976) * ratio.pow(7.7095) + 0.111;
    }
}

//나머지 한개 찾기
private fun findRemainder() {
    val newScanList = mutableListOf(1, 2, 3, 4, 5)
    var scanList = mutableListOf(1, 2, 3, 4, 6)
    val deleteScan = mutableListOf<Int>()

    if (!isEqual(newScanList, scanList)) {
        deleteScan.getExitList(newScanList, scanList)
        scanList = newScanList
        println(scanList)
        println(deleteScan)
        return
    }
    scanList = newScanList
    println(scanList)
}

fun MutableList<Int>.getExitList(
        newScanList: MutableList<Int>, scanList: MutableList<Int>
): MutableList<Int> {
    this.clear()
    for (scan in newScanList) {
        if (!scanList.contains(scan))
            this.add(scan)
    }
    return this
}

fun <T> isEqual(first: List<T>, second: List<T>): Boolean {

    if (first.size != second.size) {
        return false
    }

    return first.zip(second).all { (x, y) -> x == y }
}
