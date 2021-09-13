package primitive

import java.lang.IllegalArgumentException

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
