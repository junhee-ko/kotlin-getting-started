package local

import java.lang.IllegalArgumentException

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("$id")
        }
    }

    validate(name)
    validate(address)
}

fun saveUser(user: User) {
    // save
}
