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

}

class Employee(var name: String, val id: Int) {

}
