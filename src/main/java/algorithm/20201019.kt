package algorithm

//백준 한수 문제
    fun main(args: Array<String>) {

        val n: Int = readLine()!!.toInt()

        if (n < 100) {
            println(n)
        } else {
            var result = 99
            for (i in 100..n) {
                result += checkHanNumber(i)
            }
            if (n == 1000) result--
            println(result)
        }
    }

    private fun checkHanNumber(number: Int): Int {
        val num1 = number / 100 % 10
        val num2 = number / 10 % 10
        val num3 = number % 10
        return if (num2 * 2 == num1 + num3) {
            1
        } else 0
    }
