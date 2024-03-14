fun main() {

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
        listOf("Banane Kirsch", "Wild Berries", "Detox")
    )

    // Wir müssen zuerst über die Liste mit Listen und anschließend innerhalb nochmals über die eigentliche
    // Bestellung iterieren
    var nummer = 1
    for (bestellung in bestellungen) {
        var kosten = 0.0

        for (item in bestellung) {
            // Sicherheit, falls Bestellung Item enthält das nicht in der Preisliste ist
            if (preisliste.keys.contains(item)) {
                kosten += preisliste[item]!!
            }
        }
        println("Kosten für Bestellung $nummer: $kosten")
        nummer++
    }


}