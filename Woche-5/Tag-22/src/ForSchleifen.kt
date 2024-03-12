fun main() {

    // Liste mit Filmen
    val filmListe: List<String> = listOf(
        "Interstellar",
        "Dune",
        "Oppenheimer",
    )

    // Liste mit Preisen
    val preisListe: List<Double> = listOf(
        14.99,
        14.99,
        24.99
    )

    // Iteration über jedes Element in der filmListe
    for (filmTitel in filmListe) {
        println(filmTitel)
    }

    // Iteration über jedes Element in der preisListe
    for (filmPreis in preisListe) {
        println(filmPreis * 0.8)
    }

    // Ausgeben von beiden Listen über den Index einer Liste
    // Vorsicht! Funktioniert nur, wenn beide Listen gleich groß sind
    for (i in filmListe.indices) {
        println("[$i] Film: ${filmListe[i]}, ${preisListe[i]}")
    }
    repeat(filmListe.size){}


    // Fügt 2 Listen zu einer Map zusammen: die erste Liste übernimmt die Rolle des Keys
    val filmMap = filmListe.zip(preisListe).toMap()

    // For-In Iteration über eine Map
    for ((film, preis) in filmMap) {
        println("Film: $film, $preis")
    }
}