fun main() {

    val isRaining: Boolean = listOf(true, false).random()
    var scheibenWischer: Boolean = false

    if (isRaining) {
        println("Es regnet...")
        println("...Scheibenwischer ist an.")
        scheibenWischer = true
    } else {
        println("Es regnet nicht mehr...")
        println("...Scheibenwischer geht aus")
        scheibenWischer = false
    }

    println("Das Auto fährt und fährt..")


    // Bei einzelnen Anweisungen, kann man die {} weglassen
    var isFoggy = listOf(true, false).random()
    if (isFoggy)
        println("Es ist neblig...Nebellichter an")
    else
        println("Nebellichter aus...gute Fahrt")


    var isSunny = true

    if (isRaining) {
        println("Es regnet...")
        if (isSunny) {
            println("..aber es scheint auch die Sonne...")
            println("Heute gibt es einen schönen Regenbogen")
        }

        println("...")

    }

    // .contains -> Boolean
    var email = "....text depp blablab spam..."

//    if (email.contains("spam")) { ... }
    if ("spam" in email) {
        println("Spam email detected")
        println("Email wird gelöscht")
    }

    // If-Statements ohne Else sind unabhängig
    if ("Spam" in email) {
        println("Spam email detected")
        println("Email wird gelöscht")
    }

    if ("depp" in email) {
        println("Spam email detected")
        println("Email wird gelöscht")
    } else {
        println(email)
    }


    // remove -> Boolean
    var testListe = mutableListOf(1, 4, 6)

    println("Geben sie einen Wert ein, der gelöscht werden soll:")
    var eingabe = readln().toInt()

    var erfolgreich: Boolean = testListe.remove(eingabe)

    if (erfolgreich) {
        println("Bestätigung")
    } else {
        println("Fehlgeschlagen")
    }


    // Bedingte Zuweisung
    var emoji: String = if (isSunny) {
        "☀️"
    } else if (isRaining){
        "🌧️"
    } else {
        "☁️"
    }


}