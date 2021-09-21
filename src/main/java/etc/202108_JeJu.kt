package etc

fun main() {
    val subBiToJoy = ((15600 +
            3400 +
            37000 +
            16700 +
            84000 +
            35000 +
            4100 +
            7100 +
            34000 +
            9200 +
            19000 +
            9500 +
            21500 +
            7300 +
            24000 +
            8000 +
            4100 +
            109900 +
            99000 +
            4000 +
            36000 +
            3400 +
            34000 +
            60000 +
            28600 +
            20000 +
            12000 +
            14500 +
            5800 +
            41360 +
            12000)/2)+8900
    val joyTosubBi = 8150 + 12000 + 1950
    val result = subBiToJoy - joyTosubBi
    println("서비가 조이에게 보내야 할 금액:$subBiToJoy")
    println("조이가 서비에게 보내야 할 금액:$joyTosubBi")
    println("최종적으로 조이가 받아야할 금액:$result")
}

