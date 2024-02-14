
fun main(){

    /*
        Gegeben ist eine Liste aus Produkten, inkl. Artikel Name und Preis

        TODO:
            Deine Aufgabe ist es einem Nutzer eine Preisabfrage der Artikel via der Konsole zu ermöglichen
     */

    var automat: List<Pair<String, Double>> = listOf(
        "Twix" to 2.00,
        "Mars" to 2.00,
        "Chio Chips" to 2.50,
        "Lays Chips" to 2.50,
        "Coca Cola 0.33" to 3.00,
        "Fanta 0.33" to 3.00,
        "Sprite 0.33" to 3.00,
    )

    println("""
        Wählen sie eines der Produkte für eine Preisabfrage:
        0 für Twix
        1 für Mars
        2 für Chio Chips
        3 für Lays Chips
        4 für Coca Cola 0.33
        5 für Fanta 0.33
        6 für Sprite 0.33
    """.trimIndent())

    val auswahl = readln().toInt()
    val (produkt, preis) = automat[auswahl]

    println("$produkt kostet $preis €")

}