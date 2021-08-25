package lamdacollectionapi

class Book(val title: String, val authors: List<String>)

fun main() {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    val books = listOf(
        Book("Kotlin", listOf("junheeko", "jko")),
        Book("Java", listOf("junheeko", "Chulsu")),
        Book("C++", listOf("BTS", "PSY")),
    )

    println(books.flatMap { it.authors }.toSet())
}
