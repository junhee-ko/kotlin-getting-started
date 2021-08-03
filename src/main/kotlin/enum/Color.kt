package enum

enum class Color(
    private val r: Int,
    private val g: Int,
    private val b: Int
) {

    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun get(color: Color) =
    when (color) {
        Color.RED, Color.ORANGE -> "This is Red, Orange"
        Color.YELLOW -> "This is Yellow"
    }

fun mix(c1: Color, c2: Color) =
    when(setOf(c1, c2)){
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.RED, Color.ORANGE) -> Color.YELLOW
        else -> throw Exception("Nothing")
    }

fun main() {
    print(mix(Color.RED, Color.YELLOW))
}
