package `in`

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "yes"
    in 'a'..'z' -> "no"
    else -> "?"
}

fun main() {
    recognize('a')
}
