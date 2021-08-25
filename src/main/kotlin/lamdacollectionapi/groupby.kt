package lamdacollectionapi

import lamdacollection.Person

fun main() {
    val people = listOf(
        Person("jko", 30), Person("son", 30),
        Person("junhee-ko", 20)
    )

    println(people.groupBy { it.age })
}
