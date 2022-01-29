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

interface MyList<T> {

    operator fun get(index: Int): T
}

class StringList : MyList<String> {

    override fun get(index: Int): String {
        TODO("Not yet implemented")
    }
}

class ArrayList<T> : MyList<T> {
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

fun <T> print(list: List<T>) {

//    if (list is List<String>) {
//        println("list is List<String>")
//    }

    if (list is List<*>) {

    }
}

inline fun <reified T> isA(value: Any) = value is T

fun isATest(){
    val isAString1 : Boolean = isA<String>("abc")
    val isAString2 : Boolean = isA<String>(123)
}

fun testFilterIsInstance(){
    val list = listOf("junhee", 123)
    val filteredList: List<String> = list.filterIsInstance<String>()
}
