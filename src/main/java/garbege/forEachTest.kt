package garbege

fun main() {
    val list= mutableListOf(1,2,3,4,5)
    val listTwo = mutableListOf<Int>()

    list.forEach {
        listTwo.add(it)
        println(listTwo.size)
    }
}