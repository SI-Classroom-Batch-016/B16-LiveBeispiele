import kotlin.system.exitProcess

/**
 * Diese Funktion fordert den Benutzer auf, eine ganze Zahl einzugeben, und überprüft, ob die eingegebene Zahl
 * im angegebenen Wertebereich (IntRange) liegt. Falls die Eingabe ungültig ist oder außerhalb des Wertebereichs
 * liegt, wird der Benutzer erneut aufgefordert, eine Eingabe vorzunehmen, bis eine gültige Zahl im Wertebereich
 * eingegeben wird.
 *
 * @param range Ein IntRange-Objekt, das den Wertebereich angibt, in dem die eingegebene Zahl liegen sollte.
 * @return Die gültige ganze Zahl, die vom Benutzer eingegeben wurde und im angegebenen Wertebereich liegt.
 */
fun readInt(range: IntRange): Int{
    val eingabe: Int
    println("Gib eine ganze Zahl zwischen $range ein:")

    try {
        // Fehler anfälliger Code: Eine Eingabe (String) zu einer Zahl umwandeln
        eingabe = readln().toInt()
    } catch (e: NumberFormatException){
        // Fehler wird abgefangen, und Funktion neu gestartet
        println("Du hast die Zahl falsch eingegeben")
        return readInt(range)
    }

    // Wenn die Zahl im gültigen Bereich ist...
    if (eingabe in range) {
        // ... beenden wir die Funktion
        return eingabe
    }
    // ... ansonsten (wenn die Zahl nicht im Bereich liegt)...
    else {
        // ... starten wir die Funktion neu
        println("Deine Zahl war nicht innerhalb $range")
        return readInt(range)
    }
}

// Alternative zu Try-Catch: Fehler mit Verzweigungen abfangen
fun readIntv2(range: IntRange): Int{
    println("Gib eine ganze Zahl zwischen $range ein:")
    val eingabe: Int? = readln().toIntOrNull()

    // Wenn eine Zahl eingegeben wurde, und diese im gültigen Bereich ist...
    if (eingabe != null && eingabe in range) {
        // ... beenden wir die Funktion
        return eingabe
    }
    // ... ansonsten (wenn die Zahl nicht im Bereich liegt)...
    else {
        // ... starten wir die Funktion neu
        println("Ungültige Eingabe!")
        return readIntv2(range)
    }

    // PROBLEM: Keine unterschiedlichen Fehlermeldungen
    // LÖSUNG: 2 getrennte If Bedingungen:

    // Test ob Eingabe keine Zahl war:
    if (eingabe == null){
        println("Du hast die Zahl falsch eingegeben")
        return readIntv2(range)
    }
    // Test, ob Eingabe nicht im gültigen Bereich war:
    else if (eingabe !in range){
        println("Deine Zahl war nicht innerhalb $range")
        return readIntv2(range)
    }
    // Ansonsten (Alles OK)
    else
        return eingabe
}


fun main(){

    startBildschirm()
}

fun startBildschirm(){
    var startBildschirm = listOf("Hauptmenu", "Optionen", "Beenden")
    println("Wählen sie aus: ")

    startBildschirm.forEachIndexed{ index, bildschirm ->
        println("Drücken sie ${index + 1} für $bildschirm")
    }

    when (readln().toIntOrNull()){
        1 -> hauptmenu()
        2 -> optionen()
        3 -> beenden()
        null -> {
            println("Sie müssen eine Zahl eingeben")
            startBildschirm()
        }
        else -> {
            println("Es sind nur Zahlen zw 1-3 erlaubt")
            startBildschirm()
        }
    }


//    readInt(0..2)
//    readInt(optionen.indices)
}


fun hauptmenu(){
    println("Hauptmenu noch nicht implementiert...")

    zurueck()

}

fun zurueck(){
    print("Zurück zum Startbildschirm in ")


    print("5")
    repeat(4){
        Thread.sleep(1000)
        print("\b${4-it}")

    }
    println("\n--------------------\n")

    startBildschirm()
}

fun optionen(){
    var optionen = listOf("Sound", "Video", "Nutzerprofil", "Shortcuts")

    println("Ihre Optionen: ")
    optionen.forEachIndexed{ index, option ->
        println("$index -> $option")
    }

    val index = readInt(optionen.indices)
    println("Sie haben ${optionen[index].uppercase()} gewählt")

    zurueck()

}

fun beenden(){
    println("Programm wird beendet")

    exitProcess(0)
}
