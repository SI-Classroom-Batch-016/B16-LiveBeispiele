package bank

class Kunde(
    // Name und Geburtsdatum sind bereits Teil der Basisklasse Person, deswegen kein var/val
    name: String,
    geburtsTag: String
) : Person(name, geburtsTag) {

    // Konten muss nicht Teil des Konstruktors sein:
    //  wenn ein neuer Kunde erstellt wird, hat er noch keine Konten
    private val konten: MutableList<Konto> = mutableListOf()

    fun kontoAnlegen() {
        println("Welche Art von Konto möchten Sie anlegen?")
        println("Drücken sie [1] für Girokonto")
        println("Drücken sie [2] für Kreditkonto")
        println("Drücken sie [3] für Sparkonto")

        when (readln().toIntOrNull()) {
            1 -> konten.add(Konto())
            2 -> konten.add(Kreditkonto(1000.0))
            3 -> konten.add(Sparkonto())
            else -> {
                println("Ungültige Eingabe!")
                kontoAnlegen()
            }
        }
    }

    fun geldEinzahlen() {
        println()
        if (konten.isEmpty()) {
            println("$name hat noch kein Konto und kann kein Geld einzahlen")
            return
        }

        println("Auf welches Konto möchte $name Geld einzahlen?")
        konten.forEachIndexed { index, konto ->
            println("Drücken Sie ${index + 1} für ${konto::class.simpleName}: $konto.iban")
        }

        val eingabe = readln().toIntOrNull()
        if (eingabe != null && eingabe in konten.indices) {
            val konto = konten[eingabe - 1]
            konto.geldEinzahlen()
        } else {
            println("Ungültige Eingabe. Dieses Konto existiert nicht!")
            geldEinzahlen()
        }
    }


    fun geldAbheben() {
        println()
        if (konten.isEmpty()) {
            println("$name hat noch kein Konto und kann kein Geld abheben")
            return
        }

        println("Von welchem Konto möchte $name Geld abheben?")
        val moeglicheKonten = konten.filter { it !is Sparkonto }

        moeglicheKonten.forEachIndexed { index, konto ->
            println("Drücken Sie ${index + 1} für ${konto::class.simpleName}: ${konto.iban}")
        }

        val eingabe = readln().toIntOrNull()

        if (eingabe != null && eingabe-1 in moeglicheKonten.indices) {
            val konto = moeglicheKonten[eingabe -1]
            konto.geldAbheben()
        } else {
            println("Ungültige Eingabe. Dieses Konto existiert nicht!")
            geldAbheben()
        }

    }

    fun ueberweisung(empfaengerIBAN: String) {
        assert(empfaengerIBAN.istIBAN())

        // ...
    }
}