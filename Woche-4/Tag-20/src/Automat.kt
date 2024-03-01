package automat

var guthaben: Double = 0.0
var produktAuswahl: Int = 0

/**
 * Unser Automat speichert für jede Produkt-Nr (Int)
 *   ein Produkt (String) mit dessen Preis (Double)
 *
 *  Das Sortiment wird durch eine Map repräsentiert,
 *   wobei der Schlüssel die Produkt-Nummer ist
 *   und der Wert ein Paar (name, preis) darstellt.
 */
var sortiment: MutableMap<Int, Pair<String, Double>> = mutableMapOf(
    11 to Pair("Twix", 1.50),
    12 to Pair("Mars", 1.50),
    13 to Pair("Snickers", 1.50),
    21 to Pair("Haribo Goldbären", 2.0),
    22 to Pair("Pombären Classic", 2.0),
    23 to Pair("Chio Paprika", 2.0),
    31 to Pair("Nestea Zitrone", 2.5),
    32 to Pair("Coca Cola", 2.5),
    33 to Pair("Lift Apfelschorle", 2.5)
)

fun main() {
    hauptmenu()
}

fun hauptmenu() {
    println("\n-----------------")
    println("Aktuelles Guthaben: $guthaben €")
    println("Willkommen im Hauptmenü, bitte wählen sie:")
    println(
        """
        1 -> Produktwahl
        2 -> Geld Einwerfen
        3 -> Geld Zurück
        4 -> Automat Beenden
    """.trimIndent()
    )

    var eingabe: String = readln()

    when (eingabe) {
        "1" -> {
            produktWahl()
            hauptmenu()
        }
        "2" -> {
            geldEinwerfen()
            hauptmenu()
        }
        "3" -> {
            geldZurueck()
            hauptmenu()
        }
        "4" -> return
        else -> {
            println("Ungültige Eingabe!")
            hauptmenu()
        }
    }
}

fun produktWahl() {
    println("\n Wählen sie ein Produkt: ")

    alleProdukteAusdrucken()

    // Versuche eine Produkt NR einzugeben:
    try {
        produktAuswahl = readln().toInt()
    }
    // Falls das nicht gelingt, zurück zum Hauptmenu
    catch (ex: Exception) {
        println("Ungültige Eingabe. Sie müssen eine ProduktNr eingeben")
    }

    if (produktAuswahl in sortiment.keys) {
        // ich bin mir sicher das Produkt existiert, also problemlos !!
        val produkt = sortiment[produktAuswahl]!!
        val name = produkt.first
        val preis = produkt.second

        // Wenn das Guthaben für das gewählte Produkt ausreicht, kaufe es
        if (preis <= guthaben) {
            println("Sie haben $name für $preis € gekauft.")
            guthaben -= preis
        }
        // Ansonsten zurück zum Hauptmenü
        else {
            println("Nicht genug Guthaben für $name")
        }
    } else {
        println("Ungültige Produktauswahl")
    }
}

fun geldEinwerfen() {
    println("Werfen sie jetzt eine Münze ein:\n(wir akzeptieren nur 2€, 1€ und 50c Münzen)")

    val eingabe = readln()
    var betrag: Double

    try {
        betrag = eingabe.toDouble()
        // Nutzer hat einen Betrag eingetippt:
        when (betrag) {
            0.5, 1.0, 2.0 -> guthaben += betrag
            else -> {
                println("Ungültige Münze, probieren sie es nochmal: ")
                geldEinwerfen()
            }
        }
    } catch (ex: Exception) {
        println("Ungültige Eingabe, probieren sie es nochmal: ")
        geldEinwerfen()
    }

    // Nachdem Betrag eingeworfen wurde, zurück zum Hauptmenu
}

fun geldZurueck() {
    println("Entnehmen sie ihr restliches Guthaben: $guthaben €")
    guthaben = 0.0
}


/**
 * Diese Funktion gibt eine Liste aller Produkte im Sortiment aus, einschließlich ihres Namens und Preises.
 *
 *  Das Sortiment wird durch eine Map repräsentiert,
 *  wobei der Schlüssel die Produkt-Nummer ist und
 *  der Wert ein Paar (name, preis) darstellt.
 *
 *  Die Ausgabe erfolgt in folgendem Format für jedes Produkt:
 *  "Produkt-Nummer: Produktname (Preis in Euro)
*/
fun alleProdukteAusdrucken(){
    sortiment.forEach { nr, produkt ->
        // Produkt ist ein Paar = (name, preis)
        println("$nr:  ${produkt.first} (${produkt.second}€)")
    }
}

