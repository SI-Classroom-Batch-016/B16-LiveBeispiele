
fun main() {

    // Sekundäre Konstruktoren

    val firstPerson: Person = Person("Brian Moyou")
    val secondPerson: Person = Person("Brian", "Moyou")
    val thirdPerson: Person = Person("Brian Moyou", 99)

    val max: Person = Person("Max Jones", 19)
    max.geburtstag()
    println("Max ist jetzt max.alter")


}