package fieldkeyword

class User(val name: String) {

    var address: String = "Incheon"
        set(value: String) {

            println(
                """
                address was changed !!
                $field -> $value
            """.trimIndent()
            )

            field = value
        }
}
