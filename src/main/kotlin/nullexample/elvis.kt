//package nullexample
//
//import java.lang.IllegalArgumentException
//
//class Address(val street: String, val zipCode: Int, val city: String)
//
//class Company(val name: String, val address: Address?)
//
//class Person(val name: String, val company: Company?)
//
//
//fun printShippingLabel(person: Person) {
//    val address = person.company?.address
//        ?: throw IllegalArgumentException("No Address")
//
//    with(address) {
//        println(street)
//        println("$zipCode $city")
//    }
//}
//
