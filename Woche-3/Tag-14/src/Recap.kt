fun main() {
    println("Willkommen zum Wechselbüro:")

    println("Geben sie einen Dollar Betrag ein:")
    var dollar: Double = readDouble()

    var euro: Double = dollarToEuro(dollar)
    println("Für Ihre ${zahlZuGeldBetrag(dollar, "$")} erhalten Sie von uns ${zahlZuGeldBetrag(euro, "€")}.")

    // Heute Sonderaktion: 1 Dollar ist 1 Euro wert!
    println("-------\nSonderaktion: 1 Euro für jeden Dollar!!")
    println("Geben sie den Dollar Betrag für die Sonderaktion ein: ")
    dollar = readDouble()

    euro = dollarToEuro(wechselKurs = 1.0, dollarBetrag = dollar)
    euro = dollarToEuro(dollarBetrag = dollar, 1.0)

    println("Für Ihre ${zahlZuGeldBetrag(dollar, "$")} erhalten Sie von uns ${zahlZuGeldBetrag(euro, "€")}.")



    zufallsZahl()
}

// Rückgabe Wert: Double
fun readDouble(): Double {
    return readln().replace(",", ".").toDouble()
}

// Rückgabe Wert: String
fun zahlZuGeldBetrag(betrag: Double, einheit: String): String {
    return "%.2f$einheit".format(betrag)
}

//"%.4f".format(5.0)

// Double Parameter
// Wechselkurs: standardmässig 0.92, aber können wir auch beliebig eingeben
fun dollarToEuro(dollarBetrag: Double, wechselKurs: Double = 0.92): Double {
    return dollarBetrag * wechselKurs
}

// String Parameter
fun dollarToEuro(dollarBetrag: String, wechselKurs: Double = 0.92): Double {
    // Diese Funktion macht sich die andere Funktion zunutze :)
    return dollarToEuro(dollarBetrag.toDouble(), wechselKurs)
}