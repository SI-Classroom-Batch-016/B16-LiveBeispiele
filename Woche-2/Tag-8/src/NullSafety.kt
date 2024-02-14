
fun main(){
    /*
        !! Operator heißt "Ich bin mir sicher hier steht nicht null"
        ?.  Operator heißt "es könnte null sein, versuche zu rechnen, sonst null"
        ?: Elvis Operator heißt: "falls der Wert null ist, dann benutze den Default-Wert"
     */


    println("Geben sie ihr Geburtsjahr ein:")
    var geburtsJahr: Int? = readln().toIntOrNull()
//    var geburtsJahr: Int = readln().toIntOrNull() ?: 0
    println("Geboren: $geburtsJahr")

//    var alter: Int =  2024 - geburtsJahr!!
//    var alter: Int? =  geburtsJahr?.times(-1)?.plus(geburtsJahr)
    var alter = 2024 - (geburtsJahr ?: 0 )

    println("Alter: $alter")

    System.exit(0)

    println("------------")

    var text: String? = "Hallo"
    var inventar: List<String>? = null

    text?.length
    text?.lowercase()
    inventar?.sorted()


    // Patricks Beispiel mit Parkplätze

    var tiefGarage: MutableList<String?> = mutableListOf(
        "blauer BMW",
        null,
        null,
        "roter Toyota"
    )




    // Anwendungsbeispiele für Null-Safety

    var spielerListe: MutableList<String>? = mutableListOf()

    spielerListe?.add("Gordon")


    // Videospiel: Character kann 0-2 Waffen in seinen Händen tragen
    val schadenWaffe1: Int = 56
    val schadenWaffe2: Int? = null

    val gesamtSchaden = (schadenWaffe1) + (schadenWaffe2 ?: 0)
    println("Gesamtschaden: $gesamtSchaden")
    readlnOrNull() ?: ""


    // Formular: Adresseneingabe
    var adresse : String = readln()
    var adresseZusatz: String? = readlnOrNull()


    /* Tabelle mit leeren Zellen, zB:

        Name    Alter   Adresse
        Rudi     22
        Michi           Teststr 1
     */

}