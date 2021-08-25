package lamdacollectionapi

import lamdacollection.Person
import java.lang.management.PlatformLoggingMXBean

val under25 = { p: Person -> p.age < 25 }

fun main() {
    val people = listOf(Person("jko", 30), Person("junhee-ko", 20))
    println(people.all(under25))
    println(people.any(under25))
    println(people.count(under25))
    println(people.find(under25))
}
