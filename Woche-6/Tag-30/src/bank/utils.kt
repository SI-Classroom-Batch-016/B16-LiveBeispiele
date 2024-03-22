package bank

// Normalerweise würden diese Daten automatisch generiert werden: zB via java.time.LocalDate.now()
val aktuellerTag = 22
val aktuellerMonat = 3
val aktuellesJahr = 2024

/**
 * Überprüft, ob ein String ein gültiges Datum im Format "TT.MM.JJJJ" darstellt.
 * Das Datum muss 10 Zeichen lang sein und aus Tag, Monat und Jahr bestehen.
 * Tag, Monat und Jahr müssen gültige Zahlen sein.
 * Das Datum muss gültige Werte enthalten, z. B. der Monat muss im Bereich von 1 bis 12 liegen.
 *
 * @return true, wenn der String ein gültiges Datum ist, andernfalls false.
 */
fun String.istDatum(): Boolean {
    // Ein String ist ein Datum wenn es in diesem Format ist:
    //  TT.MM.JJJJ
    // Das Datum kann max. 10 Zeichen lang sein
    if (this.length > 10)
        return false

    // Das Datum muss aus 3 Teilen bestehen
    val daten = this.split(".")
    if (daten.size != 3 )
        return false

    // Tag, Monat und Jahr müssen Zahlen sein
    val tag = daten[0].toIntOrNull()
    val monat = daten[1].toIntOrNull()
    val jahr = daten[2].toIntOrNull()

    if (tag == null || monat == null || jahr == null)
        return false

    // Die Daten müssen gültig sein, zb machen Monat nur Sinn zw. 1-12
    if (tag !in 1..31 && monat !in 1..12 && jahr !in 1900..2025)
        return false

    return true
}

/**
 * Wandelt einen String, der ein gültiges Datum im Format "TT.MM.JJJJ" repräsentiert, in das Alter um.
 * @return Das Alter, das aus dem gegebenen Datum berechnet wird.
 * @throws AssertionError Wenn der String kein gültiges Datum im erwarteten Format ist.
 */
fun String.zuAlter(): Int {
    // Zuerst sicherstellen, dass der String ein gültiges Datum ist
    assert(this.istDatum())

    val daten = this.split(".")
    val tag = daten[0].toInt()
    val monat = daten[1].toInt()
    val jahr = daten[2].toInt()

    var alter = aktuellesJahr - jahr

    // Falls Person dieses Jahr noch kein Geburtstag hat, wird ein Jahr abgezogen.
    if (monat > aktuellerMonat)
        alter --

    if (monat == aktuellerMonat && tag > aktuellerTag)
        alter --

    return alter

}

/**
 * Überprüft, ob ein String eine gültige IBAN ist.
 *
 * @return true, wenn die IBAN gültig ist, andernfalls false.
 */
fun String.istIBAN(): Boolean {
    // Prüft, ob die IBAN die richtige Länge hat
        // (mindestens zwei Zeichen für das Länderkürzel und zwei Zeichen für die Prüfziffer)
    if (this.length !in 4..34)
        return false

    // Prüfen, ob die ersten beiden Zeichen Buchstaben sind (Länderkürzel)
    val laenderkuerzel = this.substring(0, 2)
    if (!laenderkuerzel.all { it.isLetter() })
        return false

    // Prüfen, ob die nachfolgenden Zeichen Ziffern oder Buchstaben sind (Kontonummer)
    val kontonummer = this.substring(2)
    if (kontonummer.any { !it.isLetterOrDigit() })
        return false

    return true
}

/**
 * Liest eine Zahl vom Typ Double aus der Nutzereingabe ein, nachdem die übergebene Nachricht ausgegeben wurde.
 *
 * @param prompt Die Nachricht, die ausgegeben wird, um den Nutzer/die Nutzerin zur Eingabe aufzufordern.
 * @return Der eingegebene Double-Wert.
 */
fun readDouble(prompt: String): Double {
    println(prompt)
    val betrag = readln().toDoubleOrNull()

    // Wenn der Betrag null ist, wird die Funktion neu gestartet
    return betrag ?: readDouble(prompt)
}

/**
 * Generiert eine zufällige IBAN.
 */
fun ibanGenerator(): String{
    var iban = "DE"

    val laenge = (20..34).random()

    while (iban.length < laenge){
        val zufallsCharacter = ('A'..'Z').random()
        iban = iban.padEnd(iban.length+1, zufallsCharacter)
    }

    return iban
}

/**
    Generiert einen zufälligen Buchstaben (A..Z) oder Ziffer (0..9)
 */
private fun zufallsCharacter(): Char {
    return listOf(
        ('A'..'Z').random(),
        ('0'..'9').random()
    ).random()
}