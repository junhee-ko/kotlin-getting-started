package collectionarray

fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source) {
        target.add(item)
    }
}
