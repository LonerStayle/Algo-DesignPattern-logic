package design_pattern

import org.junit.Test

class Printer(private val stringFormatterStrategy: (String) -> String) {
    fun printString(string: String) {
        println(stringFormatterStrategy(string))
    }
}

class StrategyPattern {

    @Test
    fun strategy() {
        val inputString = "i m Loner Hi HHHhh"
        val lowerCase = Printer { it.toLowerCase() }.apply {
            printString(inputString)
        }
        val upperCase = Printer { it.toUpperCase() }.apply {
            printString(inputString)
        }
        val prefixPrinter = Printer { "Prefix:$it" }.apply {
            printString(inputString)
        }
    }
}




