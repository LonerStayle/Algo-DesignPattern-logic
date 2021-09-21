package algorithm

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {

}


fun stringBuffer() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bufferedWriter = BufferedWriter(OutputStreamWriter(System.out))
    val count = bufferedReader.readLine()?.toInt() ?: 0

    repeat(count) {
        bufferedWriter.write("${bufferedReader.readLine()!!.split(' ').map { it.toInt() }.sum()}")
        bufferedWriter.newLine()
    }

    bufferedWriter.flush()
    bufferedWriter.close()
}

fun hap() {
    val n = readLine()!!.toInt()
    var result = 0
    for (i in 1..n)
        result += i

    println(result)
}