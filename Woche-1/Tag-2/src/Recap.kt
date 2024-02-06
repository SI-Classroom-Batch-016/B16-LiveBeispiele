fun main() {
    /*
        Dieses kleine Programm simuliert einen Registrierungsprozess:
            Zuerst fragt es nach einem Usernamen,
            dann ein Passwort
            Als Letztes wird eine Bestätigung ausgedruckt.
     */

    // Username abfragen
    println("Username: (bestätigen mit Enter)")
    var username = readln()

    // Passwort abfragen
    println("Password: ")
    val pw = readln()

    // Bestätigung
    println("Ihr neuer Account wurde erstellt mit den folgenden Daten: ")
    println(" Username: $username \n Passwort: $pw")

}


