package coroutines

import kotlinx.coroutines.*

@ExperimentalCoroutinesApi
fun main() {
    CoroutineScope(Dispatchers.IO).launch {
        "콜백 정상 작동".awaitCallback{ print("콜백 취소")}
    }
    Thread.sleep(2000L)
}

@ExperimentalCoroutinesApi
suspend fun <T> T.awaitCallback( onCanCell: (T) -> Unit) = suspendCancellableCoroutine<Unit> {
   //취소
//    it.cancel()
    it.resume(Unit) {
        onCanCell(this) }

    //캔슬 x 일때 실행
    if(!it.isCancelled)
        print(this)
}
