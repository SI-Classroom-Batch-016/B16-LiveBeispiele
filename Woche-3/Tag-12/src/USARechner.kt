
fun main(){

    val gehaltInDollar = euroToDollar()
    println("12 Monatsgehalte sind: ${gehaltInDollar * 12} $")

    val euro = dollarToEuro()
    println("12 Monatsgehalte sind: ${euro * 12}")


    val celcius = fahrenheitToCelsius()

    val meter = imperialToMetric()

}


fun euroToDollar(): Double{
    println("Geben sie den Betrag in Euro ein:")
    val euroBetrag = readln().toDouble()
    val dollarBetrag = 1.08 * euroBetrag

    println("$euroBetrag € sind $dollarBetrag $")

    return dollarBetrag // TODO: richtigen Return-wert einsetzen
}

fun dollarToEuro(): Double{
    // 1 $ = 0.94 €
    // 1 € = 1 / 0.94 $
    println("Geben sie den Betrag in $ ein:")
    var dollar = readln().toDouble()
    var euro = 1 / 0.94 * dollar

    return euro
}

fun fahrenheitToCelsius(): Int {
    // °C = [(°F-32)×5]/9
//    println("Geben sie jetzt die Temperatur in °F ein:")
    val fahrenheit = temperaturSensor()
    val celsius = (fahrenheit-32) * 5 / 9
    return celsius
}

fun temperaturSensor(): Int{
    return (40..120).random()
}

fun imperialToMetric(): Double{
    // 1 foot = 12 Inches
    // 1 inch = 2.54 cm

    println("Geben sie zuerst die Feet ein, bestätigen sie mit Enter, dann die Inches:")
    var feet = readln().toInt()
    var inch = readln().toInt()

    var cm = (feet * 12 + inch) * 2.54
    var m = cm / 100

    return m
}