package property

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }


fun main() {
    val stringBuilder = StringBuilder("Kotlin?")
    val lastChar = stringBuilder.lastChar
    println(lastChar)
}
