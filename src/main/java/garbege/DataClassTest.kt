package garbege

data class DataClassTest(val value: Int) {
    val safeValue: Int
        get() = if (value < 0) 0 else value
}