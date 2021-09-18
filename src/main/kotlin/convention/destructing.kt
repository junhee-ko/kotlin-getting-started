package convention

fun print(map: Map<String, String>) {

    for (entry in map.entries) {
        val key = entry.component1()
        val value = entry.component2()
        println("$key -> $value")
    }
}
