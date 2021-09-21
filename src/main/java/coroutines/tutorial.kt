package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() {
    //코루틴과 메인 스레드는 따로 논다.
//    `1`()

    //런블럭 사용
    //`2`()

}

private fun `2`() {

    GlobalScope.launch {
        println("나먼저 간다!!")
    }
    runBlocking {
        println("코루틴 끝났다.,")
        delay(2000)
    }

}

private fun `1`() {
    GlobalScope.launch {
        delay(1000L)
        println("World!") // print after delay
    }
    println("Hello,") // main thread continues while coroutine is delayed
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
}