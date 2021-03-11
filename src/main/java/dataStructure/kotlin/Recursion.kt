package dataStructure.kotlin

fun main() {

//        intArrayOf(1,2,3,4,5,6,7,8,9,10).also{
//            println(linearRecursion(it,10))
//        }
}
fun binaryRecursion(k: Int): Int {
    return if (k == 1 || k == 0) k else binaryRecursion(k - 1) + binaryRecursion(k - 2)
}


private fun linearRecursion(A: IntArray, n: Int):Int {
    return if (n == 1) A[0] else linearRecursion(A, n - 1) + A[n - 1]
}
private fun tailRecursion(A: IntArray, number1: Int, number2: Int){
    if(number1<number2){
        val temp = A[number1]
        A[number1] = A[number2]
        A[number2] = temp
        tailRecursion(A, number1 + 1, number2 - 1)
        return
    }
    A.forEach {println(it)}
}


