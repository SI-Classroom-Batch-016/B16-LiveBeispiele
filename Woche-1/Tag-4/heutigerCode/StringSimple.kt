
fun main(){

    var testString = "Mein Name ist Bond, James Bond"
    testString = testString.replace("Bond", "Meier")
    println(testString)

    println(testString.lowercase())
    println(testString.uppercase())

    println("Geben sie ein: ja/nein")   // Ja, ja, JA, nein, NEIN, nEiN
    var bestaetigung = readln().lowercase()

    // contains = enthält
    // equals = ist Gleich
    val hatJaEingeben: Boolean = bestaetigung.equals("ja")
    println("Wurde 'ja' eingegeben: $hatJaEingeben")




    println("Geben sie eine Kommazahl ein:")
    var eingabe: String = readln()
    eingabe = eingabe.replace(",", ".")     // tausche alle Kommas gegen Punkte
    var kommaZahl: Double = eingabe.toDouble()
    println(kommaZahl)


    // Eine Kommazahl als Deutsche einlesen:
    var kommaZahl2 = readln().replace(',', '.').toDouble()
}