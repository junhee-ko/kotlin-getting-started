package `object`

class User private constructor(val nickName: String) {

    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User("test:accountId")
    }
}

fun main() {
    val subscribingUser = User.newSubscribingUser("junheee.ko@gmail.com")
    val facebookUser = User.newFacebookUser(1)
}
