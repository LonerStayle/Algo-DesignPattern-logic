package algorithm

fun main() {
    val i = 4
    println("재귀 기본${recursion(i)}")
    println("x의 값 곱하기 구하기:${xResult(2, i)}")
    println("피보나치:${fibonacci(i)}")
    println("최대공약수:${gcd(366, 6)}")
    println("문자열길이 구하기 ${length("안녕하세요")}")

    val testArray = Array<Int> (5){5}
    println("배열의 합 구하기 ${sum(i,testArray)}")
    //프린트
    printChars("안녕하세요")

    //거꾸로 프린트
    printCharsReverse("안녕하세요")
}

fun sum(n:Int, data:Array<Int>):Int{
    return if(n<=0)
         0
    else sum(n-1,data) + data[n-1]
}

fun printChars(str:String){
    if(str.isEmpty())
        return
    print(str[0])
    printChars(str.substring(1))
}
fun printCharsReverse(str:String){
    if(str.isEmpty())
        return
    printCharsReverse(str.substring(1))
    println(str[0])

}

fun length(str:String):Int{
    return if(str == (""))
         0
    else
        1+ length(str.substring(1))
}

//최대 공약수
fun gcd(m: Int, n: Int): Int {
    return if (n != 0) {
        gcd(n, m % n)
    } else
        m
}


//최대 공약수 구하는법
fun recursion(i: Int): Int {
    return if (i <= 0) {
        0
    } else {
        i + recursion(i - 1)
    }
}

//곱하기
fun xResult(x: Int, n: Int): Int {
    return if (n == 0) {
        1
    } else {
        x * xResult(x, n - 1)
    }

}

//피보나치 수열
fun fibonacci(n: Int): Int {

    return if (n <= 0) {
        1
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2)
    }

}
