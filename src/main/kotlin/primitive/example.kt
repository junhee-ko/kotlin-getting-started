package primitive

val ii: Int = 1
val list: List<Int> = listOf(1, 2, 3)

fun showProgress(progress: Int){
    val percent = progress.coerceIn(0, 100)
    println("progress : $percent")
}
