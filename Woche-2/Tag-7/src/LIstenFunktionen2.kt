/*
    Diese Datei enthält Beispiele für diese Listen Funktionen:
        - .addAll
        - .remove / .removeAll
        - .contains / .containsAll

    Alle Funktionen mit "All" erwarten in den Klammern eine Kollektion (zB eine Liste, mutableListe, etc..)

 */
fun main(){

    val products: MutableList<String> = mutableListOf(
        "Mars",
        "Twix",
        "Bounty",
        "Haribo Goldbären",
        "Haribo Ballaballa",
        "Milka Vollmilch",
        "Milka Erdbeere"
    )
    val prices: MutableList<Double> = mutableListOf(
        1.0,
        1.0,
        1.0,
        2.0,
        2.0,
        2.5,
        2.5
    )

    // Enthält die Liste ein Produkt? -> .contains()
    var hatHaribo: Boolean = products.contains("Haribo")    // -> Ergebnis: false
    println("Produktliste enthält 'Haribo'? $hatHaribo")    // weil, Haribo keins der Produkte ist

    hatHaribo = products.contains("Haribo Goldbären")       // -> Ergebnis: true
    println("Produktliste enthält 'Haribo Goldbären'? $hatHaribo")


    // Enthält eine Liste mehrere Produkte? -> .containsAll
    val cocaColaProducts = listOf("Mars", "Twix", "Bounty", "MilkyWay", "KitKat")
    var hatAlle: Boolean = products.containsAll(cocaColaProducts)   // false, weil kein MilkyWay/Kitkat

    println("Unser Sort führt alle CocaCola Produkte? $hatAlle")

    // Mehrere Elemente hinzufügen -> .addAll
    products.addAll(cocaColaProducts)
    prices.addAll(listOf(1.0, 1.0, 1.0, 1.0, 1.5))

    println("\n---------------")
    println(products.sorted())   // jetzt haben wir einige Produkte doppelt :(


    // Entfernt ein Produkt (falls es existiert)
    products.clear()

    products.remove("Mars")    // entfernt 1 Vorkommnis von Mars
    products.removeAll(listOf("Mars")) // entfernt alle Vorkommnisse von Mars
    products.remove("Milka")    // macht nix

    println(products.sorted())

    // Entfernt alle Vorkommnisse von Produkt(en)
    products.removeAll(listOf("Twix", "Bounty"))
    products.removeAll(listOf("Milka"))     // macht nix
    println(products.sorted())




    // Frage: wie bekomme ich alle Produkte, die weniger als 2 Euro kosten
    val essen: List<Pair<String, Double>> = listOf()
    val getraenke: List<Pair<String, Double>> = listOf()

    val alleProdukte = essen + getraenke
    alleProdukte.filter {it.second <= 2.0}

}