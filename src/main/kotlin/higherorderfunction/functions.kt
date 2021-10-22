package higherorderfunction

val numbers = listOf("one", "two", "three", "four")
val longerThan3 = numbers.filter { it.length > 3 }

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
val action: () -> Unit = { println(sum) }
val funOrNull: ((Int, Int) -> Int)? = null

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The reuslt is : $result")
}

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() }  // HER !!!
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(transform(element))   // HER !!!
    }
    result.append(postfix)

    return result.toString()
}


fun main() {
    val letters = listOf("A", "B", "C")
    val result = letters.joinToString()
    println(result)
}
