//open class BaseTest<Str:String>(str:Str){
//
//}
//class BaseTestSub<Str:String>(str:Str):BaseTest<Str>(str){
//
//}
fun main() {
    val skillList = readLine()!!.split(" ")
    val skillCount = readLine()!!.toInt()
    val inputList:MutableList<String> = mutableListOf()
    val resultList: MutableList<String> = mutableListOf()
    repeat(skillCount) { i->
        val input2 = readLine()!!.split(" ")
        for (input in input2){
            if(skillList.contains(input)){
                inputList.add(input)
                if(i !=0)
                    for(j in inputList.indices ){
                      
                    }
            }
        }
    }



    val arr = intArrayOf(1, 2, 3) //순열을 만들 배열
    val n = arr.size //배열의 길이
    val output = IntArray(n) //순열 출력을 위한 배열
    val visited = BooleanArray(n) //중복해서 뽑지 않기 위해 방문했는지를 체크하는 배열

    //1. Swap 함수를 이용해 구현
    per1(arr, 0, n, 3)

    //2. DFS를 이용해 구현
    per2(arr, output, visited, 0, n, 3) //r = 3, 3개를 뽑을 것
}

//1. Swap 함수를 이용해 구현 - 순서 없이 n 개중에서 r 개를 뽑는 경우
fun per1(arr: IntArray, depth: Int, n: Int, r: Int) {
    if (depth == r) {
        print(arr)
        print(r)
        return
    }
    for (i in depth until n) {
        swap(arr, depth, i)
        per1(arr, depth + 1, n, r)
        swap(arr, depth, i)
    }
}

fun swap(arr: IntArray, depth: Int, i: Int) { //두 배열의 값을 바꾸는 Swap 함수
    val temp = arr[depth]
    arr[depth] = arr[i]
    arr[i] = temp
}

//2. DFS를 이용해 구현  - 순서를 지키면서 n 개중에서 r 개를 뽑는 경우
fun per2(arr: IntArray, output: IntArray, visited: BooleanArray, depth: Int, n: Int, r: Int) {
    if (depth == r) {
        print(output) //순열 출력을 위한 print 함수
        print(r)
        return
    }
    for (i in 0 until n) {
        if (!visited[i]) {
            visited[i] = true
            output[depth] = arr[i]
            per2(arr, output, visited, depth + 1, n, r)
            visited[i] = false
        }
    }
}