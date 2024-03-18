package Kartenspiel

class Deck {
    // Das Deck hat einen Kartenstapel
    var kartenStapel = mutableListOf<Karte>()

    init {
        // Das Deck wird standardmässig mit 52 Karten befüllt
        for (suit in listOf("Kreuz", "Karo", "Herz", "Pik")){
            for (wert in listOf("Ass", "2", "3", "4", "5", "6","7", "8", "9", "10", "B", "D", "K")){
                kartenStapel.add(Karte(suit, wert))
            }
        }
    }

    fun mischen(){
        /**
         * Mischt das Deck einmal durch
         */
        kartenStapel.shuffle()
    }


    /**
     *   Erzeugt den Kartenstapel neu
     */
    fun reset(){
        kartenStapel.clear()
        for (suit in listOf("Kreuz", "Karo", "Herz", "Pik")){
            for (wert in listOf("Ass", "2", "3", "4", "5", "6","7", "8", "9", "10", "B", "D", "K")){
                kartenStapel.add(Karte(suit, wert))
            }
        }
    }


    /**
     *  Zieht die oberste Karte vom Stapel
     */
    fun karteZiehen(): Karte {
        return kartenStapel.removeFirst()
    }

}