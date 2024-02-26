package videothek


fun main() {

    filmListe = sortByAlphabet().toMutableList()

    // Den Kunden begrüßen
    println("Willkommen zur Syntax Videothek!")

    // Dem Kunden das gesamte Sortiment anzeigen
    println("\nWir bieten folgende ${filmListe.size} Filme an:\n")

    // Durchschnittspreis:
//    var allePreise = filmToPrice.values
//    var durchschnittsPreis = allePreise.sum() / allePreise.size


    var film = filmListe[0]
    var preis = preisAbfrage(film)
    var genre = genreAbfrage(film)
    var bewertung = bewertungsAbfrage(film)
    println("$film ($preis€): $genre - $bewertung")


    filmListe.forEach {
        film ->
            println("$film (%.2f€): ${genreAbfrage(film)} - : %.1f".format(
                preisAbfrage(film),
                bewertungsAbfrage(film)
            ))
    }

    Thread.sleep(10000)
    // Dem Kunden die 3 billigsten Filme als Angebot anbieten
    println()
    var sortierteFilmListe = sortByPrice()
    var top3Preis = sortierteFilmListe.slice(0..2)
    println("Unseren Aktuellen Sparangebote: $top3Preis")

    Thread.sleep(2000)

    // Dem Kunden die 3 am besten bewerteten Filme anzeigen
    sortierteFilmListe = sortByRating()
    var top3Rating = sortierteFilmListe.reversed().slice(0..2)
    println("Andere Nutzer empfehlen: $top3Rating")

    Thread.sleep(2000)

    // Den Kunden einen Film auswählen lassen
    // Dem Kunden den Preis, das Genre und die Bewertung dieses Filmes ausdrucken
    // Den gewählten Film aus dem Sortiment nehmen
    println()
    var erfolg: Boolean = filmVerkauf()

    if (erfolg){
        println("Danke und bis zum nächsten Mal")
    } else {
        main()
    }

}