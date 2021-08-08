package `object`

import `class`.Person

fun main() {
    Payroll.allEmployees.add(Person(name = "jko", isMarried = false))
    Payroll.calculateSalary()
}

object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees) {
            //..
        }
    }
}
