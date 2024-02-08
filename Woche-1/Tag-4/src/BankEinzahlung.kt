
fun main(){

    var kontostandInYen: Double = 45123.23
    val wechselkurs: Int = 142      // 1 euro = 130 Yen
//    val wechselkurs: Double = 142.0      // 1 euro = 130 Yen

    // Was ist der Kontostand in Euro?
    var kontostandInEuro: Double = kontostandInYen / wechselkurs
    println("Kontostand in Euro: $kontostandInEuro")

    // Einzahlung:
    print("Einzahlung: ")
    var einzahlung: Double = readln().toDouble()

    kontostandInEuro += einzahlung
    kontostandInYen += einzahlung * wechselkurs

    println("Ihr neuer Kontostand: $kontostandInEuro €")
    println("Ihr neuer Kontostand: $kontostandInYen ¥")

}