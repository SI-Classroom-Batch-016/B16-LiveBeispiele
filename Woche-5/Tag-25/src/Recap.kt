fun main() {
    aufgabe8()
}

fun aufgabe2() {
    /*
    In dieser Aufgabe liegt der Fokus darauf, wie viele Zahlen in countNumbersList kleiner als 50 sind.
In loopCounter() soll nun analog zur ersten Aufgabe mithilfe von einer for-Schleife gezählt werden, wie viele der Zahlen unter 50 sind.
In lambdaCounter() soll auch gezählt werden, wie viele Zahlen unter 50 liegen, jedoch soll hierfür count benutzt werden.
     */
    val countNumbersList = listOf(
        2, 42, 932, 41,
        13, 93, 64, 74,
        4, 16, 22, 453
    )


    // For-Schleife
    var counter = 0
    for (zahl in countNumbersList) {
        if (zahl < 50) {
            println("Die Zahl $zahl ist kleiner als 50")
            counter++
        }
    }
    println("Insgesamt sind $counter Zahlen < 50")

    // For-Each Schleife (== for Schleife)
    counter = 0
    countNumbersList.forEach { zahl ->
        if (zahl < 50) {
            println("Die Zahl $zahl ist kleiner als 50")
            counter++
        }
    }

    // Repeat Schleife
    counter = 0
    repeat(countNumbersList.size) {
        val zahl = countNumbersList[it]
        if (zahl < 50)
            counter++
    }

    // While Schleife
    counter = 0
    var it = 0
    while (it <= countNumbersList.lastIndex) {
        val zahl = countNumbersList[it]
        if (zahl < 50)
            counter++
        it++
    }

    // Lambda
    counter = countNumbersList.count { zahl ->
        println("Aktuelle Zahl: $zahl")
        (zahl < 50)
    }

    println("Die Lambda Funktion hat $counter Zahlen <50 gefunden")


}

fun aufgabe8() {
    /*
    In dieser Aufgabe haben wir nun die Map movieMap gegeben,
      in der Filme bzw. Serien und ihre Bewertungen gespeichert sind.
    Ziel der Aufgabe ist es, die Filme zu finden,
    ....
    Es soll auch hier keine Schleife benutzt werden!
     */

    val movieMap = mapOf(
        "Avatar" to listOf(10, 3, 6, 2, 8, 5, 9, 9),
        "James Bond" to listOf(5, 3, 5, 7, 3, 1, 3, 4),
        "One Piece" to listOf(8, 9, 10, 5, 7, 2, 3, 10),
        "Der Schacht" to listOf(3, 3, 6, 9, 5, 4, 2, 8),
        "Dragon Ball" to listOf(7, 8, 4, 5, 3, 8, 1, 3),
        "Van Helsing" to listOf(8, 5, 1, 6, 8, 4, 5, 2, 3, 5, 6, 7),
    )
    // welcher Film hat die besten Bewertungen
    // .average == rechnet den Durchschnitt aus
    // Filmliste nach durchschnittsbewertung sortieren:
    val sortierteFilmMap = movieMap.entries.sortedBy { (film, bewertungen) ->
        bewertungen.average()
    }

    for ((film, bewertungen) in sortierteFilmMap) {
        println("$film: ${bewertungen.average()}")
    }

    // Welcher Film hat am meisten Bewertungen = 10
    val meiste10Bewertungen = movieMap.maxBy { (film, bewertungen) ->
        bewertungen.count { bewertung -> bewertung == 10 }
    }

    println("Der Film mit den meisten 10 ist: $meiste10Bewertungen")


    // welche am meisten Bewertungen zwischen 3 und 7 bekommen haben.
    val meiste3u7Bewertungen = movieMap.entries.sortedByDescending { (film, bewertungen) ->
        bewertungen.count { bewertung ->
            bewertung in 3..7
        }
    }

    println("Die Filme nach Bewertungen zw 3 und 7 sortiert:")
    for ((film, bewertungen) in meiste3u7Bewertungen) {
        println("$film: ${bewertungen.sorted()}")
    }

    for ((film, bewertungen) in meiste3u7Bewertungen){
        println("$film")
    }
}