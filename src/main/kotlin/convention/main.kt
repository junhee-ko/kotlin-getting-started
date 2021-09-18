package convention

import java.math.BigDecimal
import java.time.LocalDate

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)

    println(p1 + p2)
    println(p1 * 1.5)

    var point = Point(1, 2)
    point += Point(3, 4)
    println(point)

    println('a' * 3)

    var number = BigDecimal.ZERO
    println(number++) // 0
    println(++number) // 2

    val point1 = Point(3, 4)
    println(point1[0])
    println(point1[1])

    val mutablePoint = MutablePoint(1, 2)
    mutablePoint[0] = 5
    mutablePoint[1] = 6

    println(mutablePoint)

    val now = LocalDate.now()
    val closedRange: ClosedRange<LocalDate> = now..now.plusDays(10)

    val numbers = listOf(1, 2, 3)
    println(1 in numbers)

    val a: String = "aaaaa"
    for (c in "abc") {
        println(c)
    }

    val p = Point(3, 5)
    val (x, y) = p
    println(x)
    println(y)
}
