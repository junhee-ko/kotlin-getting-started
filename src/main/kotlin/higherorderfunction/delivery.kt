package higherorderfunction

enum class Delivery {
    STANDARD, EXPEDITED
}

class Order(val itemCount: Int)

fun getShippingCostCalculator(
    delivery: Delivery
): (Order) -> Double {
    if (delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount }
    }
    return { order -> 1.2 * order.itemCount }
}

fun main() {
    val shippingCostCalculator = getShippingCostCalculator(Delivery.EXPEDITED)
    val cost = shippingCostCalculator(Order(3))
    println(cost)
}
