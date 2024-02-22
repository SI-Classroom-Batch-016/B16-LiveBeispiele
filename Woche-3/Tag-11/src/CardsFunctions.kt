import Kartenspiel.cardValues

var cards = mutableListOf<String>()
val player1Cards = mutableListOf<String>()
val player2Cards = mutableListOf<String>()

var player1HandValue = 0
var player2HandValue = 0

fun main() {
    /*
        In der Regel versucht man die Main-Funktion so 'ordentlich' wie möglich zu halten.
        Der Großteil des Programms spielt sich also nicht in der Main-Funktion ab

        D.h.:
        - Teile des Programms in Funktionen auslagern
        - Funktionen werden von der main-Funktion aufgerufen
     */
    cardGame()
}


fun cardGame() {
    neuerKartenstapel()
    kartenMischen()
    kartenAusteilen()
    kartenAnzeigen()
    punktzahlenBerechnen()
    punktzahlenAnzeigen()
}

fun neuerKartenstapel() {
    cards = mutableListOf(
        "♥️7", "♦️7", "♠️7", "♣️7",
        "♥️8", "♦️8", "♠️8", "♣️8",
        "♥️9", "♦️9", "♠️9", "♣️9",
        "♥️10", "♦️10", "♠️10", "♣️10",
        "♥️B", "♦️B", "♠️B", "♣️B",
        "♥️D", "♦️D", "♠️D", "♣️D",
        "♥️K", "♦️K", "♠️K", "♣️K",
        "♥️A", "♦️A", "♠️A", "♣️A",
        "🃏JOKER"
    )
}

fun kartenMischen() {
    cards.shuffled()
}

fun kartenAusteilen() {
    // Beide Spieler ziehen eine karte
    println("Spieler 1 zieht eine Karte...")
    player1Cards.add(cards.removeFirst())
    println("Spieler 2 zieht eine Karte...")
    player2Cards.add(cards.removeFirst())

    // Beide Spieler ziehen eine karte (2. Karte)
    println("Spieler 1 zieht eine Karte...")
    player1Cards.add(cards.removeFirst())
    println("Spieler 2 zieht eine Karte...")
    player2Cards.add(cards.removeFirst())

    // Beide Spieler ziehen eine karte (3. Karte)
    println("Spieler 1 zieht eine Karte...")
    player1Cards.add(cards.removeFirst())
    println("Spieler 2 zieht eine Karte...")
    player2Cards.add(cards.removeFirst())
}

fun kartenAnzeigen() {
    println()
    println("Spieler 1 Karten: $player1Cards")
    println("Spieler 2 Karten: $player2Cards")
    println()
}

fun punktzahlenAnzeigen() {
    println("Die Karten von Spieler 1 haben einen Wert von: $player1HandValue")
    println("Die Karten von Spieler 2 haben einen Wert von: $player2HandValue")
}

fun punktzahlenBerechnen() {
    player1HandValue += cardValues[player1Cards[0]]!!
    player1HandValue += cardValues[player1Cards[1]]!!
    player1HandValue += cardValues[player1Cards[2]]!!

    player2HandValue += cardValues[player2Cards[0]]!!
    player2HandValue += cardValues[player2Cards[1]]!!
    player2HandValue += cardValues[player2Cards[2]]!!

    // Man kann auch problemlos Funktionen innerhalb anderer Funktionen nutzen:
    punktzahlenAnzeigen()
}

