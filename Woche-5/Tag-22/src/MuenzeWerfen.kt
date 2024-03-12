var playerMoney: Int = 10


fun main(){

    var continuePlaying = true

    while (continuePlaying && playerMoney > 0){

        val einsatz = geldEinsatz()

        val gewonnen: Boolean = listOf(true, false).random()

        if (gewonnen) {
            playerMoney += einsatz
            println("Gratuliere, sie haben gewonnen!")
            println("Ihr neues Budget ist $playerMoney")
        }
        else {
            playerMoney -= einsatz
            println("Schade, sie haben verloren, viel Glück beim nächsten Mal")
            println("Ihr neues Budget ist $playerMoney")
        }

        continuePlaying = weiterSpielen()

    }

    println("Danke fürs Mitspielen :)")
}

/**
 * Fragt den Benutzer, ob er weiter spielen möchte und gibt die Entscheidung als Boolean-Wert zurück.
 *
 * Diese Funktion zeigt dem Benutzer die Frage "Wollen Sie weiter spielen? (j / n)" an und erwartet eine
 * Eingabe. Sie akzeptiert verschiedene Eingabeoptionen (z.B. "j", "ja", "yes", "y" für Ja und
 * "n", "nein", "no", "na", "nope" für Nein) und setzt den Rückgabewert entsprechend.
 *
 * @return True, wenn der Benutzer mit "ja" oder einer ähnlichen positiven Antwort antwortet, andernfalls False.
 */
fun weiterSpielen(): Boolean{
    var weiter: Boolean? = null

    do {
        println("Wollen sie weiter spielen? (j / n)")
        val input: String = readln()

        when (input.lowercase()){

            "j", "ja", "yes", "y", "jap" -> weiter = true

            "n", "nein", "no", "na", "nope" -> weiter = false

            else -> println("Ungültige Eingabe")
        }
    } while (weiter == null)

    return weiter

}

/**
 * Fragt den Benutzer nach einem Geldeinsatz und gibt den eingegebenen Betrag als Integer zurück.
 *
 * Diese Funktion fordert den Benutzer auf, seinen Geldeinsatz für das Spiel anzugeben. Der Benutzer kann
 * seinen Einsatz eingeben, und die Funktion überprüft, ob die Eingabe gültig ist (eine positive Zahl
 * und nicht größer als der verfügbare Geldbetrag des Spielers).
 * Bei ungültigen Eingaben wird der Benutzer benachrichtigt und erneut zur Eingabe aufgefordert.
 *
 * @return Der vom Benutzer eingegebene Geldeinsatz als Integer.
 */
fun geldEinsatz(): Int{
    var einsatz: Int? = null

    do {
        println("Bieten sie jetzt ihren Einsatz: (max: $playerMoney)")

        try {
            einsatz = readln().toInt()

            if (einsatz!! < 0 || einsatz > playerMoney){
                einsatz = null
                println("Bitte bieten sie einen gültigen Betrag.")
            }

        } catch (ex: NumberFormatException){
            println("Sie haben keine gültige Zahl eingegeben!")
        }

    } while (einsatz == null)

    return einsatz
}