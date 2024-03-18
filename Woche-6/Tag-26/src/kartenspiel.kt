val kartendeck : List<String> = listOf(
    "Pik Ass", "Pik Koenig", "Pik Dame", "Pik Bube", "Pik 10", "Pik 9",
    "Pik 8" , "Pik 7", "Pik 6", "Pik 5", "Pik 4", "Pik 3", "Pik 2",
    "Kreuz Ass", "Kreuz Koenig", "Kreuz Dame", "Kreuz Bube", "Kreuz 10", "Kreuz 9",
    "Kreuz 8" , "Kreuz 7", "Kreuz 6", "Kreuz 5", "Kreuz 4", "Kreuz 3", "Kreuz 2",
    "Herz Ass", "Herz Koenig", "Herz Dame", "Herz Bube", "Herz 10", "Herz 9",
    "Herz 8" , "Herz 7", "Herz 6", "Herz 5", "Herz 4", "Herz 3", "Herz 2",
    "Karo Ass", "Karo Koenig", "Karo Dame", "Karo Bube", "Karo 10", "Karo 9",
    "Karo 8" , "Karo 7", "Karo 6", "Karo 5", "Karo 4", "Karo 3", "Karo 2",
)

//gibt den Wert der Kart als Parameter uebergebenen Kartezurueck.
// z.B.: "Kreuz 7" -> 7  | "Herz König" -> 10 | ...
fun kartenWert(karte: String): Int {
    var kartenWert = karte.split(" ")[1]

    return when(kartenWert){
        "Ass" -> 1
        "2" -> 2
        "3" -> 3
        "4" -> 4
        "5" -> 5
        "6" -> 6
        "7" -> 7
        "8" -> 8
        "9" -> 9
        "10" -> 10
        "Bube" -> 11
        "Dame" -> 12
        "Koenig" -> 13
        else -> 0
    }
}

// gibt die Farbe der uebergebenen Kart zurueck
fun kartenFarbe(karte: String): String {
    val kartenSymbol = karte.split(" ")[0]

    return when(kartenSymbol) {
        in listOf("Pik", "Kreuz") -> "Schwarz"
        in listOf("Herz", "Karo") -> "Rot"
        else -> ""
    }
}

fun main(){
    gluecksSpiel()
}

val gewinnFaktor = 2


fun hoeherOderTiefer(deck: MutableList<String>, karte1: String): Boolean{
    val wert1 = kartenWert(karte1)
    println("Die erste Karte ist: [$karte1] ($wert1)")

    // Lässt den Spieler raten
    println("Was ist die nächste Karte? Höher (h) oder Tiefer (t)?")
    val guess = readln().lowercase().first()

    // zieht eine Karte und deckt sie auf
    val karte2 = deck.removeFirst()
    val wert2 = kartenWert(karte2)
    println("Die gezogene Karte ist: [$karte2] ($wert2)")

    // Schauen, ob gewonnen wurde:
    if ( (wert2 > wert1 && guess == 'h') || (wert2 < wert1 && guess == 't')){
        println("Sie haben gewonnen!")
        return true
    }
    else {
        println("Sie haben verloren")
        return false
    }

}

fun geldBieten(konto: Double, minGebot: Double = 5.0): Double{
    var gebot: Double? = null

    while (gebot == null) {
        println("Sie haben noch $konto €")
        println("Setzen sie jetzt ihr Gebot:")
        val input: String = readln()

        try {
            gebot = input.toDouble()

            if (gebot > konto){
                println("Nicht ausreichender Kontostand um $gebot zu setzen.")
                gebot = null
            }
            else if (gebot < minGebot){
                println("Mindestgebot sind $minGebot€, bieten sie also mehr")
                gebot = null
            }
        } catch (ex: Exception){
            println("Fehlerhafte Eingabe!")
        }
    }
    return gebot
}

fun gluecksSpiel(){
    var kontoStand = 25.0
    // Das Deck wird erstellt und gemischt
    var deck: MutableList<String> = kartendeck.toMutableList()
    deck.shuffle()

    while (kontoStand >= 5 && deck.size > 2){
        val gebot = geldBieten(kontoStand)
        var gewonnen: Boolean

        // Spiele eine Runde Rot oder Schwarz
        // Ich merke mir die 1. Karte (für Höher oder Tiefer)
        val karte1: String? = rotOderSchwarz(deck)

        // Falls gewonnen, spiele Höher oder Tiefer
        if (karte1 != null)
            gewonnen = hoeherOderTiefer(deck, karte1)
        else
            gewonnen = false

        // Falls beide gewonnen, zahle Geld aus
        if (gewonnen)
            kontoStand += gewinnFaktor * gebot
        else
            kontoStand -= gebot

        println("\n\t Ihr neuer Kontostand ist: $kontoStand")

        // Optional: Weiterspielen Frage
        println("Möchten sie nochmal spielen? J/N")
        if (readln().lowercase().first() == 'n')
            break

        // OPTIONAL: Falls nicht mehr genug Karten im Deck sind, mische neu
        if (deck.size < 15){
            deck = kartendeck.toMutableList()
            deck.shuffle()
        }


        if (kontoStand < 5){
            println("Sie haben keine Chips mehr, wie viel wollen sie wieder einzahlen")
            val einzahlung = readln().toDouble()
            kontoStand += einzahlung
        }

    }
}

