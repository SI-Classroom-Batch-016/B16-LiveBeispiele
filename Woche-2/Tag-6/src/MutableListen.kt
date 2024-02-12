fun main(){

    val artikelListe: MutableList<String>  = mutableListOf(
        "Apfel",    // index 0
        "Birne",    // index 1
        "Kiwi",
        "Avocado",
        "Apfel",
        "Apfel"
    )

    artikelListe[0] = "Granatapfel" // Überschreibt einen Wert
    artikelListe.add("Orange")
    artikelListe.add(0, "Minze")
//    artikelListe.add(0.99)        // richtigen Datentypen verwenden!

    println(artikelListe)
    println("-------")


    var preisListe = mutableListOf<Double>(
        0.45,       // index 0
        0.66,       // index 1
        0.2,
        0.99,
    )
    preisListe.add(0.44)
    preisListe[0] += 0.5

    var anzahlListe = mutableListOf(
        5,
        8,
        20,
        2
    )
    anzahlListe.add(20)

    // Bei einer leeren Liste MUSS ich (1x) den Datentyp angeben
    var gewichtListe: MutableList<Double> = mutableListOf<Double>()

    // Einen Wert überschreiben
    artikelListe[2] = "Banane"


    println("Artikel vor dem Löschen $artikelListe")
    artikelListe.remove("Apfel")    // Löscht nur das erste Vorkommen
    artikelListe.remove("Tomaten")  // Löscht nur Werte, die existieren
    artikelListe.remove("birne")    // Löscht nur richtig geschriebene Werte
    artikelListe.removeAt(2)    // mit Index Löschen
    println("Artikel nach dem Löschen $artikelListe")

    // Wird am Ende hinzugefügt
    artikelListe.add("Mango")
    preisListe.add(1.50)
    anzahlListe.add(5)

    // Wird am Index hinzugefügt
    artikelListe.add(2, "Ananas")
    preisListe.add(2, 2.99)
    anzahlListe.add(2, 3)

    println("Artikel nach dem Einfügen $artikelListe")
    println("Preise nach dem Einfügen $preisListe")



    // Interaktiver Supermarkt
    println("--------------")
    println("Geben sie ein Index an, um eine Preisabfrage zu starten: 1 - ${artikelListe.size}")
    var index = readln().toInt() - 1

    println("Der Artikel ${artikelListe[index]} kostet ${preisListe[index]}")

    println("Geben sie nun den neuen Preis an:")
    var neuerPreis = readln().toDouble()
    preisListe[index] = neuerPreis

    println("--------------")
    println("Wählen ein Produkt zum Kauf aus: 1 - ${artikelListe.size}")
    index = readln().toInt() - 1
    anzahlListe[index] = anzahlListe[index] - 1
    anzahlListe[index]--
    println("Sie haben ein ${artikelListe[index]} gekauft.")








    artikelListe + listOf("Salat")
    "test" + "Salat"


}