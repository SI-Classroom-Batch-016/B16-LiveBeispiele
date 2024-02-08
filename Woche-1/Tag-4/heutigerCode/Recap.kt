
fun main(){

    // Der Preis für ein Ticket ist festgelegt
    val ticketPreis: Double = 30.0

    // Eingabe: wie viele Tickets kaufen wir?
    println("Wählen sie aus, wie viele Tickets Sie kaufen wollen:")

//    val eingabe: String = readln()
//    val anzahlTickets = eingabe.toInt()
    val anzahlTickets: Int = readln().toInt()

    // Gesamtpreis ausrechnen und anzeigen
    var gesamtPreis: Double = ticketPreis * anzahlTickets
    println("Gesamtpreis: $gesamtPreis")

    // 20% Rabatt:
    gesamtPreis *= 0.8          // gesamtPreis = gesamtPreis * 0.8
    println("Preis nach Rabatt: $gesamtPreis")

    // 2 Gutscheine: 5€ und 10€
    gesamtPreis -= 5.0 + 10.0   // gesamtPreis = gesamtPreis - (5+10)
    println("Preis nach Gutscheinen: $gesamtPreis")

}