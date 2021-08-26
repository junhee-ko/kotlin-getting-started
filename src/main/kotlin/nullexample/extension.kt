package nullexample

fun verifyInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("null or blank")
    }
}
