package bank

// Diese Eigenschaft
val maxPinVersuche = 3

private val mitarbeiter: MutableList<Mitarbeiter> = mutableListOf()
private val kunden: MutableList<Kunde> = mutableListOf()

fun main(){
    // Die Mitarbeiter der Bank initialisieren
    val chef = Mitarbeiter("Dagobert Duck", "12.3.1947", 1000000.0)
    mitarbeiter.add(chef)

    mitarbeiter.add(Mitarbeiter("Tick", "5.11.1987", 333.33))
    mitarbeiter.add(Mitarbeiter("Trick", "5.11.1987", 333.33))
    mitarbeiter.add(Mitarbeiter("Track", "5.11.1987", 333.33))


    // Einige Kunden initialisieren
    val mickyMaus = Kunde("Micky Maus", "11.8.1994")
    kunden.add(mickyMaus)
    mickyMaus.kontoAnlegen()
    kunden[0].kontoAnlegen()

    mickyMaus.geldAbheben()


    kunden.add(Kunde("Goofy", "12.12.1985"))
    kunden[1].kontoAnlegen()
    kunden[1].geldEinzahlen()

    println("An welche IBAN soll Goofy überweisen?")
    val iban = readln()
    kunden[1].ueberweisung(iban)

}