
fun main(){

    // Ein Paar ist eine weitere Datenstruktur:
    var ehePaar: Pair<String, String> = Pair("Brad Pitt", "Jennifer Aniston")
    var ehePaarV2 = "Brad Pitt" to "Jennifer Aniston"

    // Zugriff auf einzelne Teile:
    ehePaar.first   // Brad Pitt
    ehePaar.second  // Jennifer Aniston

    // Paare sind nicht Mutable
//    ehePaar.second = "Angelina Julie"     // Fehler
    ehePaar = "Brad Pitt" to "Angelina Jolie"   // neues Paar erstellen


    // Verknüpfung der Listen via zip
    val artikelListe: List<String> = listOf(
        "Twix",
        "Mars",
        "Snickers"
    )
    val preisListe: List<Double> = listOf(
        1.5,
        1.99,
        1.5
    )
    val paarListe: List<Pair<String, Double>> = artikelListe.zip(preisListe)
    println("Liste aus Paaren: $paarListe")

    // Konvertierung zur Map (kann idR auf Listen von Paaren angewandt werden
    var artikelToPreis: Map<String, Double> = paarListe.toMap()
    println("Map: $artikelToPreis")

}