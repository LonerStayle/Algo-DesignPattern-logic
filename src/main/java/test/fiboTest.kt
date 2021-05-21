package test

fun main() {
//    println(fibonacciAt(10))
    var result = generateSequence(1 to 1) { it.second to it.first + it.second }
        .map { it.first }
    println(result.take(10).toList().last())
}


//재귀
private fun fibonacciDefalut(n: Int): Int {
    return if (n <= 2) 1
    else fibonacciDefalut(n - 1) + fibonacciDefalut(n - 2)
}

//재귀 배열 버전
private fun fibonacciArr(n: Int): Int {
    val arr = Array(n) { 0 }
    arr[0] = 1
    arr[1] = 1
    for (i in 2 until arr.size) {
        arr[i] = arr[i - 1] + arr[i - 2]
    }
    return arr[arr.size - 1]
}


//코틀린에서 한번에 쓰는 꼬리재귀
fun fibonacciAt(n: Int) = run {
    tailrec fun fibonacciAcc(n: Int, a: Long, b: Long): Long {
        return when (n == 0) {
            true -> b
            false -> fibonacciAcc(n - 1, a + b, a)
        }
    }

    fibonacciAcc(n, 1, 0)
}

//꼬리재귀 결과
fun fibonacciTailResult(n: Int): Int {
    return fibonacciTail(n, 0, 1)
}

fun fibonacciTail(n: Int, prev: Int, next: Int): Int {
    return if (n == 0)
        prev
    else {
        //prev+next가 사실상 결과 값 n은 내려가기만 할뿐임
        fibonacciTail(n - 1, next, prev + next)
    }
}

//Reduce을 이용한 피보나치
fun fibonacciReduce(n: Int): Int {
    val arr = (1..n).toList().toIntArray()
    return arr.reduce { acc, v -> acc + v }
}
//fold를 이용한 피보나치
fun fibonacciFold(n: Int): Int {
    val arr = (1..n).toList().toIntArray()
    return arr.fold(0) { acc, v -> acc + v }
}
