package privatePublic

open class Tier() {

}

class Hund() : Tier() {

}

fun main() {
    val listOfTiere: List<Tier> = listOf(Tier(), Hund())
    // Wirft keinen error, da das zweite Element der Liste tatsächlich ein Hund ist
    var hund = listOfTiere[1] as Hund
    try {
        // Wirft error, weil das erste Element der Liste kein Hund ist
        hund = listOfTiere[0] as Hund
    } catch (e: Exception) {
        println("das klappt nicht: hund = listOfTiere[0] as Hund ->" +
                "  Wirft error, weil das erste Element der Liste kein Hund ist")
    }
}