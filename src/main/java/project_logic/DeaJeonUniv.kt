package project_logic

private fun String.setReplace() {
    var firstPointStart = 0
    var firstPointEnd = 9
    var secondPointStart = 9
    var secondPointEnd = 19
    val latList: MutableList<Double> = mutableListOf()
    val longList: MutableList<Double> = mutableListOf()


    val string = this.replace(" ", "")
    val cleanString = string.replace(",", "")

    val max = cleanString.length / 19
    repeat(max) {

        val markerLat = cleanString.subSequence(firstPointStart, firstPointEnd).toString().toDouble()
        val markerLong = cleanString.subSequence(secondPointStart, secondPointEnd).toString().toDouble()

        firstPointStart = secondPointEnd
        firstPointEnd = secondPointEnd + 9
        secondPointStart = firstPointEnd
        secondPointEnd = secondPointStart + 10

        println(markerLat)
        println(markerLong)

        latList.add(markerLat)
        longList.add(markerLong)
    }
    println(latList.size)
    println(longList.size)
}