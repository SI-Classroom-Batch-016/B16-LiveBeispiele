
fun main(){
    // Ein Paar erstellen
    val ehePaar: Pair<String, String> = "Brad Pitt" to "Jennifer Anniston"
    val ehePaar2: Pair<String, String> = Pair("Brad Pitt", "Angie Jolie")
    var productMitPreis = Pair("Apfel", 0.44)

    // erster Wert:
    ehePaar.first

    // zweiter Wert:
    ehePaar.second

    // Liste aus Pairs
    var productKatalog: MutableList<Pair<String, Double>> = mutableListOf(
        "Twix" to 1.50,
        "Mars" to 1.50,
        "Coca Cola 0.33l" to 2.5
    )

    productKatalog.add(Pair("Nestea 0.33", 2.99))

    val erstesProduct = productKatalog[0]
    val nameProduct = erstesProduct.first
    val preisProduct = erstesProduct.second
    println("$nameProduct: $preisProduct")

    // Für 3 Werte: Triple
    var triple: Triple<String, Int, Double>  = Triple("Apfel", 4, 0.44)


}