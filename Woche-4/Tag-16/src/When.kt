
fun main(){
    println("Geben sie den Monat ein: (als Zahl)")

    var eingabe: String = readln()
    var monatsEingabe: Int
    if (eingabe.isNumeric()) {
        monatsEingabe = eingabe.toInt()
    }
    else {
        monatsEingabe = -1
    }

    when (monatsEingabe){
        1 -> {
            println("Januar")
            println("Gratuliere zum neuem Jahr")
        }
        2 -> {
            println("Februar")
        }
        3, 4, 5 -> println("Frühling")      // bei einzelnen Anweisungen können {} weggelassen werden
        in 6..9 -> println("Sommer")
        in listOf(10, 11, 12) -> println("Herbst")
        else -> {
            println("Ungültige Eingabe")
        }
    }

}

var gueltigenEingaben = listOf<String>()


fun hauptmenu(){
    println("Wählen sie 1-3")
    when (readln().lowercase()){            // "Gordon" -> "gordon", "TEST" -> "test", "test" -> "test"
        "1", "01", " 1", "eins" -> {    // "Eins", "EINS", "EiNS"
            println("Continue")
        }
        "2", "zwei" -> {
            println("App beenden")
        }
        in listOf("3", "drei", "DREI", "03") ->
            println("Einstellungen")
        else -> {
            println("Falsche Eingabe")
            hauptmenu()
        }
    }
}


fun String.isNumeric(): Boolean{
    return this.all { it.isDigit()  }       // is Digit überprüft, ob ein Zeichen eine Zahl ist
}