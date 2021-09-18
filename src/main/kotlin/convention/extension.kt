package convention

import java.math.BigDecimal

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Point.get(index: Int): Int {
    return when(index){
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException()
    }
}

operator fun MutablePoint.set(index: Int, value: Int) {
    return when(index){
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException()
    }
}


operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE
