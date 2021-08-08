package companion

class Person(val name: String) {

    companion object {
        // empty
    }
}

fun Person.Companion.fromJson(json: String): Person = Person("$json")

fun main() {
    Person.fromJson("....")
}
