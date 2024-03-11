fun main() {
    // Beispiel: Wenn Schleife einmal beendet ist, ist sie auch vorbei
    var scheibenWischerAn = true
    while(scheibenWischerAn){
        println("...")
        scheibenWischerAn = false
    }
    scheibenWischerAn = true


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
    i = 10
    do {
        print("$i.. ")
        i++   // i = i + 1
    } while (i < 10)


    println()
    var anzahlVersuche = 0
    var login = false
    do {
        if (anzahlVersuche > 0 ){
            println("Bitte überprüfen sie ihre Eingabe")
        }
        println("Geben sie das Passwort ein (noch ${3 - anzahlVersuche} Versuche)")
        var pwEingabe = readln()
        anzahlVersuche++

        login = pwEingabe == "admin"
    } while (pwEingabe != "admin" && anzahlVersuche < 3)

    if (login)
        println("Erfolgreich eingeloggt?")
    else
        println("maximale Anzahl versuche erreicht")

}