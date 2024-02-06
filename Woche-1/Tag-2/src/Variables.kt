fun main() {

    // var steht für Variable  (variable)
    // val steht für Konstante (value)

    val minAlter: Int = 21          // Int = Integer
//    minAlter = 18       // Fehler, Konstanten kann man nicht neu belegen
    println("Das Mindestalter ist $minAlter")

    var myAge: Int = 24
    println("Mein Alter ist: $myAge")

    myAge = 30
    println("Das Alter ist jetzt: $myAge")

    myAge = myAge + 1
    println("Das Alter ist jetzt: $myAge")

    val geburtsJahr: Int = 2001    // Konstante
    var alter: Int = 2024 - geburtsJahr  // Variable

    println("Wenn ich $geburtsJahr geboren bin, bin ich jetzt $alter")

    var vorname1 : String = "Fabian"
    var vorname2 = "Niclas"
    var email: String = "Hallo94@GMAIL.COM"

    var brief: String = """
        Hallo ...,
        
            ich ...
        
            Liebe Grüße
            Gordon ❤️❤️
    """.trimIndent()

    println(brief)

    // Fehler, wenn ich falschen Datentyp verwende
//    email = 50
//    alter = "Hi"


    // Diese Var speichert, ob es regnet
    var isRaining: Boolean = true
    isRaining = false

    // Beachtet den Unterschied zwischen "val" und "var"
    val isSunny: Boolean = false
    //isSunny = true

}