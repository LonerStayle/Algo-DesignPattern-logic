package dataStructure.kotlin

import org.junit.Test
import java.util.*

class ListTest {
    //인덱스 조회가 빠르지만 추가 삭제가 느리다.
    private var numbers: ArrayList<Any> = ArrayList<Any>()

    //추가 삭제가 빠르지만 조회가 느리다.
    private var linkedNumbers: LinkedList<Any> = LinkedList<Any>()

    @Test
    fun test() {
        numbers.add(10)
        numbers.add(20)
        numbers.add("hhi")
        numbers.add(40)
        numbers.add(50)
        numbers.removeAt(3)
        println(numbers)
        linkedNumbers.add(10)
        linkedNumbers.add(20)
        linkedNumbers.add(30)
        linkedNumbers.add(40)
        linkedNumbers.add(50)
        linkedNumbers.removeAt(3)
        println(linkedNumbers)
    }
}