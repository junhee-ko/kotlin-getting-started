package sequence

import lamdacollection.Person

fun main() {
    val people = listOf(Person("Ajko", 12), Person("junhee-ko", 30))

//    people
//        .map(Person::name)
//        .filter { it.startsWith("A") }
//
//    val toList = people.asSequence()
//        .map(Person::name)
//        .filter { it.startsWith("A") }
//        .toList()
//
//    val result = listOf(1, 2, 3, 4).asSequence()
//        .map {
//            println("map $it")
//            it * it
//        }
//        .filter {
//            println("filter $it")
//            it % 2 == 0
//        }
//        .toList()


    val lazy = listOf(1, 2, 3, 4).asSequence()
        .map { it * it }
        .find { it > 3 }
    println(lazy)

    val eager = listOf(1, 2, 3, 4)
        .map { it * it }
        .find { it > 3 }
    println(eager)

}
