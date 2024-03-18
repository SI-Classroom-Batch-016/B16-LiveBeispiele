
fun rotOderSchwarz(deck: MutableList<String>): String?{
    // Lässt den Spieler raten
    println("Was ist die nächste Karte? Rot (r) oder Schwarz (s)?")
    val guess: Char = readln().lowercase().first()

    // zieht eine Karte und deckt sie auf
    val karte: String = deck.removeFirst()
    val farbe = kartenFarbe(karte)
    println("Die gezogene Karte ist: [$karte] ($farbe)")

    // Schauen, ob gewonnen wurde:
    if ( (farbe == "Schwarz" && guess == 's') || (farbe == "Rot" && guess == 'r') ){
        println("Sie haben gewonnen!")
        return karte
    }
    else {
        println("Sie haben verloren")
        return null
    }
}

fun main(){
    val deck = kartendeck.toMutableList()
    deck.shuffle()
    while(deck.size > 2){
//        val karte1: String? = rotOderSchwarz(deck)

        val karte1 = deck.removeFirst()
        hoeherOderTiefer(deck, karte1)

        println("----")
    }
}