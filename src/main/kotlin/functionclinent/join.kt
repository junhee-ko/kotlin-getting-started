package functionclinent

import function.joinToString

fun main() {
    val list = listOf(1, 2, 3)
    val joinToString = list.joinToString(separator = "; ", prefix = "(", postfix = ")")
    println(joinToString)
}
