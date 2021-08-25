package apply

//fun alphabet(): String = with(StringBuilder()) {
//    for (letter in 'A'..'Z') {
//        append(letter)
//    }
//
//    append("\nThe End")
//
//    this.toString()
//}

//fun alphabet() = StringBuilder().apply {
//    for (letter in 'A'..'Z') {
//        append(letter)
//    }
//
//    append("\nThe End")
//}.toString()

fun alphabet() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }

    append("\nThe End")
}

fun main() {
    println(alphabet())
}
