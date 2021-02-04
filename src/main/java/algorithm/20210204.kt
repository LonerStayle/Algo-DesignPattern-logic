package algorithm

import java.util.*


fun main() {
    val participant = mutableListOf<String>("mislav", "stanko", "mislav", "ana")
    val completion = mutableListOf<String>("mislav", "stanko", "ana")
//    arrayMode(participant,completion)
hashMap(participant, completion)

}

private fun arrayMode(participant: MutableList<String>, completion: MutableList<String>) {

    participant.sort()
    completion.sort()

    if(participant.size > completion.size)
        println(participant.last())
    else{
        for(part in participant){
            if(!completion.contains(part))
                println(part)
        }
    }

}



private fun hashMap(participant: MutableList<String>, completion: MutableList<String>) {
    val hm = HashMap<String,Int>()
    for(part in participant) hm[part] = hm.getOrDefault(part,0)+1
    for(com in completion) hm[com] = hm[com]!! -1
    for(key in hm.keys){
        if (hm[key] != 0)
            println(key)
    }

}