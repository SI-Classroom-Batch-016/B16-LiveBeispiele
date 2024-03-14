
// Map mit Artikeln zugeordnet zu dne Preisen
var preisliste: MutableMap<String, Double> = mutableMapOf(
    "Tropical" to 3.49,
    "Erdbeere Mango" to 2.99,
    "Banane Kirsch" to 2.99,
    "Detox" to 3.99,
    "Wild Berries" to 3.49
)

// Liste mit Listen von Bestellungen
val bestellungen: List<List<String>> = listOf(
    listOf("Tropical", "Detox"),
    listOf("Banane Kirsch"),
    listOf("Erdbeere Mango", "Erdbeere Mango"),
    listOf("EXPLOSIONS", "Banane Kirsch"),
    listOf(),
    listOf("Banane Kirsch", "Wild Berries", "Detox")
)


fun main(){
    // für jede bestellung:
    for (bestellung in bestellungen){
        // Preis ausgeben:
        println("$bestellung kostet ${preisAusrechnen(bestellung)}")
    }
}

fun preisAusrechnen(bestellung: List<String>): Double{
    // 	summe = 0.0
    var gesamtPreis: Double = 0.0
    // für jeden smoothie in der bestellung:
    for (smoothie in bestellung){
        // preis Abfragen
        var preis = preisAbfragen(smoothie)
        // preiseZusammenzählen
        gesamtPreis += preis
    }

    // Oder so:
    gesamtPreis = bestellung.sumOf { smoothie ->
        preisAbfragen(smoothie)
    }

    return gesamtPreis
}

fun preisAbfragen(smoothie: String): Double{
    // Warnung hinzufügen, Smoothie existiert nicht
    if (smoothie !in preisliste){
        println("Der Smoothie '$smoothie' existiert nicht")
    }

    // preisliste [zutat]
    var preis: Double = preisliste[smoothie] ?: 0.0

    return preis
}

