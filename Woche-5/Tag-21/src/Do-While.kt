fun main() {
    //  Simpler 10x loop
    println("While:")
    var i: Int = 10
    while (i < 0) {
        print("$i.. ")
        i++   // i = i + 1
    }

    //  Selber Loop aber mit Do While
    println()
    println()
    println("Do While:")
    i = 0
    do {
        print("$i.. ")
        i++   // i = i + 1
    } while (i < 10)


    println()
    var anzahlVersuche = 0
    do {
        if (anzahlVersuche > 0 ){
            println("Bitte überprüfen sie ihre Eingabe")
        }
        println("Geben sie das Passwort ein (noch ${3 - anzahlVersuche} Versuche)")
        var pwEingabe = readln()
        anzahlVersuche++
    } while (pwEingabe != "admin" && anzahlVersuche < 3)

    println("Erfolgreich eingeloggt??")

}