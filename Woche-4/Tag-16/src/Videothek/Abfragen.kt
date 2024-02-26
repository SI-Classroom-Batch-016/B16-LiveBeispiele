package Videothek

// TODO: Aufgabe 3a: Preisabfrage
fun preisAbfrage(film: String): Double{
    // Simpelste Lösung:
//    return filmToPrice[film] ?: -1.0
    // auch möglich:
//    return filmToPrice[film]!!

    // man kann ebenfalls mit einbauen, dass der Preis auf 2 Stellen gerundet wird
    var preis: Double = filmToPrice[film] ?: -1.0
    preis = "%.2f".format(preis).replace(',', '.').toDouble()
    return preis
}

// TODO: Aufgabe 3b: Genreabfrage
fun genreAbfrage(film: String): String {
    return filmToGenre[film] ?: "k.A."
}

// TODO: Aufgabe 3c: Bewertungsabfrage
fun bewertungsAbfrage(film: String): Double{
    val bewertungen = filmRatings[film] ?: listOf<Int>()

    // Durchschnitt = Summe_aller_Bewertungen / Anzahl_Bewertungen
//    var durchschnitt: Double = bewertungen.sum().toDouble() / bewertungen.size

    // Gibt idR eine Listenfunktion dafür:
    var durchschnitt = bewertungen.average()

    // Auf 1 Kommastelle runden
    durchschnitt = "%.1f".format(durchschnitt).replace(',','.').toDouble()

    return durchschnitt
}

// TODO: Aufgabe 4a: Günstigster Film
fun minPreis(): String{
    var filme = filmToPrice.keys
    var preise = filmToPrice.values

    var minPreis = preise.min()

    var index = preise.indexOf(minPreis)
    var film = filme.elementAt(index)

    return film
}

// Bonus: Höchst-bewerteter Film
fun maxRating(): String{
    var filme = filmRatings.keys

    var bewertungen: MutableList<Double> = mutableListOf<Double>()
    filme.forEach {
        it -> bewertungen.add(bewertungsAbfrage(it))
    }

    var maxRating = bewertungen.max()
    var index = bewertungen.indexOf(maxRating)
    var film = filme.elementAt(index)

    return film
}

// TODO: Aufgabe 6: Filme nach Alphabet sortieren
// Unsortiertes Sortiment finde ich bei filmListe
fun sortByAlphabet(): MutableList<String> {
//    filmListe.sort()
    return filmListe.sorted().toMutableList()
}

// Bonus: Filme nach Preis sortieren
fun sortByPrice(): List<String> {
    return filmListe.sortedBy {
        film -> preisAbfrage(film)
    }
}

// Bonus: Filme nach Bewertungen Sortieren
fun sortByRating(): List<String> {
    return filmListe.sortedBy {
        film -> bewertungsAbfrage(film)
    }
}

// TODO: Aufgabe 7: Einen Film Verkaufen
fun filmVerkauf(): Boolean{
    println("Wählen sie einen Film aus der Liste:")

    println("[${0 + 1}] für '${filmListe[0]}'")
    println("[${1 + 1}] für '${filmListe[1]}'")
    println("[${2 + 1}] für '${filmListe[2]}'")

    // Druckt jeden Film in einer Zeile aus, mit Index für Eingabe
    filmListe.indices.forEach {
        i -> println("[${i + 1}] für '${filmListe[i]}'")
    }

    var index = readln().toInt() - 1 // -1, sodass ich zB 1 für den 1. Film eingeben kann
    var film = filmListe[index]
    println("Sie haben '$film' gewählt. ")
    println("Preis: ${preisAbfrage(film)}")
    println("Genre: ${genreAbfrage(film)}")
    println("Bewertung: ${bewertungsAbfrage(film)}")
    println()

    val success: Boolean = filmListe.remove(film)

/*    filmToGenre.remove(film)
    filmToPrice.remove(film)
    filmRatings.remove(film)*/

    return success   // Film aus dem Sortiment nehmen
}

// BONUS: Nach Genre Filtern:
fun filterByGenre(genre: String): List<String>{
    return filmListe.filter {
        film -> genreAbfrage(film) == genre
    }
}