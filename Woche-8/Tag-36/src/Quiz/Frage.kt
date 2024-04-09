package Quiz

class Frage(
    private val frageText: String,
    val kategorie: Kategorie,
    private val richtigeAntwort: String,
    antwortMoeglichkeiten: List<String>
) {

    private val antwortMoeglichkeiten: MutableList<String> = antwortMoeglichkeiten.shuffled().toMutableList()

    fun frageAnzeigen() {
        println("---------")
        println(frageText)
        antwortMoeglichkeiten.forEachIndexed{ i, text ->
            println("${i + 1}): $text")
        }
        println("---------")
    }

    fun frageBeantworten(spieler: Spieler): Boolean {
        println("---------")
        println("$UNDERLINE${spieler.name}$RESET: Gib deine Antwort ein:")

        val antwort: String = antwortMoeglichkeiten[readln().toInt() - 1]
        val antwortKorrekt: Boolean = antwort.equals(richtigeAntwort, true)

        if (antwortKorrekt) {
            println("${GREEN}RICHTIG! :)$RESET")
            spieler.punkte++
        }
        else
            println("${RED}FALSCH :( $RESET")


        println("---------")
        return antwortKorrekt
    }
}