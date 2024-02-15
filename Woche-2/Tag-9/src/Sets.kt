
fun main(){

    var presented: MutableSet<String> = mutableSetOf(
        "Davide",
        "Anna",
        "Okan",
        "Max"
    )

    println("Vor dem Einfügen: \n $presented")

    presented.add("Max")
    presented.add("max")
    presented.add("Josh")

    println("Nach dem Einfügen: \n $presented")

    // [Index] Schreibweise gibt es leider nicht, wir müssen .elementAt benutzen
//    presented[2]
    presented.elementAt(2)

    listOf("Max", "Max").toSet().toList() // duplikate entfernen

    // Die meisten Listenoperationen funktionieren für Sets
    presented.shuffled()    // .shuffle gibt es nicht
    presented = presented.sorted().toMutableSet()      // .sort    gibt es nicht
    presented.reversed()    // .reverse gibt es nicht

    presented.random()
    presented.contains("Anna")  // "Anna" in presented

    presented.indexOf("Anna")

    presented.retainAll(setOf("Josh", "Okan"))
    presented.addAll(listOf("Max", "Max", "Max"))

    presented.clear()


    println("----------")
    readln()
    // es gibt spezielle Set Operationen:   (sehr nützlich!)

    val voegel = setOf("Papagei", "Huhn", "Huhn", "Meise").shuffled()
    val fische = mutableListOf("Forelle", "Hai", "Tintenfisch", "Meise")

    var kombi: List<Pair<String, String>> = voegel.zip(fische)
    println("Zip: $kombi")

    val artikelListe = listOf("Mars", "Twix")
    val preisListe = listOf(1.5, 2.0)
    val angebote = artikelListe.zip(preisListe)
    println(angebote)

    val beides: Set<String> = fische union voegel
//    val beides: List<String> = (voegel union fische).toList()
    println("Beide Arten von Tieren (Fische und Vögel):\n\t$beides\n")

    val tiereDieFischEssen = setOf("Bär", "Katze", "Hai")
    val tiereDieFleischEssen = setOf("Bär", "Tiger", "Löwe", "Hund", "Katze")
    println("Tiere die Fisch essen:\n\t$tiereDieFischEssen\n")
    println("Tiere die Fleisch essen:\n\t$tiereDieFleischEssen\n")


    val tiereDieFleischUndFischEssen = tiereDieFischEssen intersect tiereDieFleischEssen
    println("Tiere die Fleisch und Fisch essen:\n\t$tiereDieFleischUndFischEssen\n")

    val tiereDieFleischAberKeinFischEssen = tiereDieFleischEssen subtract tiereDieFischEssen
    println("Tiere die Fleisch aber kein Fisch essen:\n\t$tiereDieFleischAberKeinFischEssen")


}
