package project_logic

fun main() {
    val list = mutableListOf<Int>()

    var i = 0
    var allRound = 16
    var testCase = 0
    var selectOne = -1
    var selectTwo = 0

    fun gameLogic() {
        while (testCase < allRound) {
            testCase++
            selectOne += 1
            selectTwo += 1
            list.removeAt(selectTwo)
            if (testCase == allRound) {
                list.forEach {
                    print(it)
                    println("사이즈:${list.size * 2}강")
                }
            }
        }
        selectOne = -1
        selectTwo = 0
        testCase = 0
        allRound /= 2
    }

    repeat(32) {
        i++
        list.add(i)
    }
    //32강
    gameLogic()
    //16강
    gameLogic()
//    //8강
    gameLogic()
//    //4강
    gameLogic()
    //결승
    gameLogic()


}


interface EventListener {
    fun onEvent(count: Int)
}

class Counter(var listener: EventListener) {
    fun count() {
        for (i in 1..100) {
            if (i % 5 == 0) listener.onEvent(i)
        }
    }
}

class EventPrinter {
    fun start() {
        val counter = Counter(object : EventListener {
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}
