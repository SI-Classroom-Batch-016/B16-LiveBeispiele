fun greaterFive (zahl: Int): Boolean{
    return (zahl > 5)
}

var greaterFiveAlsLambda:  (Int) -> Boolean = {
        it: Int -> (it > 5)
}


fun main(){
    // Lambda vs Funktion
    var result1a: Boolean = greaterFive(9)  // true
    var result2a = greaterFive(4)  // false

    var result1b: Boolean = greaterFiveAlsLambda(9)  // ?
    var result2b = greaterFiveAlsLambda(4)  // false

    println("-----------------------")
    // Alle Buchstaben in einem Namen zählen
    val name = "Ali Onur Aksay"
    val anzahlAnAs: Int = name.uppercase().count { buchstabe -> buchstabe == 'A'}   // zählt wie oft 'A' im Namen ist
    println("Der '$name' hat $anzahlAnAs As im Namen.")


    println("-----------------------")
    // Preisliste durchsuchen:
    var preisListe = listOf(1.5, 2.0, 0.99, 0.5, 2.2, 5.0)
    println("Preisliste: $preisListe")
    println("Der 1. Preis der höchstens 1€ ist:")

    // Variante 1 (ohne Lambda)
    for (it in preisListe){
        if (it <= 1.0) {
            println(it)
            break
        }
    }

    // Variante 2 (Lambda)
    println(preisListe.first { it <= 1.0 } )


    println("-----------------------")
    // Preisliste filtern: Alle Preise die höchstens 1€ sind
    var gefiltertePreisliste = preisListe.filter { preis -> preis <= 1.0 }
    println("Preise die max 1€ sind: $gefiltertePreisliste")

    // Preisliste filtern: Alle preise zw. 1 und 2€.
    gefiltertePreisliste = preisListe.filter {(it >= 1.0) && (it <= 2.0) }
    println("Alle Preise zw. 1-2€ : $gefiltertePreisliste")

    // selber Filter mit Schleife:
    val gefiltertePreislisteMutable = mutableListOf<Double>()
    for (it in preisListe){
        if ((it >= 1.0) && (it <= 2.0)){
            gefiltertePreislisteMutable.add(it)
        }
    }
    println(gefiltertePreislisteMutable)


    println("-----------------------")

    // ---------------
    // Sortiment Sortieren:
    val sortiment = mutableListOf<Pair<String, Double>>(
        Pair("Apple Laptop", 888.88),
        Pair("Windows Phone", 399.99),
        Pair("iPhone 7", 590.99),
        Pair("iPhone 8", 750.99),
        Pair("Audi", 200000.00),
        Pair("VW", 120000.00),
        Pair("Apple Airpods", 45.99)
    )

    // Anhand vom Preis Sortieren
    sortiment.sortBy {         // Rückwärts Sortieren: sortByDescending
        it -> it.second
    }
    println("Sortiert nach Preis:\n$sortiment")

    // Anhand vom Namen Sortieren
    sortiment.sortBy{ (produkt, preis) ->        // Bei Pairs kann ich den Iterator direkt aufteilen
        produkt.lowercase()
    }
    println("Sortiert nach Name:\n$sortiment")

    println("-----------------------")
    // Für jedes Element in der Liste tu etwas:
    println("For-Each Schleife: ")
    sortiment.forEach {
        it -> println("${it.first} kostet %.2f€".format(it.second))
    }

    println("-----------------------")
    println("For Schleife: ")
    // Selbes als For schleife:
    for ((produkt, preis) in sortiment){
        println("$produkt kostet %.2f€".format(preis))
    }

    // nach Apple Produkten gefiltert:
    val gefiltertesSortiment = sortiment.filter { (produkt, preis) ->
        produkt.contains("Apple") || produkt.contains("iPhone")
    }


}