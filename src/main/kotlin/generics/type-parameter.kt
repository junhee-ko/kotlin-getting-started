package generics

fun slice() {
    val letters = ('a'..'z').toList()

    val slice1 = letters.slice<Char>(0..2)
    val slice2 = letters.slice(10..12)
}

fun filter() {
    val names = listOf("james", "kobe", "jko", "messi")
    val me = listOf("jko", "junhee", "ko")

    names.filter { it: String -> it in me }
}

val <T> kotlin.collections.List<T>.penultimate: T
    get() = this[size - 2]

fun props() {
    listOf(1, 2, 3).penultimate
}

interface List<T> {

    operator fun get(index: Int): T
}

class StringList : List<String> {

    override fun get(index: Int): String {
        TODO("Not yet implemented")
    }
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        TODO("Not yet implemented")
    }
}

fun constraint() {
    listOf(1, 2, 3).sum()
}

class Processor<T : Any> {

    fun process(value: T) {
        value.hashCode()
    }
}

fun processorTest() {
    val processor = Processor<String>()
    processor.process("jko")
}
