package higherorderfunction

data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

enum class OS {
    WINDOWS,
    LINUX,
    MAC,
    IOS,
    ANDROID
}

val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 10.0, OS.ANDROID),
    SiteVisit("/", 12.0, OS.IOS),
    SiteVisit("/", 20.0, OS.MAC),
    SiteVisit("/", 40.1, OS.LINUX),
)

val averageWindowsDuration = log
    .filter { it.os == OS.WINDOWS }
    .map(SiteVisit::duration)
    .average()

val averageMacDuration = log
    .filter { it.os == OS.MAC }
    .map(SiteVisit::duration)
    .average()

fun List<SiteVisit>.averageDuration(os: OS) =
    filter { it.os == os }.map(SiteVisit::duration).average()

fun List<SiteVisit>.averageDuration(predicate: (SiteVisit) -> Boolean) =
    filter(predicate).map(SiteVisit::duration).average()

fun main() {
    log.averageDuration(OS.MAC)
    log.averageDuration { it.os == OS.ANDROID && it.path == "/login" }
}
