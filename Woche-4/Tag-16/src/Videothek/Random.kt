package Videothek
import kotlin.random.Random


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
    // Einfachste Lösung:
    /*
        var preise = listOf(2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0)
        return preise.random()
     */

    var euro = (min.toInt()..< max.toInt()).random()
    var cent = (0..99).random()

    return euro.toDouble() + cent/100.0

    // Version 3: mit Random.nextDouble
//    return Random.nextDouble(min, max)

    /* Version 4:
    cent = (200..499).random()
    return cent / 100.0
    */
}

