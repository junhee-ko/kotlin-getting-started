package primitive

data class Person(val name: String, val age: Int? = null) {

    fun isOrderThan(other: Person): Boolean? {
        if (age == null || other.age == null) {
            return null
        }

        return age > other.age
    }
}
