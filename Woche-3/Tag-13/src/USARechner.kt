fun main() {

    geldBetragAnzeigen(7.99, '$')
    geldBetragAnzeigen(125.0238461726456)
    geldBetragAnzeigen(7.99)


    var wechselKurs = 0.92

    // Anhand von Argumenten wird die richtige Funktion gewählt
    var preisVon1LColaInDollar = 3.86
    val preisVon1LColaInEuro = dollarToEuro(preisVon1LColaInDollar)

    var preisPizzaInDollar = 10.53
    var preisPizzaInEuro = dollarToEuro(preisPizzaInDollar, wechselKurs)

    // Man kann die Parameter dazu schreiben
    var preisBeerInDollar = 10.53
    var preisBeerInEuro = dollarToEuro(preisBeerInDollar)

    var gesamtRechnungDollar = preisBeerInDollar + preisPizzaInDollar + preisVon1LColaInDollar
    var gesamtRechnungEuro = dollarToEuro(gesamtRechnungDollar)


    // Readln als Parameter
    println("Geben sie einen beliebigen Dollarbetrag zum Umwandeln ein:")
    /*val dollar = readln().toDouble()
    var euro = dollarToEuro(dollar)*/
    var euro = dollarToEuro(readln().toDouble())


    // CHALLENGE
    val tempNYC = 104
    val tempDALLAS = 120
    val tempLA = 95

    // TODO: Parameter für Fahrenheit To Celcius hinzufügen
    val tempNYCCelsius = fahrenheitToCelsius(tempNYC)
    val tempDALLASCelsius = fahrenheitToCelsius(tempDALLAS)
    val tempLACelsius = fahrenheitToCelsius(tempLA)


    // Imperial to Metric
//    val m = imperialToMetric(5, 11)
//    println("5'11'' sind $m Meter")

    groesseAnzeigen(5, 11)

}


val dollarToEuroKurs = 0.92
val euroToDollarKurs = 1.08

// Funktionen können gleich heißen, solange sich die Parameter unterscheiden
//     dafür sind die DATENTYPEN entscheidend !!

// Hier: Parameter: Double
fun dollarToEuro(betrag: Double): Double {
    var euro = dollarToEuroKurs * betrag
    return euro
}

// Hier: Parameter: String
fun dollarToEuro(betrag: String): Double {
    var euro = dollarToEuroKurs * betrag.toDouble()
    return euro
}


// Parameter immer in Camelcase
fun dollarToEuro(betrag: Double, wechselKurs: Double = dollarToEuroKurs): Double {
    // 1 $ = 0.94 €
    // 1 € = 1 / 0.94 $
    var euro = wechselKurs * betrag
    return euro
}

fun fahrenheitToCelsius(fahrenheit: Int): Int {
    // °C = [(°F-32)×5]/9

    val celsius = (fahrenheit - 32) * 5 / 9
    return celsius
}

// TODO: Parameter einbauen für bessere Nutzung
fun imperialToMetric(): Double {
    // 1 foot = 12 Inches
    // 1 inch = 2.54 cm

    println("Geben sie zuerst die Feet ein, bestätigen sie mit Enter, dann die Inches:")
    var feet = readln().toInt()
    var inch = readln().toInt()

    var cm = (feet * 12 + inch) * 2.54
    var m = cm / 100

    return m
}

fun imperialToMetric(feet: Int, inch: Int): Double {
    var cm = (feet * 12 + inch) * 2.54
    var m = cm / 100

    return m
}

