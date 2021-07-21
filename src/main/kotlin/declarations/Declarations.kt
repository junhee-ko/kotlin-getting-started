package declarations

typealias EmployeeSet = Set<Employee> // ex) StringBuilder

fun main() {
    var number: Int
    number = 10
    number = 20

    val names = arrayListOf("John", "James", "Marry")
    println(names[1])

    val employeeSet: EmployeeSet

    val employee1 = Employee("Junhee Ko", 500)
    employee1.name = "Bon"
//    employee = Employee("BTS", 500) Can't because employee1 is with val keyword

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("James", 400)
    } else {
        employee2 = Employee("Watson", 150)
    }
//    number = "hello" type is different

    val employeeOne = Employee("Ronaldo", 1)
    val employeeTwo = Employee("Messi", 2)
    val employeeThree = Employee("Messi", 2)
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree) // true : Kotlin the equals operator checks for structural equality when it's comparing instances,
    println(employeeOne.equals(employeeTwo)) // equals function can be replace by ==
    println(employeeTwo.equals(employeeThree))

    println(employeeOne === employeeTwo)   // === : check referential equality check
    println(employeeTwo === employeeThree)

    val employeeFour = employeeThree
    println(employeeFour === employeeThree)

    println(employeeFour != employeeTwo)
    println(employeeFour !== employeeTwo)
    println(employeeTwo != employeeThree)
    println(employeeTwo !== employeeThree)

}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }

        return false
    }
}
