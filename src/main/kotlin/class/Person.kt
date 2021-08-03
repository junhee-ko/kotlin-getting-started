package `class`

class Person(
    val name: String,
    var isMarried: Boolean
)

fun main() {
    val person = Person("jko", false)

    println(person.name)
    println(person.isMarried)

    person.isMarried = true
}
