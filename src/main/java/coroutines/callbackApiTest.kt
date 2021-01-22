package coroutines

import kotlinx.coroutines.*

@ExperimentalCoroutinesApi
fun main() {
    CoroutineScope(Dispatchers.IO).launch {
        5.awaitCallback{ print("코루틴을 취소")}
    }
    Thread.sleep(2000L)
}

@ExperimentalCoroutinesApi
suspend fun <T> T.awaitCallback( onCancell: (T) -> Unit) = suspendCancellableCoroutine<T> {

   //캔슬
    it.cancel()
    it.resume(this) { onCancell(this) }

    //캔슬 x 일때 실행
    if(!it.isCancelled)
        print(this)
}
