fun main(){

    // Datentypen kann weggelassen werden, (bei Initialwerte)
    val kursteilnehmer = listOf("Merlin", "Stephan", "Julian",)

    // Leere Listen brauchen den Datentyp explizit
    var altersListe: List<Int> = listOf()
    var addressListe = listOf<String>()

    //  Wir einigen uns drauf: Zugehörige Listen, haben dieselbe Reihenfolge
    var artikelListe: List<String>  = listOf(
        "Apfel",    // index 0
        "Birne",    // index 1
        "Kiwi",
        "Kirsche",
        "Avocado",
        "Zitrone"
    )
    var preisListe = listOf<Double>(
        0.45,       // index 0
        0.66,       // index 1
        0.2,
        0.05,
        0.99,
        0.20
    )
    var anzahlListe = listOf(
        5,
        8,
        20,
        2,
        7,
        5
    )

    println(artikelListe)
    println(preisListe)

    println("------------------------")


    println("""
        ${artikelListe[0]}, ${preisListe[0]}€
        ${artikelListe[1]}, ${preisListe[1]}€
        ${artikelListe[2]}, ${preisListe[2]}€
        ${artikelListe[3]}, ${preisListe[3]}€
        ${artikelListe[4]}, ${preisListe[4]}€
        ${artikelListe[5]}, ${preisListe[5]}€
    """.trimIndent())


    // Liste aus Variablen
    var frage1 = "Wie weit ist der Mond von der Erde entfernt?"
    var frage2 = "Was ist die größte Integer Zahl?"

    var fragenListe = listOf<String>(
        frage1,
        frage2
    )

    frage1 = "Wie weit ist die Sonne von der Erde entfernt?"
    println(fragenListe)

    // Liste von Listen
    var hausTiere: List<List<String>> = listOf(
        listOf("Katze", "Katze"),
        listOf("Hund"),
        listOf()
    )

    println("--------------------")

    var index: Int = 0
    var artikel: String = artikelListe[index]
    var preis: Double = preisListe[index]
    println("Der Artikel '$artikel' kostet $preis€ und wir haben noch ${anzahlListe[index]} auf Lager. ")

    println("--------------------")
    println(artikelListe)
    // Eingabe: Variante 1
    println("Wählen sie ein Produkt: (0-${artikelListe.size - 1})")
    var produktNr = readln().toInt()
//    println("Der Artikel '${artikelListe[produktNr]}' kostet ${preisListe[produktNr]}€")

    // Eingabe: Variante 2
    println("Wählen sie ein Produkt: (1-${artikelListe.size})")
    produktNr = readln().toInt() - 1
    println("Der Artikel '${artikelListe[produktNr]}' kostet ${preisListe[produktNr]}€")


    println("Von wem wollen sie die Haustiere sehen (0-${kursteilnehmer.size - 1})")
    println(kursteilnehmer)

    var indexPerson = readln().toInt()
    var hausTiereDieserPerson: List<String> = hausTiere[indexPerson]
    var erstesHaustier = hausTiere[indexPerson][0]
//    var zweitesHaustier = hausTiereDieserPerson[1]

    println("${kursteilnehmer[indexPerson]} hat diese Haustiere: $hausTiereDieserPerson")

    // Normale Listen sind nicht veränderbar
    //artikelListe.add("Mango")


    // String sind fast wie Listen
    var test = "hallo"
    test[0]

    var test2 = listOf<Char>('h', 'a', 'l', 'l', 'o')
    test2[0]

}