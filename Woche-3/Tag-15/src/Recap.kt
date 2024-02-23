import kotlin.math.max

var kartenDeck = mutableListOf(
    "❤️A", "❤️K", "♠️A","♠️K",
    "❤️D", "❤️B", "♠️D","♠️B",
    "❤️10", "❤️9", "♠️10","♠️9",
    "❤️8", "❤️7", "♠️8","♠️7",
)

val kartenWerte = mapOf(
    "❤️A" to 11, "❤️K" to 10, "♠️A" to 11 ,"♠️K" to 10,
    "❤️D" to 10, "❤️B" to 10, "♠️D" to 10,"♠️B" to 10,
    "❤️10" to 10, "❤️9" to 9, "♠️10" to 10,"♠️9" to 9,
    "❤️8" to 8, "❤️7" to 7, "♠️8" to 8,"♠️7" to 7,
)


var handSpieler1 = mutableListOf<String>()
var handSpieler2 = mutableListOf<String>()


fun kartenMischen(){
    kartenDeck.shuffle()
}

fun kartenAusteilen(anzahl: Int = 1){
    repeat(anzahl) {
        val karte = kartenDeck.removeFirst()
        handSpieler1.add(karte)
        handSpieler2.add(kartenDeck.removeFirst())
    }
}

fun karteSpielen(hand: MutableList<String>): String{
    println("Wählen sie aus:")

    hand.forEachIndexed { index, karte ->
        println("Drücken sie '$index' für [$karte]")
    }

    var eingabe = readln().toIntOrNull()

    if (eingabe == null){
        println("Ungültige Eingabe")
        return karteSpielen(hand)       // Rekursion
    }

    val karte: String = hand.removeAt(eingabe)
    return karte
}

fun kartenWert(karte: String){
    val wert = kartenWerte[karte]

    println("Die Karte $karte hat einen Wert von ${wert}")
//    println("Die Karte $karte hat einen Wert von ${kartenWert(karte)}")

}

/**
 * @param karte1 Karte, welche Spieler 1 spielt
 * @param karte2 Karte, welche Spieler 2 spielt
 *
 * @return 0, wenn Spieler 1 gewinnt, 1, wenn spieler 2 gewinnt, -1 bei unentschieden
 */
fun kartenVergleich(karte1: String, karte2: String): Int{
    val punkte1 = kartenWerte[karte1]!!
    val punkte2 = kartenWerte[karte2]!!

    if (punkte1 == punkte2)
        return -1

    val gewinnerPunkte = max(punkte1, punkte2)
    val gewinner: Int = listOf(punkte1, punkte2).indexOf(gewinnerPunkte)

    if (gewinner == -1)
        println("Es gab ein Unentschieden")
    else
        println("Gewinner: ${listOf("Spieler1", "Spieler2")[gewinner]}")

    return gewinner

}

fun main(){

    kartenMischen()

    kartenWert(kartenDeck.random())



    println(kartenDeck)

    kartenAusteilen(4)

    println("Spieler1 : $handSpieler1")
    println("Spieler2 : $handSpieler2")

    println("-----")
    print("Spieler 1: ")
    val karteSpieler1: String = karteSpielen(handSpieler1)

    println("Karte 1: $karteSpieler1")

    println("-----")
    print("Spieler 2: ")
    val karte2 = karteSpielen(handSpieler2)
    println("Karte 2: $karte2")

    println("------")
    kartenVergleich(karteSpieler1, karte2)


}