package automat


val automat: MutableMap<String, Double> = mutableMapOf(
    "Snickers" to 1.50,
    "Mars" to 1.50,
    "Twix" to 1.50,
    "Milky Way" to 1.00,
    "Kitkat" to 1.00,
    "Haribo Goldbären" to 2.00,
    "Haribo Balla Balla" to 2.00
)

var guthaben: Double = 10.0
var auswahl: String = ""

fun main() {
    /* TODO:
        Rufe hier die anderen 3 Funktionen in der richtigen Reihenfolge auf.
           Schaffst du es auch, dass der Automat nicht nach einer Auswahl beendet ist?
     */

    angebotAnzeigen()
    auswahlTreffen()
    rueckgeldBerechnen()
    println("--------")
    Thread.sleep(2500)
    main()

}

fun angebotAnzeigen() {
    /* TODO:
        Diese Funktion soll mit Hilfe der Println() eine saubere Übersicht bieten,
            über alle zur Auswahl stehenden Produkte und Preise.
        Idealerweise, beschreibt diese Ausgabe auch, welche Eingabe für welches Produkt zu treffen ist.
     */
    automat.entries.forEachIndexed { index, (produkt, preis) ->
        println("Wählen sie [${index + 1}] für $produkt ($preis €)")
        Thread.sleep(200)
    }
}


fun auswahlTreffen() {
    /* TODO:
        Diese Funktion soll dem Kunden erlauben, via der Konsole ein Produkt aus dem Automaten zu wählen,
            zB via einer Zahleneingabe.

       TIP: automat.keys[index]
     */

    print("Wählen sie ihr Produkt: ")
    val eingabe = readln().toInt() - 1
    auswahl = automat.keys.elementAt(eingabe)

    val preis = automat[auswahl]!!
    println("Sie haben sich für $auswahl ($preis €) entschieden!")
    Thread.sleep(1000)
}


fun rueckgeldBerechnen() {
    /* TODO:
        Diese Funktion soll das verbleibende Guthaben im Automaten berechnen
     */

    val preis = automat[auswahl]!!
    guthaben -= preis

    println("Ihr verbleibendes Guthaben: $guthaben €")

}
