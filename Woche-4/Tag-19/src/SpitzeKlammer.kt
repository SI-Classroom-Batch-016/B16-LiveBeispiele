import java.time.LocalDate

fun main(){
    // Datentyp einer Liste
    // Hier könnte der Datentyp weggelassen werden
    var filmListe: List<String> = listOf("Nemo", "Shrek", "Monsters Inc.")

    // Bei leeren Listen ist er erforderlich!
//    var wunschZettel = listOf() // Fehlerfaft
    var preisListe: List<Double> = listOf()
    var einkaufsWagen = listOf<String>()

    // Datentyp kann auch weggelassen werden, wenn er vom Compiler erschließbar ist
//    val artikel: List = listOf("Brot", "Croissant", "Semmel", "Breze")
    val anzahl = mutableListOf(3, 5, 14, 8)

    // Datentypen einer Map
    // Immer <Key, Value>
    val altersListe = mutableMapOf(
        //Datentypen können weggelassen werden, wenn sie erschließbar sind
        "Felix" to 49,
        "Manuel" to 51,
        "Jana" to 31,
        "Hannah" to 22
    )

//    val haustierMap = mapOf()
//    val haustierMap: Map<String, String> = mapOf()
//    val haustierMap = mapOf<String, String>()

    // Datentypen für Pairs und Triple
    var ehePaar: Pair<String, String> = "Jonny" to "Holly"
    var auto1: Triple<String, Double, Int>

    // Verschachtelte Klammern
    var addressBuch: MutableMap<String, MutableMap<String, String>> = mutableMapOf(
        "Jan" to mutableMapOf("Email" to "hjdh@hd.de", "Tel" to "1783736711")
    )

    println(altersListe.entries.toList()[0])    // Erstes Paar einer Map anzeigen

    // leere Maps erfordern den Datentyp
    var pokedex: Map<Int, String> = mapOf()
    var engToGer = mutableMapOf<String, String>()
//    var gerToEng = mutableMapOf() // Fehlerhaft

    zufallsWertEinerListe(listOf(1,23,3,3,3))
    zufallsWertEinerListe(listOf("8778", "7674", "hgjgdshf"))

    }

// Generische Funktion
fun <T> zufallsWertEinerListe(list: List<T>): T {
    return list.random()
}

fun zufallsWertEinerListe(list: List<Int>): Int {
    return list.random()
}

fun zufallsWertEinerListe(list: List<String>): String {
    return list.random()
}