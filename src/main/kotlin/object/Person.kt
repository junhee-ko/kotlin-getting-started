package `object`

fun main() {
    val persons = listOf(Person("jko"), Person("junhee-ko"))
    println(
        persons.sortedWith(Person.NameComparator)
    )
}

data class Person(val name: String) {

    object NameComparator : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int = o1.name.compareTo(o2.name)
    }
}
