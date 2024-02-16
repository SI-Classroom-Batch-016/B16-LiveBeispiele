
fun main(){

    //  Liste anlegen
    var filmListe = listOf(
        "The Ring",
        "Inception",
        "Deadpool 1",
        "Deadpool 2",
        "Deadpool 3",
        "Findet Nemo",
        "James Bond",
        "Shrek"
    )

    //  Mit Liste arbeiten
    println("Wählen sie einen Film:")

    /*println("Drücken sie [0] für 'The Ring'")
    println("Drücken sie [1] für 'Inception'")
    println("Drücken sie [2] für 'The Ring'")
    println("Drücken sie [3] für 'The Ring'")
    println("Drücken sie [4] für 'The Ring'")*/

    filmListe.forEachIndexed { index, film ->
        println("Drücken sie $index für '$film'")
    }

    var eingabe: String = readln()
    eingabe.toIntOrNull() ?: println("Falsche Eingabe, du bekommst einen zufälligen Film")
    // filmListe.indices == (0..7)
    var index: Int = eingabe.toIntOrNull() ?: (filmListe.indices.random())
//    var index = readln().toInt()
//    filmListe.indices.contains(index)
    val film: String = filmListe[index]
    println("Sie haben den Film '$film' gewählt.")


    // alternative Eingabe:
    println("Welchen Film möchten sie sehen?")
    var eingabe2: String = readln().lowercase()
    val index2: Int = filmListe.indexOf(eingabe2)

    // Das Genre / Den Cast des Films ausdrucken
        // brauche eine Map, bei der jeder Film ein Genre bekommt
    val genreMap: Map<String, String> = mapOf(
        "the ring" to "Horror",
        "inception" to "Drama",
        "findet nemo" to "Animation",
        "james bond" to "Action",
        "shrek" to "Animation"
    )
        // aus Map das Genre auslesen
//    var genre: String? = genreMap[film]             // Werte aus Map auslesen - Null Safety
    var genre: String = genreMap[film] ?: "unbekannt"         // Werte aus Map auslesen - Null Safety

        // das Genre ausdrucken
    println("Der gewählte Film '$film' ist vom Genre '$genre'.")

    genre = genreMap[eingabe2] ?: "unbekannt"         // Werte aus Map auslesen - Null Safety
    println("Der gewählte Film '$eingabe2' ist vom Genre '$genre'")

    //  Map anlegen

    
    //  Mit Map arbeiten
    



}