val kartendeck : List<String> = listOf(
    "♠️A", "Pik Koenig", "Pik Dame", "Pik Bube", "Pik 10", "Pik 9",
    "Pik 8" , "Pik 7", "Pik 6", "Pik 5", "Pik 4", "Pik 3", "Pik 2",
    "Kreuz Ass", "Kreuz Koenig", "Kreuz Dame", "Kreuz Bube", "Kreuz 10", "Kreuz 9",
    "Kreuz 8" , "Kreuz 7", "Kreuz 6", "Kreuz 5", "Kreuz 4", "Kreuz 3", "Kreuz 2",
    "Herz Ass", "Herz Koenig", "Herz Dame", "Herz Bube", "Herz 10", "Herz 9",
    "Herz 8" , "Herz 7", "Herz 6", "Herz 5", "Herz 4", "Herz 3", "Herz 2",
    "Karo Ass", "Karo Koenig", "Karo Dame", "Karo Bube", "Karo 10", "Karo 9",
    "Karo 8" , "Karo 7", "Karo 6", "Karo 5", "Karo 4", "Karo 3", "Karo 2",
)

fun kartenWert(karte: String) :Int {
    var kartenWert = karte.split(" ")[1]

    return when(kartenWert){
        "2" -> 2
        "3" -> 3
        "4" -> 4
        "5" -> 5
        "6" -> 6
        "7" -> 7
        "8" -> 8
        "9" -> 9
        in listOf("10","Koenig","Dame","Bube" ) -> 10
        "Ass" -> 11
        else -> 0
    }
}

fun main(){
    var meinDeck = kartendeck.toMutableList()

    // Das Deck mischen:
    meinDeck.shuffle()

    // Die oberste Karte ziehen
    var karte = meinDeck.removeFirst()

    // Der Wert der Karte
    var beispielwert = kartenWert(karte)
    println("$karte gibt $beispielwert Punkte")


}