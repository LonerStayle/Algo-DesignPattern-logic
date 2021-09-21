package algorithm

fun main() {
//  algorithm.function(100)
    function2(101, 1)
}

fun function(count: Int): Int {
    return if (count == 1) {
        1
    } else {
        val a = count + function(count - 1)
        if (a % 10 == 0)
            println(a)
        a
    }
}

fun function2(maxCount: Int, currentCount: Int): Int? {
    return if (currentCount == maxCount) {
        null
    } else {
        if (currentCount % 10 == 0)
            println(currentCount)

        function2(maxCount, currentCount + 1)

    }
}

//fun algorithm.function2(maxCount:Int,currentCount:Int = 1):Int?{
//    return if(currentCount==maxCount){
//        null
//    }else{
//        if(currentCount%10==0)
//            println(currentCount)
//        algorithm.function2(maxCount,currentCount+1)
//    }
//}
