package dataStructure.kotlin


fun main() {
    bubbleSort(arrayOf(6, 2, 5, 4, 9))
}


//선택 정렬 내림차순
fun selectionSort(arr: Array<Int>) {
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            //if 조건으로 < 은 내림차순 > 오름차순
            if (arr[i] <= arr[j])
            //swap
                arr[i] = arr[j].also { arr[j] = arr[i] }
        }
    }
    arr.forEach { println(it) }
}



// 삽입 정렬
private fun insertionSort(list: Array<Int>) {

    for (i in 1 until list.size) {
        val key = list[i]
        var aux = i - 1
        //while 조건으로 key와 list[aux] 사이의 부등호에 따라
        // < 내림차순 , >  오름차순
        while (aux>=0 && key < list[aux]) {
            list[aux + 1] = list[aux]
            aux--
        }
        list[aux + 1] = key
    }
    list.forEach { println(it) }
}

//버블정렬
private fun bubbleSort(arr: Array<Int>){
    var temp:Int
    for(i in arr.size-1 downTo 0){
        for(j in 0 until i){
            //<내림차순, > 오름차순
            if(arr[j]>arr[j+1]){
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
            }
        }
    }
    arr.forEach { println(it) }
}


//코틀린 정렬
fun kotlinSort(arr: Array<Int>) {
//    내림차순
    arr.sort()
    //오름차순
    arr.sortDescending()
    arr.forEach { println(it) }
}







