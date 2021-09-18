package convention

class Person(
    private val firstName: String,
    private val lastName: String
) : Comparable<Person> {

    override fun compareTo(other: Person): Int {
        return compareValuesBy(
            this,
            other,
            Person::lastName,
            Person::firstName
        )
    }
}
