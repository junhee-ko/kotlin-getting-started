package nullexample

fun ignoreNulls(string: String?) {
    val notNullString = string!!
    println(notNullString.length)
}
