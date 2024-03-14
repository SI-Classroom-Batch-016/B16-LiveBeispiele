fun main() {

    val bestand: MutableMap<String, Boolean> = mutableMapOf(
        "Apfel" to true,
        "Mango" to false,
        "Ananas" to true,
        "Banane" to false,
        "Kirsche" to false,
        "Erdbeere" to true,
        "Zitrone" to true
    )

    // Hier werden als Iterator (Laufvariable) 2 Variablen bestehend aus dem key = k und dem value = v benutzt
    // Diese Variablen (k und v) können beliebig benannt werden
    // Die erste Variable in der Klammer ist immer der key, die zweite immer der value
    for ((k, v) in bestand) {
        if (v == false) {
            println("$k muss bestellt werden")
        } else {
            println("$k ist noch vorhanden")
        }
    }

    println()

    // Quasi exakt die gleiche Lösung wie oben, nur das anstatt der Aufteilung des keys und des
    // values beide Eigenschaften in der Variable entry gespeichert werden, die wir wieder beliebig benennen können
    // Auf key und value können wir dann mit entry.key und entry.value zugreifen
    for (entry in bestand) {
        if (entry.value == false) {
            println("${entry.key} muss bestellt werden")
        } else {
            println("${entry.key} ist noch vorhanden")
        }
    }


}