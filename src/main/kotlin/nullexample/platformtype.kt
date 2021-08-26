package nullexample

fun yellAt(person: MyPerson){
    val s1: String ? = person.name
    val s2: String  = person.name

    println(person.name.uppercase())
}
