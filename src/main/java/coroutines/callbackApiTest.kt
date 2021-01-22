package coroutines

import kotlinx.coroutines.*

@ExperimentalCoroutinesApi
fun main() {
    CoroutineScope(Dispatchers.IO).launch {
        "코루틴 정상 작동".awaitCallback{ print("코루틴을 취소")}
    }
    Thread.sleep(2000L)
}

@ExperimentalCoroutinesApi
suspend fun <T> T.awaitCallback( onCancell: (T) -> Unit) = suspendCancellableCoroutine<Unit> {

   //캔슬
//    it.cancel()
    it.resume(Unit) { onCancell(this) }

    //캔슬 x 일때 실행
    if(!it.isCancelled)
        print(this)
}
