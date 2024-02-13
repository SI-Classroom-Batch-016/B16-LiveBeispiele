/*
    Diese Datei enthält Beispiele für diese Listen Funktionen:
        - .random
        - .min / .max
        - .indexOf
        - .sort / sorted
        - .shuffle / shuffled
        - .slice & .sublist
 */

fun main(){

    var artikelListe = mutableListOf<String>(
        "T-Shirt",
        "Nike Schuhe",
        "Adidas Schuhe",
        "Beanie",
        "Slim Fit Jeans",
        "Baggy Jeans",
    )
    var preisListe = mutableListOf<Double>(
        19.99,
        79.99,
        89.99,
        15.00,
        65.00,
        65.00
    )


    // Das günstigste Produkt finden
    val minPreis: Double = preisListe.min()
    val gesuchtePosition: Int = preisListe.indexOf(minPreis)
    val minArtikel: String = artikelListe[gesuchtePosition]



    var players = mutableListOf<String>(
        "Nadia",
        "Anna",
        "Christian",
        "Marco",
        "Max"
//        "7gamercoolyxx",
//        "//abc",
//        ",..,l.."
    )

    var points = mutableListOf<Int>(
        50,
        75,
        65,
        50,
        55
    )

    // Ein zufälliges element
    val zufallsSpieler = players.random()
    println(zufallsSpieler)

    players.remove(zufallsSpieler)
    players.remove(players.random())

    // Min und Max Funktionen:
    println("Die höchste Punktzahl: ${points.max()}")
    println("Die niedrigste Punktzahl: ${points.min()}")

    println("Der 'höchste' Name: ${players.max()}")
    println("Der 'niedrigste' Name: ${players.min()}")


    println("---------")
    println(players)

    // (Den Index von) einen Wert suchen
    var suchName = "Anna"
    print("Welcher Spieler ist '$suchName'?")
    var index: Int = players.indexOf(suchName)
    println(" $index")

    print("Punktzahl von $suchName:")
    val punktZahl = points[index]
    println(" $punktZahl")

    println("---------")
    println(players)
    println(points)

    // Den Spieler mit der höchsten Punktzahl finden:
    var hoechstePunktzahl = points.max()
    index = points.indexOf(hoechstePunktzahl)
    val spieler = players[index]

    println("Der Spieler mit den meisten Punkten ist: ")
    println("$spieler: $hoechstePunktzahl")


    // mit richtigem Datentypen arbeiten!!
    points.indexOf(50)
//    points.indexOf("Anna")


    println("-------------")
    // Eine Liste sortiert zurückgeben
    var pointsSorted = points.sorted().reversed()      // todo: Unterschied zw. sort und sorted kommt weiter unten
    println(pointsSorted)
    println("Top 3:")


    // Teile einer Liste anzeigen: sublist/slice
    var top3 = pointsSorted.subList(0, 3)        // von - bis (nicht inklusive)
    println(top3)

    top3 = pointsSorted.slice(0..2)  // von..bis  (inklusive)
    println(top3)


    // Unterschied zw. sort und sorted
    // same bei shuffle/shuffled
    println("-------------")
    println(players)

    players.sort()                                    // sort: Sortiert die Liste
//    players = players.sorted().toMutableList()        // sorted: gibt eine sortierte KOPIE wieder
    println(players)

    players.shuffle()
    println(players)

}