package finalclass

import `interface`.Clickable

open class RichButton : Clickable {
    fun disable() {}
    open fun animate() {}
    final override fun click() {}
}
