
fun main(){
    // Listen mit Initialwerten initialisieren
    var mainMenu: List<String> = listOf(
        "Continue",
        "Options",
        "Quit"
    )

    val players = mutableListOf(
        "Anna",
        "Davide",
        "Brian"
    )

    // Leere Listen brauchen den Datentypen
    val items = mutableListOf<String>()
    val infos: List<String> = listOf()

    // Via Index Zugriff auf Elemente:
    println(mainMenu[0])
    println(mainMenu[1])
    println(mainMenu[2])
//    println(mainMenu[3])     // Exception -> Index Out of Bounds
//    println(mainMenu[-1])    // Exception -> Index Out of Bounds
//    println(mainMenu[1.0])    // Syntax Fehler -> Index muss Int sein

    println("\nPlayers:")
    println(players[0]) // druckt den ersten Spieler aus
    println(players[players.size - 1]) // druckt den letzten Spieler aus
    println()

    // MutableListen bearbeiten
    players.add("Max")
//    players.add(6)            // Syntax Fehler -> falscher Datentyp
    players.add(0, "Josh")
    players.remove("Max")
    players.remove("Gordon")        // kein Fehler, aber passiert nichts
    players.removeAt(0)
//    players.removeAll(listOf("Max"))
    players[2] = "Viktoria"

    // Etwas via Konsole hinzufügen
    println("Geben sie ein Item ein, was sie hinzufügen möchten:")
    items.add(readln())

    // statische Listen sind nicht bearbeitbar (diese Operationen sind alle nicht erlaubt)
//    mainMenu.add("Test")
//    mainMenu.remove("Quit")
//    mainMenu[0] = "Pause"

    // Das hier funktioniert
    mainMenu = mainMenu + "Pause"
    println(mainMenu)



    // Unterschied zw. var und val
    var testListe1 = mutableListOf(1, 2, 5)
    val testListe2 = mutableListOf(1, 2, 5)
    var testListe3 = listOf(1, 2, 5)

    testListe1[0] = 0
    testListe2[0] = 0

    testListe1 = mutableListOf(2, 5, 6)
//    testListe2 = mutableListOf(2, 5, 6)     // val kann nicht überschrieben werden

    // der Plus Operator
    testListe1 += 5
    testListe2 += 5
    testListe3 += 5     // erzeugt eine neue Liste

    println("Test 1: $testListe1")
    println("Test 2: $testListe2")
    println("Test 3: $testListe3")

}