package iteration

fun main() {
//    val list = emptyList<Int>()
    val list = listOf("1", "2", "3")
    list
        .forEach {
            if(it == "2"){
                return@forEach
            }
            println(it)

        }
        .also { println("--") }
}
