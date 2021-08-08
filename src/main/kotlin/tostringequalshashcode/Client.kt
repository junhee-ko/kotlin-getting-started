package tostringequalshashcode

fun main() {
    val client1 = Client("jko", 1234)
    val client2 = Client("jko", 1234)
    println(client1 == client2)

    val hashSet = hashSetOf(Client("jko", 1234))
    println(hashSet.contains(Client("jko", 1234)))
}


class Client(val name: String, val postCode: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (postCode != other.postCode) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postCode
        return result
    }

    override fun toString(): String = "Client(name='$name', postCode=$postCode)"
}
