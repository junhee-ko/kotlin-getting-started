package secondaryconstructor

class Button : View {

    constructor(button: String) : this(button, "IMAGE"){

    }

    constructor(button: String, image: String) : super(button, image) {

    }
}
