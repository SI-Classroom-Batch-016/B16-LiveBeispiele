
fun main(){
    // Nullable String Beispiel
    var addresse: String = "Teststraße 12, 23456 Bad Stadt"
    var addressZusatz: String? = "Hinterhaus, 2. Tür"

    addresse.uppercase()            // nicht nullable Variable -> braucht keine spezielle Behandlung
    addressZusatz?.uppercase()      // nullable Variable -> Safe Call benötigt


    // Nullable Zahlen Beispiel
    var alter: Int? = listOf(null, 20, 14, 53).random()
    println("Alter vor der Inkrementierung: $alter")

//    alter ++  // nicht möglich
    alter = alter?.plus(1)      // ergebnis von null + irgendwas = null
    // oder:
    alter = alter!! + 1

    println("Alter nach der Inkrementierung: $alter")

    // Beispiel andere Datentypen:
    val meinAuto: Auto? = Auto("BMW", 50)
    meinAuto?.beschleunigen()       // nullable Variable -> Safe Call nötig

    val deinAuto: Auto? = null
    deinAuto?.beschleunigen()

    // Liste Beispiel:
    var mittelnamen: List<String?>? = listOf("Robert")
    mittelnamen = null
    mittelnamen = listOf("Jonas", null, "Maria")

    mittelnamen?.last()

    val zufallsName: String? = mittelnamen?.random()
    zufallsName?.uppercase()
}












class Auto(val marke: String, val ps: Int){
    var aktuelleGeschwindigkeit: Int = 0
    fun beschleunigen(){
        println("Das Auto (Marke: $marke) beschleunigt")
        aktuelleGeschwindigkeit += 5
    }
}