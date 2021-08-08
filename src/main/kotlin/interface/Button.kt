package `interface`

class Button : Clickable, Focusable {
    override fun click() = println("Button was clicked")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}
