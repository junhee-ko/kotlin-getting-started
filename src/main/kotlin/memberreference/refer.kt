package memberreference

import lamdacollection.Person

fun Person.isAdult() = age > 21

fun hello() = println("hello")

fun main() {
    run(::hello)

    val predicate = Person::isAdult
}
