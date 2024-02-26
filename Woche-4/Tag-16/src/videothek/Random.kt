package videothek


// Diese Funktion erstellt eine zufällige Bewertung
fun randomRating(): Int{
    return (1..5).random()
}

/** Diese Funktion erstellt eine zufällige Anzahl (1-10) an Bewertungen
 *
 */
fun generateRatings(): MutableList<Int>{
    val ratings = mutableListOf<Int>()
    repeat((1..10).random()){
        ratings.add(randomRating())
    }
    return ratings
}

// TODO: Aufgabe 2: Zufällige Preise
fun randomPrice(min: Double = 2.0, max: Double = 5.0): Double{
    // Nicht möglich
//    (2.0..5.0).random()


    // Version 1: Liste mit verschiedenen Preisen
    /*
        var preise = listOf(2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0)
        return preise.random()
     */

    // Version 2: mit Random.nextDouble
//    return Random.nextDouble(min, max)

    // Version 3: Euro und Cent getrennt generieren
    val euro = (min.toInt()..< max.toInt()).random()
    val cent = (0..99).random()
    var preis = euro.toDouble() + cent/100.0


    /* Version 4:
    cent = (200..499).random()
    return cent / 100.0
    */

    // Optional: Preis auf 2 Komma stellen runden
    preis = "%.2f".format(preis).replace(',', '.').toDouble()

    return preis
}

