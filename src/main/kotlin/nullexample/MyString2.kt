package nullexample

fun main() {
    printAllCaps(null)
}

fun stringLength(s: String?): Int {
    if (s != null) {
        return s.length
    } else {
        return 0
    }
}

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

fun foo(s: String?) {
    val t: String = s ?: ""
}
