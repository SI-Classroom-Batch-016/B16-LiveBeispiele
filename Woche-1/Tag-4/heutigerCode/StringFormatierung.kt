fun main(){

    // Ziel: die Zahl runden (auf gewisse Kommastellen)
    var kontostand = 1326.56576879908

    // Alt:
    println("Ihr aktuelles Guthaben: $kontostand €")

    // %.2f   -> kommazahl mit 2 nachkommastellen
    println("Ihr aktuelles Guthaben: %.2f €".format(kontostand))


    kontostand = "%.2f".format(kontostand).replace(",",".").toDouble()


    val template: String = "Ihr aktuelles Guthaben: %,.2f €"

    var kontoStandGordon = 99999.99
    var kontoStandMarianne = -128.0
    var kontoStandFelix = 812371216.81637

    println(template.format(kontoStandGordon))
    println(template.format(kontoStandMarianne))
    println(template.format(kontoStandFelix))


    // eine Zahl runden via format
//    println("Geben sie eine Kommazahl ein:")
    var kommaZahl = 123.123
    val zwischenErgebnis: String = "%.2f".format(kommaZahl)
    kommaZahl = zwischenErgebnis.replace(",",".").toDouble()


    var kommaZahlString = kommaZahl.toString().replace(".",",")
    println("Kommazahl: $kommaZahlString")




}