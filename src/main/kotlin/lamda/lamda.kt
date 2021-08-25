package lamda

fun main() {
    val sum = { x: Int, y: Int ->
        println("Ing sum...")
        x + y
    }

    println(sum(1, 2))
}
