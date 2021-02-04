import garbege.DataClassTest
import kotlin.concurrent.thread



fun main() {

    println(hi())


}

private fun hi():Int {
    mutableListOf<Int>(1, 2, 3, 4, 5, 6).also {
        for (int in it) {
            if (int == 4)
                return int
        }
    }
    return 0
}


