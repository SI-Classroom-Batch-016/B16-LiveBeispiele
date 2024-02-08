import banking.*
import kotlin.math.roundToInt

fun main(){
    var kontostandInYen: Double = 45123.23

//    val wechselkurs: Double = 142.0      // 1 euro = 130 Yen

    // Was ist der Kontostand in Euro?
    var kontostandInEuro: Double = kontostandInYen / wechselKursEuroToYen
    println("Kontostand in Euro: $kontostandInEuro")

    // Einzahlung:
    print("Einzahlung: ")
    val einzahlung: Double = readln().toDouble()

    kontostandInEuro = kontostandInEuro + einzahlung
    kontostandInYen += einzahlung * wechselKursEuroToYen

    // Kontostand Runden:
    kontostandInYen = (kontostandInYen * 100).roundToInt() / 100.0

    println("Ihr neuer Kontostand: $kontostandInEuro €")
    println("Ihr neuer Kontostand: $kontostandInYen ¥")

}


