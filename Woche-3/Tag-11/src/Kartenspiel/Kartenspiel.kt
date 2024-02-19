package Kartenspiel

/*
In der Variable cards ist ein Kartenset in Form einer Liste gespeichert.
Beispiel:
    "♥️7" steht für die Karte "Herz Sieben"
    "♥️A" steht für die Karte "Herz Ass"
 */
var cards: List<String> = listOf(
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

/*
In der Variable values sind die Werte der Karten in einer Map gespeichert.
Beispiel:
    "♥️7" to 1 steht für einen Wert von 1 für die Karte "Herz Sieben"
    "♥️A" to 8 steht für einen Wert von 8 für die Karte "Herz Ass"
Bei einem Vergleich der Werte würde also das "Herz Ass" gewinnen
 */
val cardValues: Map<String, Int> = mapOf(
    "♥️7" to 1, "♦️7" to 1, "♠️7" to 1, "♣️7" to 1,
    "♥️8" to 2, "♦️8" to 2, "♠️8" to 2, "♣️8" to 2,
    "♥️9" to 3, "♦️9" to 3, "♠️9" to 3, "♣️9" to 3,
    "♥️10" to 4, "♦️10" to 4, "♠️10" to 4, "♣️10" to 4,
    "♥️B" to 5, "♦️B" to 5, "♠️B" to 5, "♣️B" to 5,
    "♥️D" to 6, "♦️D" to 6, "♠️D" to 6, "♣️D" to 6,
    "♥️K" to 7, "♦️K" to 7, "♠️K" to 7, "♣️K" to 7,
    "♥️A" to 8, "♦️A" to 8, "♠️A" to 8, "♣️A" to 8,
    "🃏JOKER" to 10
)

fun main() {

    // Aufgabe 1: Kartenstapel mischen
    val deck: MutableList<String> = cards.toMutableList()
    deck.shuffle()

    // Aufgabe 2: Spielernamen eingeben
    println("Spieler 1, bitte gib deinen Namen ein...")
    val player1Name = readln()
    println("Spieler 2, bitte gib deinen Namen ein...")
    val player2Name = readln()
    println()

    // Aufgabe 3: Karten ziehen
    val player1Cards: MutableList<String> = mutableListOf()
    val player2Cards: MutableList<String> = mutableListOf()

    // Beide Spieler ziehen eine karte
    repeat(3) {
        println("$player1Name zieht eine Karte...")
        var gezogeneKarte = deck.removeFirst()
        player1Cards.add(gezogeneKarte)

        Thread.sleep(200)

        println("$player2Name zieht eine Karte...")
        player2Cards.add(deck.removeFirst())

        Thread.sleep(200)
    }

/*
    // Beide Spieler ziehen eine karte (2. Karte)
    println("$player1Name zieht eine Karte...")
    player1Cards.add(deck.removeFirst())
    println("$player2Name zieht eine Karte...")
    player2Cards.add(deck.removeFirst())

    // Beide Spieler ziehen eine karte (3. Karte)
    println("$player1Name zieht eine Karte...")
    player1Cards.add(deck.removeFirst())
    println("$player2Name zieht eine Karte...")
    player2Cards.add(deck.removeFirst())
    */

    // Hände ausdrucken:
    println()
    println("${player1Name}'s Karten: $player1Cards")
    println("${player2Name}'s Karten: $player2Cards")
    println()

    // Aufgabe 4: Spieler stehlen Gegner-Karte
    val player2Card = player2Cards.random()
    player2Cards.remove(player2Card)
    player1Cards.add(player2Card)

    println("$player1Name hat die Karte $player2Card von $player2Name gestohlen")

    val player1Card = player1Cards.random()
    println("$player2Name hat die Karte $player1Card von $player1Name gestohlen")
    player1Cards.remove(player1Card)
    player2Cards.add(player1Card)

    // Neue Hände anzeigen
    println()
    println("️${player1Name}'s Karten: \n   ${player1Cards.joinToString("\n   ")}")
    println("${player2Name}'s Karten: $player2Cards")
    
    println()

    // Aufgabe 5: Spieler dürfen Karte neu ziehen
    println("$player1Name, wirf eine Karte ab! Welche willst du abwerfen? ${1..player1Cards.size}")
    val indexPlayer1 = readln().toInt() - 1
    val removedCardPlayer1 = player1Cards.removeAt(indexPlayer1)

    var newCardPlayer1 = deck.removeFirst()
    player1Cards.add(newCardPlayer1)
    println("$player1Name hat die Karte $removedCardPlayer1 abgeworfen und die Karte $newCardPlayer1 gezogen")

    println()

    println("$player2Name, wirf eine Karte ab! Welche willst du abwerfen? 1 / 2 / 3")
    val indexPlayer2 = readln().toInt() - 1
    val removedCardPlayer2 = player2Cards.removeAt(indexPlayer2)

    val newCardPlayer2 = deck.removeFirst()
    player2Cards.add(newCardPlayer2)
    println("$player2Name hat die Karte $removedCardPlayer2 abgeworfen und die Karte $newCardPlayer2 gezogen")

    println()

    // Intermezo: Schlechteste Karte abwerfen
    val player1CardValues = listOf(
        cardValues[player1Cards[0]]!!,
        cardValues[player1Cards[1]]!!,
        cardValues[player1Cards[2]]!!,
    )

    val player1WorstValue = player1CardValues.min()
    var player1IndexWorstCard = player1CardValues.indexOf(player1WorstValue)
    val player1WorstCard = player1Cards.removeAt(player1IndexWorstCard)
    newCardPlayer1 = deck.removeFirst()
    player1Cards.add(newCardPlayer1)

    println("$player1Name hat die Karte $player1WorstCard abgeworfen und die Karte $newCardPlayer1 gezogen")

/*
    val randomCard = deck.random()
    val kartenFarbe = randomCard[0]
    val kartenWert = randomCard[2]
*/


    // Aufgabe 6: Wer hat bessere Karten?
    var player1HandValue = 0
    player1HandValue += cardValues[player1Cards[0]]!!
    player1HandValue += cardValues[player1Cards[1]]!!
    player1HandValue += cardValues[player1Cards[2]]!!

    var player2HandValue = player2Cards.sumOf { karte ->
        cardValues[karte]!!
    }

    println("$player1Name's Karten $player1Cards haben einen Wert von: $player1HandValue")
    println("$player2Name's Karten $player2Cards haben einen Wert von: $player2HandValue")
    println()


    var allenPunktzahlen = listOf(player1HandValue, player2HandValue)
    var hoeherePunktzahl = allenPunktzahlen.max()
    var index = allenPunktzahlen.indexOf(hoeherePunktzahl)

    var gewinner: String = listOf(player1Name, player2Name)[index]

    println("Die GewinnerIn ist: $gewinner")

}