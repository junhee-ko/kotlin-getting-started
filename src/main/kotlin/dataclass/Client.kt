package dataclass

fun main() {
    val origin = Client("jko", 1234)
    val copy = origin.copy(name = "jko", postCode = 5678)
}
data class Client(val name: String, val postCode: Int)
