package dataStructure.kotlin

import org.junit.Test

class ArrayTest {
    var arrayTest = Array<Int?>(4) { 0 }

    @Test
    fun test() {
        arrayTest.apply {
            this[3] = null
            this.forEach {
                println(it)
            }
        }

    }
}