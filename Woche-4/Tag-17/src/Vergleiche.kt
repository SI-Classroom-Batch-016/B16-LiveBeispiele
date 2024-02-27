import kotlin.random.Random

fun main() {


    var isLoggedIn: Boolean = passwortAbfrage()

    if (!isLoggedIn) {
        Thread.sleep(5000)
        println("Sie können es jetzt wieder versuchen")

        isLoggedIn = passwortAbfrage()
    }


    if (isLoggedIn) {
        autoKauf()
        altersCheck()
        pokemonKampf()
    }
}

fun passwortAbfrage(versuch: Int = 1): Boolean {
    // Passwort abfrage mit == Operator ("equals")
    println("Geben sie ihr Passwort ein:")
    val eingegebenesPasswort = readln()
    val echtesPasswort = "passwort321"

    // Verzweigte Funktion braucht ein Return in beiden Teilen der Verzweigung
    if (eingegebenesPasswort == echtesPasswort) {
        println("Erfolgreich eingeloggt")
        return true
    } else
    {
        if (versuch >= 3) {
            println("Sie haben die maximale Anzahl Versuche überschritten")
            return false
        } else {
            println("Falsches Passwort. Versuche es nochmal.")
            return passwortAbfrage(versuch + 1)
            // Rekursive Funktion
        }
    }
}

/* Vergleiche mit Strings:
        "2" == "zwei"       // false
        "zwei" == "Zwei"    // false
        "zwei" == "zwei "   // false
        "zwei" == "zwei"    // true
        "2" == "2"          // true
        2 == 2              // true (kein String)
        "2" == 2            // Fehler   (nicht selber Datentyp)
        2 == 2.0            // Fehler   (nicht selber Datentyp)
*/

fun autoKauf() {
    // Genug Geld auf dem Konto? kleiner Gleich = höchstens
    var kontostand = Random.nextDouble(2000.0, 10000.0)
    val autoPreis = 4000.0

    if (autoPreis <= kontostand) {   // alternative: kontostand >= autopreis
        println("Ich kann mir das Auto leisten")
        kontostand -= autoPreis
    } else
        println("Ich kann mir das Auto nicht leisten")
}

fun altersCheck() {
    var alter = getRandomAge()

    // Alterscheck Variante A
    if (alter > 17) {        // älter als 17
        println("Nutzer ist alt genug, um ein Auto zu kaufen")
    } else {
        println("Nutzer ist noch nicht alt genug")
    }

    // Alterscheck Variante B
    if (alter >= 18) {       // mindestens 18
        println("Nutzer ist alt genug, um ein Auto zu kaufen")
    } else {
        if (alter == 17) {
            //....
        }
        println("Nutzer ist noch nicht alt genug")
    }

    // Variante A
    if (alter >= 18) {
        println("Der Nutzer kann alle Getränke kaufen")
    } else if (alter >= 16) {
        println("Der Nutzer kann Wein und Bier kaufen")
    } else
        println("Der Nutzer kann keine alk. Getränke kaufen")

    // Variante B
    if (alter < 16)
        println("Der Nutzer kann keine alk. Getränke kaufen")
    else if (alter < 18)
        println("Der Nutzer kann Wein und Bier kaufen")
    else
        println("Der Nutzer kann alk. Getränke kaufen")

    // Variante C
    when (alter) {
        in 0..15 -> println("Der Nutzer kann keine alk. Getränke kaufen")
        16, 17 -> println("Der Nutzer kann Wein und Bier kaufen")
        else -> println("Der Nutzer kann alk. Getränke kaufen")
    }
}

fun pokemonKampf() {
    var pikachuLP = (10..50).random()
    val schaden = (25..30).random()

    pikachuLP -= schaden

    // Variante A
    if (pikachuLP > 0)
        println("Der Kampf geht weiter")
    else
        println("Pikachu ist KO")

    // Variante B
    if (pikachuLP <= 0)
        println("Pikachu ist KO")
    else
        println("Der Kampf geht weiter")
}



