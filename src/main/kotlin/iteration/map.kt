package iteration

import java.util.*

fun main() {
    val map = TreeMap<Char, String>()

    for(c in 'A'..'F'){
        map[c] = Integer.toBinaryString(c.code)
    }

    for ((letter, binary) in map){
        println("$letter = $binary")
    }
}
