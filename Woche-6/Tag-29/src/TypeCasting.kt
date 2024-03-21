package privatePublic

open class Tier() {
     open fun move() {
        println("Funktion aus Tier")
    }

}

class Hund() : Tier() {
    override fun move() {
        println("Funktion aus Hund")
    }
    fun hundspezifischeFunktion(){
        println("is callable")
    }
}

fun main() {
    val listOfTiere: List<Tier> = listOf(Tier(), Hund())
    // Wirft keinen error, da das zweite Element der Liste tatsächlich ein Hund ist
    var nochTier = listOfTiere[1]
    var hund = listOfTiere[1] as Hund
    nochTier.move()
    hund.move()
    // not callable
    //nochTier.hundspezifischeFunktion()
    hund.hundspezifischeFunktion()
    listOfTiere.forEach{tier ->
    try {
        (tier as Hund).hundspezifischeFunktion()
    } catch (e: Exception) {
        println("das hat nicht geklappt nicht ein hund")
    }

    }
    try {
        // Wirft error, weil das erste Element der Liste kein Hund ist
        hund = listOfTiere[0] as Hund
    } catch (e: Exception) {
        println("das klappt nicht: hund = listOfTiere[0] as Hund ->" +
                "  Wirft error, weil das erste Element der Liste kein Hund ist")
    }
}