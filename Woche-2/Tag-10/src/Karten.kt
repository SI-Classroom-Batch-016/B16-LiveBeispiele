
val kartenDeck: List<String> = listOf(
    "♣️A️",
    "♣️K",
    "♣️D",
    "♣️B",
    "❤️A️",
    "❤️K",
    "❤️D",
    "❤️B",
)

val kartenWerte: Map<String, Int> = mapOf(
    "♣️A️" to 10,
    "♣️K" to 5,
    "♣️D" to 3,
    "♣️B" to 2,
    "❤️A️" to -10,
    "❤️K" to -5,
    "❤️D" to -3,
    "❤️B" to -2,
)

fun main(){
    val kartenStapel: MutableList<String> = kartenDeck.shuffled().toMutableList()

    // Ziehen die erste Karte vom Stapel
    println("-------")
    println("Runde 1:")
    var spieler1Karte: String = kartenStapel.removeFirst()
    var spieler2Karte: String = kartenStapel.removeFirst()
    var spieler3Karte: String = kartenStapel.removeFirst()

    // Punkte für Karten
    var spieler1Punkte: Int = kartenWerte[spieler1Karte] ?: 0
    var spieler2Punkte: Int = kartenWerte[spieler2Karte] !!
    var spieler3Punkte: Int = kartenWerte[spieler3Karte] !!

    println("Spieler 1: $spieler1Karte")
    Thread.sleep(1000)
    println("Spieler 2: $spieler2Karte")
    Thread.sleep(1000)
    println("Spieler 3: $spieler3Karte")
    Thread.sleep(1000)


    // Runde 2:
    println("-------")
    println("Runde 2:")

    spieler1Karte = kartenStapel.removeFirst()
    spieler2Karte = kartenStapel.removeFirst()
    spieler3Karte = kartenStapel.removeFirst()

    println("Spieler 1: $spieler1Karte")
    Thread.sleep(1000)
    println("Spieler 2: $spieler2Karte")
    Thread.sleep(1000)
    println("Spieler 3: $spieler3Karte")
    Thread.sleep(1000)

    spieler1Punkte += kartenWerte[spieler1Karte] !!
    spieler2Punkte += kartenWerte[spieler2Karte] ?: 0
    spieler3Punkte += kartenWerte[spieler3Karte] ?: 0

    println("-------")
    // Wer hat gewonnen?
    val punkteListe: List<Int> = listOf(spieler1Punkte, spieler2Punkte, spieler3Punkte)

    println("Endstand:")
    Thread.sleep(5000)
    punkteListe.forEachIndexed { index, punktzahl ->
        println("Spieler ${index+1}: $punktzahl ")
    }



    val maxPunkte = punkteListe.max()
    val indexVonGewinner: Int = punkteListe.indexOf(maxPunkte) + 1
    println("Gewinner ist Spieler $indexVonGewinner")

    println("--------")

    // Wie kann ich eine zufällige Karte entfernen?
    val entfernteKarte: String = kartenStapel.random()
    kartenStapel.remove(entfernteKarte)

    // Ziehe eine zufällige Karte von der Hand von Spieler 1 und gebe sie zu Spieler2
    // val zufallsKarte = hand1.random()
    // hand1.remove(zufallsKarte)
    // hand2.add(zufallsKarte)

    // Problem: Wert von Map lesen ist nullable
    val wertVonKarte: Int? = kartenWerte[entfernteKarte]

    // Lösungen:
//    val wertVonKarte: Int = kartenWerte[entfernteKarte]!!
//    val wertVonKarte: Int = kartenWerte[entfernteKarte] ?: 0

    println("Die Karte [$entfernteKarte] gibt $wertVonKarte Punkte")


}