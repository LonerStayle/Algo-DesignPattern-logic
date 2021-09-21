package algorithm

fun main() {

    stringReverse("abcdef")
}

fun stringReverse(str: String) {

    for (i in str.length - 1 downTo 0) {
        print(str[i])
    }

}
