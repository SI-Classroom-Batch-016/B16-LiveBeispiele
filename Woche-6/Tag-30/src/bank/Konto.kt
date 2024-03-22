package bank

/**
 *  Diese Klasse implementiert die Eigenschaften und Methoden, die sich
 *  alle Konten teilen, wie zB [PIN], [kontostand], [pinAbfrage], etc..
 */
open class Konto() {
    val iban: String = ibanGenerator()

    // Kontostand und PIN sind privat
    private var kontostand: Double = 0.0
    private var PIN: String = ""

    // Beim Erstellen eines Kontos wird die PIN gewählt:
    init {
        pinAendern()
    }

    open fun kontostandAnzeigen() {
        val pinCorrect = pinAbfrage()

        if (pinCorrect)
            println("Ihr aktueller Kontostand ist: $kontostand")
        else
            println()

    }

    // Diese Funktion ist offen, sodass sie in den versch. Kontoarten unterschiedlich definiert werden kann
    // in Sparkonto kann man nicht abheben
    // in Kreditkonto kann man das limit überstrecken, etc..
    open fun geldAbheben() {
        val pinKorrekt = pinAbfrage()
        if (pinKorrekt) {

            val betrag = readDouble("Wie viel Geld möchten Sie abheben?")

            if (betrag <= kontostand) {
                println("Nicht genügend Saldo!")
            } else if (betrag < 0.0) {
                println("Die Eingabe muss positiv sein!")
            } else if (betrag > 500.0){
                println("Sie können maximal 500€ abheben")
            }else {
                println("Sie haben erfolgreich $betrag € abgehoben")
                println("Ihr verbleibender Kontostand: $kontostand")
            }


        }
    }

    fun geldEinzahlen() {
        val betrag = readDouble("Wie viel Geld wollen sie einzahlen?")

        kontostand += betrag
        println("Sie haben erfolgreich $betrag € eingezahlt")
        println("Ihr neuer Kontostand: $kontostand")
    }

    // Protected, sodass andere Konto diese Methode ebenfalls nutzen können
    protected fun pinAbfrage(versuch: Int = 1): Boolean {
        println("Geben sie ihre PIN ein:")
        val pin = readln()

        return if (pin != PIN)
            if (versuch < maxPinVersuche)
                pinAbfrage(versuch + 1)
            else {
                println("Sie haben die PIN zu oft falsch eingegeben!")
                false
            }
        else {
            println("Authentifizierung erfolgreich!")
            true
        }
    }

    fun pinAendern() {
        do {
            println("Geben Sie die neue PIN für Ihr Konto ein: ")
            val pin1 = readln()

            println("Wiederholen Sie die PIN zur Bestätigung:")
            val pin2 = readln()

            if (pin1 == pin2)
                PIN = pin1
        } while (pin1 != pin2)
    }

}
