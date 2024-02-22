val rot = "\u001B[31m"
val gruen = "\u001B[32m"
val gelb = "\u001B[33m"

fun main() {

    println(
        """
        Name: ${textInFarbe("Gordon", rot)}
        Alter: ${textInFarbe(29.toString(), gruen)}
    """.trimIndent()
    )

}

fun groesseAnzeigen(feet: Int, inch: Int) {
    var m = imperialToMetric(feet, inch)

    println("$feet'$inch'' sind ${"%.2f".format(m)}m.")

}

fun geldBetragAnzeigen(betrag: Double, einheit: Char = '€') {
    println("%.2f$einheit".format(betrag))
}


fun textInFarbe(text: String, farbe: String): String {
    return "$farbe$text\u001B[0m"   // [0m = reset
}

