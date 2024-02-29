fun main(){
    /*
    [  Option 5
    ]  Option 6

    TODO:
        Listen Indizierung
           - muss ein Integer sein
           - Indices fangen immer bei 0 an!
           - Aufpassen mit IndexOutOfBoundsException
     */
    val einkaufswagen =  mutableListOf("Spagetti", "Hähnchenbrust", "Zitrone", "Creme Fraiche")
    // Mit Index abfragen
    einkaufswagen[0]      // Spagetti
//    einkaufswagen[0.0]      // Double sind keine Indices

    // Mit Index verändern
    einkaufswagen[3] = "Sahne"

    // Neuen Artikel hinzufügen
    einkaufswagen.add(3, "Parmesan")

    // Dreitausch
    var alterWert = einkaufswagen[3]
    einkaufswagen[3] = einkaufswagen[0]
    einkaufswagen[0] = alterWert

    // Vorsicht mit IndexOutOfBoundsException!
//    einkaufswagen[-1]
//    einkaufswagen[5]


    /* TODO:
          Map Indizierung
            - Indizierung via Key (=Schlüssel) -> Datentypen beachten
            - Aufpassen mit null
     */
    val artikelListe = mutableMapOf(
        "Creme Fraiche" to 1.99,
        "Hähnchenbrust" to 3.45,
        "Sahne" to 0.67,
        "Spagetti" to 0.99,
        "Zitrone" to 0.34
    )

    artikelListe.keys.elementAt(4)

    // Werte abfragen: Vorsicht mit Null
    val sahnePreis: Double? = artikelListe["Sahne"]     // 0.67 als Double?
//    val sahnePreis: Double? = artikelListe[0]     // richtigen Datentyp für Key benutzen!
    val spagettiPreis: Double? = artikelListe["spageti"]  // null
    //    var zitronePreis = artikelListe["zitrone"] ?: -1.0

    println("Welchen Preis willst du wissen, geben sie den Artikel ein:")
    var key = readln()
    if (key in artikelListe.keys) {
        var artikelPreis: Double = artikelListe[key]!!    // 0.34
    }
    // Vorsicht: NullPointerException
    var zitronePreis = artikelListe["zitrone"] !! // NullPointerException

    // Werte hinzufügen bzw verändern
    artikelListe["Parmesan"] = 4.20
    artikelListe["Sahne"] = 0.8             // Existierende Schlüssel werden überschrieben
    artikelListe["Pfeffer"] = 1.99
//    artikelListe[neuerSchlüssel] = neuerWert
//    artikelListe[alterSchlüssel] = neuerWert

    /* TODO:
            String Indizierung:
                Integer Indices ähnlich wie Listen
     */
    val vorname = "Max"
    val nachname = "Musterfrau"

    // Werte abfragen
    var erstesZeichen: Char = vorname[0]  // M
    vorname[1]  // a
//    vorname[5]  // String Index Out Of Bounds Exception

    // Vorsicht: Strings sind nicht mutable (=veränderbar)
//     nachname[1] = 'a'

    // Lösung: kotlin.text.StringBuilder -> MutablerString
    val nachName = StringBuilder("Musterfrau")
    nachName[1] = 'a'
    println(nachName) // Masterfrau
    // man kann von und zu StringBuilder konvertieren
    StringBuilder(vorname)
    nachName.toString()

    // TODO: Bei Sets aufpassen
    var artikelIDs = mutableSetOf(
        "11", "123","12388", "981","46"
    )

    // Werte abfragen
//    println(artikelIDs[2])
    println(artikelIDs.elementAt(2))
    println(artikelIDs.toList()[2])

    // Wert verändern
//    artikelIDs[1] = "452"
    // Stattdessen alten Wert löschen, und neuen hinzufügen
    artikelIDs.add("452")
    artikelIDs.remove("123")
}