package lamdacollection

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null

    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }

    println(theOldest)
}

fun main() {
    val people = listOf(Person("jko", 12), Person("junhee-ko", 30))
    findTheOldest(people)

    println(people.maxByOrNull { it.age })
    people.maxByOrNull { it.age }

    val createPerson = ::Person
    val person = createPerson("junhee", 30)


}
